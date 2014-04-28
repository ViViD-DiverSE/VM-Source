/**
 */
package fr.inria.lang.conf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.lang.conf.ConfFactory
 * @model kind="package"
 * @generated
 */
public interface ConfPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "conf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.inria.fr/lang/LuaConfigFile";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "conf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ConfPackage eINSTANCE = fr.inria.lang.conf.impl.ConfPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.inria.lang.conf.impl.LuaConfigFileImpl <em>Lua Config File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.conf.impl.LuaConfigFileImpl
   * @see fr.inria.lang.conf.impl.ConfPackageImpl#getLuaConfigFile()
   * @generated
   */
  int LUA_CONFIG_FILE = 0;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LUA_CONFIG_FILE__ROWS = 0;

  /**
   * The number of structural features of the '<em>Lua Config File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LUA_CONFIG_FILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.conf.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.conf.impl.AssignmentImpl
   * @see fr.inria.lang.conf.impl.ConfPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 1;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VALUE = 2;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.conf.impl.GeneratedCommentImpl <em>Generated Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.conf.impl.GeneratedCommentImpl
   * @see fr.inria.lang.conf.impl.ConfPackageImpl#getGeneratedComment()
   * @generated
   */
  int GENERATED_COMMENT = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED_COMMENT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Generated Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED_COMMENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fr.inria.lang.conf.LuaConfigFile <em>Lua Config File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lua Config File</em>'.
   * @see fr.inria.lang.conf.LuaConfigFile
   * @generated
   */
  EClass getLuaConfigFile();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.conf.LuaConfigFile#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see fr.inria.lang.conf.LuaConfigFile#getRows()
   * @see #getLuaConfigFile()
   * @generated
   */
  EReference getLuaConfigFile_Rows();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.conf.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see fr.inria.lang.conf.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.conf.Assignment#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see fr.inria.lang.conf.Assignment#getFeature()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Feature();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.conf.Assignment#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see fr.inria.lang.conf.Assignment#getAttribute()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Attribute();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.conf.Assignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.conf.Assignment#getValue()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.conf.GeneratedComment <em>Generated Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generated Comment</em>'.
   * @see fr.inria.lang.conf.GeneratedComment
   * @generated
   */
  EClass getGeneratedComment();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.conf.GeneratedComment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.conf.GeneratedComment#getValue()
   * @see #getGeneratedComment()
   * @generated
   */
  EAttribute getGeneratedComment_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ConfFactory getConfFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.inria.lang.conf.impl.LuaConfigFileImpl <em>Lua Config File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.conf.impl.LuaConfigFileImpl
     * @see fr.inria.lang.conf.impl.ConfPackageImpl#getLuaConfigFile()
     * @generated
     */
    EClass LUA_CONFIG_FILE = eINSTANCE.getLuaConfigFile();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LUA_CONFIG_FILE__ROWS = eINSTANCE.getLuaConfigFile_Rows();

    /**
     * The meta object literal for the '{@link fr.inria.lang.conf.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.conf.impl.AssignmentImpl
     * @see fr.inria.lang.conf.impl.ConfPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__FEATURE = eINSTANCE.getAssignment_Feature();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__ATTRIBUTE = eINSTANCE.getAssignment_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.conf.impl.GeneratedCommentImpl <em>Generated Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.conf.impl.GeneratedCommentImpl
     * @see fr.inria.lang.conf.impl.ConfPackageImpl#getGeneratedComment()
     * @generated
     */
    EClass GENERATED_COMMENT = eINSTANCE.getGeneratedComment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATED_COMMENT__VALUE = eINSTANCE.getGeneratedComment_Value();

  }

} //ConfPackage
