package fr.inria.lang.vm.visitorClassic;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.inria.lang.LuaConfigFileStandaloneSetup;
import fr.inria.lang.VMStandaloneSetup;
import fr.inria.lang.conf.Assignment;
import fr.inria.lang.conf.ConfFactory;
import fr.inria.lang.conf.ConfPackage;
import fr.inria.lang.conf.GeneratedComment;
import fr.inria.lang.conf.LuaConfigFile;
import fr.inria.lang.vM.ComplexExpression;
import fr.inria.lang.vM.Configuration;
import fr.inria.lang.vM.Configurations;
import fr.inria.lang.vM.Constraint;
import fr.inria.lang.vM.Constraints;
import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.FeatureDefinition;
import fr.inria.lang.vM.FeatureHierarchy;
import fr.inria.lang.vM.FeaturesGroup;
import fr.inria.lang.vM.LeftImplication;
import fr.inria.lang.vM.Model;
import fr.inria.lang.vM.Orgroup;
import fr.inria.lang.vM.PackageDeclaration;
import fr.inria.lang.vM.Relationships;
import fr.inria.lang.vM.RightImplication;
import fr.inria.lang.vM.VmBlock;
import fr.inria.lang.vM.Xorgroup;

/**
 * @author mauricioalferez.com
 * 
 *         This is just a classic visitor and not a formatter, logger or
 *         pretty-printer. I just added output messages as place-holders. We
 *         believe this may be an easy first step for starters to create their
 *         own parsers, interpreters, readers, formatters, etc.
 * 
 *         There are other tools to read a .vm model, for example, the
 *         Polymorphic dispatcher, the VMSwitch (in fr.inria.lang.vm) and the
 *         org.eclipse.xtext.util.XtextSwitch.
 */

public class VMVisitorClassic {

	public void visit(String vmFilePath, String luaConfFilesBaseName) {
		Model model = VMSetup(vmFilePath);
		EList<VmBlock> bl = getModelBlocks(model);
		OUT("there are "+bl.size()+" blocks in the default namespace");
		visitBlocks(bl);
		//Uncomment to try generating Lua Config Files
		//OUT("Creating and saving in a File 10 randomly generated LUA configurations of 3 attributes each");
		//createAndSaveConfigurations(luaConfFilesBaseName, 10, 3);
	}

	/**
	 * @param bl
	 */
	private void visitBlocks(EList<VmBlock> bl) {
		for (VmBlock b : bl) {
			if (b instanceof PackageDeclaration) {
				PackageDeclaration pd=(PackageDeclaration)b;
				OUT("Obtaining VM elements in Package: " +pd.getName());
				OUT("\t there are "+pd.getBlocks().size()+" blocks inside the namespace:" +pd.getName());
				visitBlocks(pd.getBlocks());
			}
			if (b instanceof Relationships) {
				OUT("\nObtaining VM relationships...");
				obtainRelationships((Relationships) b);
			}
			if (b instanceof Constraints) {
				OUT("\nObtaining VM constraints...");
				obtainConstriants((Constraints) b);
			}
			if (b instanceof Configurations) {
				OUT("\nObtaining VM configurations...");
				obtainConfigurations((Configurations) b);
			}
		}
	}

	/**
	 * @param model
	 * @return
	 */
	private EList<VmBlock> getModelBlocks(Model model) {
		if (model.getBlocks() == null) {
			System.err.println("--ERROR-- empty model ");
			System.exit(0);
		} 
		return model.getBlocks();
	}

	private void createAndSaveConfigurations(String luaConfFilesBaseName, int maximumConfigFiles, int maximumNumberOfRows) {
		OUT("Creating" + maximumConfigFiles
				+ " different configurations");
		int currentConfNumber;
		for (currentConfNumber = 1; currentConfNumber <= 10; currentConfNumber++) {
			// Initialize the model
			ConfPackage.eINSTANCE.eClass();
			// Retrieve the default factory singleton
			ConfFactory luaCFFoctory = ConfFactory.eINSTANCE;
			// create the a Lua configuration
			LuaConfigFile myLuaCF = luaCFFoctory.createLuaConfigFile();
			// create 2 rows, one comment and two assignments as the content of
			// the configuration
			GeneratedComment myComment = luaCFFoctory.createGeneratedComment();
			myComment.setValue("This is the Lua configuration file number: "
					+ currentConfNumber); // it is not necessary to write the
											// '--' of lua
			myLuaCF.getRows().add(myComment);
			int currentRowNumber;
			for (currentRowNumber = 2; currentRowNumber <= maximumNumberOfRows; currentRowNumber++) {
				OUT("	Creating row:" + currentRowNumber
						+ " in configuration:" + currentConfNumber);
				Assignment myLuaCFAssingment = luaCFFoctory.createAssignment();
				myLuaCFAssingment.setFeature("featureX");
				myLuaCFAssingment.setAttribute("attributeY");
				myLuaCFAssingment.setValue("value");
				myLuaCF.getRows().add(myLuaCFAssingment);
			}

			OUT("Created Configuration " + currentConfNumber);

			Injector luaInjector = new LuaConfigFileStandaloneSetup()
					.createInjectorAndDoEMFRegistration();
			XtextResourceSet resourceSet = luaInjector
					.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
					Boolean.TRUE);
			Resource luaConfFilesResource = resourceSet.createResource(URI
					.createURI(luaConfFilesBaseName + currentConfNumber
							+ ".conf"));
			luaConfFilesResource.getContents().add(myLuaCF);
			// now save the content.
			try {
				luaConfFilesResource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// for
	}

	private void obtainConfigurations(Configurations con) {
		if (con.getConfigurations() != null) {
			for (Configuration conf : con.getConfigurations()) {
				OUT("Do something with Configuration: "
						+ conf.getName());
			}
		} else {
			OUT("There are not configurations to visit");
		}
	}

	/**
	 * @param VM
	 *            file Path
	 * @return VM model
	 */
	private Model VMSetup(String vmFilePath) {
		Injector injector = new VMStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector
				.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(vmFilePath),
				true);
		Model model = (Model) resource.getContents().get(0);
		return model;
	}

	private void obtainConstriants(Constraints cons) {
		EList<Constraint> con = cons.getConstraints();
		for (Constraint co : con) {
			ComplexExpression cex = (ComplexExpression) co.getExpression();
			if (cex instanceof RightImplication) {
				RightImplication ri = (RightImplication) cex;
				OUT("Do something with RightImplication"
						+ " left:" + (ComplexExpression) ri.getLeft()
						+ " right:" + (ComplexExpression) ri.getRight());
			} else if (cex instanceof LeftImplication) {
				LeftImplication li = (LeftImplication) cex;
				OUT("Do something with LeftImplication"
						+ " left:" + (ComplexExpression) li.getLeft()
						+ " right:" + (ComplexExpression) li.getRight());
			}
			// OUT("clase"+cex.eClass().getName());
		}
	}

	/**
	 * @param b
	 */
	private void obtainRelationships(Relationships rel) {
		//Relationships rel = b.getVm().getRelationships();
		FeatureHierarchy fhs = rel.getRoot();
		if (fhs.getParent().isOptional()) {
			System.err
					.println("--SEMANTIC ERROR-- (NOT POSSIBLE TO HAVE OPTIONAL ROOT)"
							+ "\nDo something with Optional Root feature: "
							+ (fhs.getParent().getName()));
		} else if (!(fhs.getParent().isOptional())) {
			OUT("Do something with Mandatory Root feature: "
					+ (fhs.getParent().getName()));
		}
		visitFeatureHierarchy(fhs);
	}

	/**
	 * @param fh
	 */
	private void visitFeatureHierarchy(FeatureHierarchy fh) {
		EList<FeatureDefinition> fhchildren = fh.getChildren();
		for (FeatureDefinition fd : fhchildren) {
			if (fd instanceof Feature) {
				fr.inria.lang.vM.Feature f = (fr.inria.lang.vM.Feature) fd;
				if (f.isOptional()) {
					OUT("Do something with Optional feature: "
							+ f.getName());
				} else if (!f.isOptional()) {
					OUT("Do something with Mandatory feature: "
							+ f.getName());
				}
			} else if (fd instanceof FeaturesGroup) {
				FeaturesGroup group = (FeaturesGroup) fd;
				EList<FeatureDefinition> groupedFeatures = group
						.getGroupedFeatures();
				for (FeatureDefinition fdef : groupedFeatures) {
					if (fdef instanceof Feature) {
						OUT("Do something with Grouped feature: "
										+ ((Feature) fdef).getName());
					} else if (fdef instanceof FeatureHierarchy) {
						OUT("Do something with Grouped FeatureHierarchy: "
										+ (((FeatureHierarchy) fdef)
												.getParent().getName()));
						visitFeatureHierarchy((FeatureHierarchy) fdef);
					}
				}
				if (fd instanceof Xorgroup) {
					OUT("Do something with Xor Group");
				} else if (fd instanceof Orgroup) {
					OUT("Do something with Or Group");
				}
			} else if (fd instanceof FeatureHierarchy) {
				if (((FeatureHierarchy) fd).getParent().isOptional()) {
					OUT("Do something with Optional parent feature :"
									+ ((FeatureHierarchy) fd).getParent()
											.getName());
				} else if (!((FeatureHierarchy) fd).getParent().isOptional()) {
					OUT("Do Something with Mandatory Parent feature"
									+ ((FeatureHierarchy) fd).getParent()
											.getName());
				}
				visitFeatureHierarchy((FeatureHierarchy) fd);
			}
		}
	}
	void OUT(String l){//not need for log4j ;-)
		System.out.println(l);
	}
}