/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.dialogFlow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phrase Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.dialogFlow.PhraseValue#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage#getPhraseValue()
 * @model
 * @generated
 */
public interface PhraseValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.dialogFlow.Mapping}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage#getPhraseValue_Mapping()
   * @model containment="true"
   * @generated
   */
  EList<Mapping> getMapping();

} // PhraseValue
