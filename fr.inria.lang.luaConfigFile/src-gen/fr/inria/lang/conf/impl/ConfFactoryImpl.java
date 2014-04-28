/**
 */
package fr.inria.lang.conf.impl;

import fr.inria.lang.conf.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfFactoryImpl extends EFactoryImpl implements ConfFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConfFactory init()
  {
    try
    {
      ConfFactory theConfFactory = (ConfFactory)EPackage.Registry.INSTANCE.getEFactory(ConfPackage.eNS_URI);
      if (theConfFactory != null)
      {
        return theConfFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ConfFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ConfPackage.LUA_CONFIG_FILE: return createLuaConfigFile();
      case ConfPackage.ASSIGNMENT: return createAssignment();
      case ConfPackage.GENERATED_COMMENT: return createGeneratedComment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuaConfigFile createLuaConfigFile()
  {
    LuaConfigFileImpl luaConfigFile = new LuaConfigFileImpl();
    return luaConfigFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneratedComment createGeneratedComment()
  {
    GeneratedCommentImpl generatedComment = new GeneratedCommentImpl();
    return generatedComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfPackage getConfPackage()
  {
    return (ConfPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ConfPackage getPackage()
  {
    return ConfPackage.eINSTANCE;
  }

} //ConfFactoryImpl
