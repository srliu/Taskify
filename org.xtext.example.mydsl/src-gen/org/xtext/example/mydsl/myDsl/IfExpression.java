/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.IfExpression#getIfcondition <em>Ifcondition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.IfExpression#getIfbody <em>Ifbody</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.IfExpression#getElsecondition <em>Elsecondition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.IfExpression#getElseifbody <em>Elseifbody</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.IfExpression#getElsebody <em>Elsebody</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Ifcondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifcondition</em>' containment reference.
   * @see #setIfcondition(OperationExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIfExpression_Ifcondition()
   * @model containment="true"
   * @generated
   */
  OperationExpression getIfcondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.IfExpression#getIfcondition <em>Ifcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifcondition</em>' containment reference.
   * @see #getIfcondition()
   * @generated
   */
  void setIfcondition(OperationExpression value);

  /**
   * Returns the value of the '<em><b>Ifbody</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifbody</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIfExpression_Ifbody()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getIfbody();

  /**
   * Returns the value of the '<em><b>Elsecondition</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.OperationExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsecondition</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIfExpression_Elsecondition()
   * @model containment="true"
   * @generated
   */
  EList<OperationExpression> getElsecondition();

  /**
   * Returns the value of the '<em><b>Elseifbody</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseifbody</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIfExpression_Elseifbody()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getElseifbody();

  /**
   * Returns the value of the '<em><b>Elsebody</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsebody</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIfExpression_Elsebody()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getElsebody();

} // IfExpression