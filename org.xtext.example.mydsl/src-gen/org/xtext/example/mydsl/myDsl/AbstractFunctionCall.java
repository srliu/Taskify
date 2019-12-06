/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.AbstractFunctionCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAbstractFunctionCall()
 * @model
 * @generated
 */
public interface AbstractFunctionCall extends AtomicOrFunctionCall
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Atomic}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAbstractFunctionCall_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Atomic> getParameters();

} // AbstractFunctionCall