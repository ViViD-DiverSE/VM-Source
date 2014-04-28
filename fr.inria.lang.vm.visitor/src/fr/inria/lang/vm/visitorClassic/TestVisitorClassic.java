/**
 * 
 */
package fr.inria.lang.vm.visitorClassic;


/**
 * @author mauricioalferez.com
 *
 */
public class TestVisitorClassic {
	//static String vmFilePath = "/Users/ealferez/git/VM/fr.inria.lang.vm.examples.MOTIV/VideoContent.vm";
	static String vmFilePath = "/Users/ealferez/git/VM/fr.inria.lang.vm.examples.MOTIV/VMLanguageExample.vm";
	static String luaConfFilesBaseName = "/Users/ealferez/git/VM/fr.inria.lang.vm.examples.MOTIV/TestDataLuaConfigFiles/conf";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		VMVisitorClassic myVisitor = new VMVisitorClassic();
		myVisitor.visit(vmFilePath,luaConfFilesBaseName);
	}

}
