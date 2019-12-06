/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.FunctionCall#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends AbstractFunctionCall
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' reference.
   * @see #setFunction(FunctionDefinition)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionCall_Function()
   * @model
   * @generated
   */
  FunctionDefinition getFunction();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.FunctionCall#getFunction <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(FunctionDefinition value);

} // FunctionCall
