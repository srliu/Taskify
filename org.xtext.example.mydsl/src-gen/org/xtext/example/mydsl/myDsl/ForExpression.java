/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForExpression#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForExpression#getTest <em>Test</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForExpression#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForExpression#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForExpression()
 * @model
 * @generated
 */
public interface ForExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial</em>' containment reference.
   * @see #setInitial(OperationExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForExpression_Initial()
   * @model containment="true"
   * @generated
   */
  OperationExpression getInitial();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForExpression#getInitial <em>Initial</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial</em>' containment reference.
   * @see #getInitial()
   * @generated
   */
  void setInitial(OperationExpression value);

  /**
   * Returns the value of the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' containment reference.
   * @see #setTest(OperationExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForExpression_Test()
   * @model containment="true"
   * @generated
   */
  OperationExpression getTest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForExpression#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(OperationExpression value);

  /**
   * Returns the value of the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update</em>' containment reference.
   * @see #setUpdate(OperationExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForExpression_Update()
   * @model containment="true"
   * @generated
   */
  OperationExpression getUpdate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForExpression#getUpdate <em>Update</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update</em>' containment reference.
   * @see #getUpdate()
   * @generated
   */
  void setUpdate(OperationExpression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForExpression_Body()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getBody();

} // ForExpression