/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.dialogFlow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.dialogFlow.Actions#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage#getActions()
 * @model
 * @generated
 */
public interface Actions extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.dialogFlow.ActionValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage#getActions_Actions()
   * @model containment="true"
   * @generated
   */
  EList<ActionValue> getActions();

} // Actions
