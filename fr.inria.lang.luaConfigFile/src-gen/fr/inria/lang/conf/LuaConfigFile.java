/**
 */
package fr.inria.lang.conf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lua Config File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.conf.LuaConfigFile#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.conf.ConfPackage#getLuaConfigFile()
 * @model
 * @generated
 */
public interface LuaConfigFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see fr.inria.lang.conf.ConfPackage#getLuaConfigFile_Rows()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getRows();

} // LuaConfigFile
