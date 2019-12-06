/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.VariableReference#getVariableReference <em>Variable Reference</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends Atomic
{
  /**
   * Returns the value of the '<em><b>Variable Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Reference</em>' reference.
   * @see #setVariableReference(VariableSymbol)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVariableReference_VariableReference()
   * @model
   * @generated
   */
  VariableSymbol getVariableReference();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.VariableReference#getVariableReference <em>Variable Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Reference</em>' reference.
   * @see #getVariableReference()
   * @generated
   */
  void setVariableReference(VariableSymbol value);

} // VariableReference
