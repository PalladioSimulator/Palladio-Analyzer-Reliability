/**
 */
package org.palladiosimulator.reliability.markov;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Transition</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.reliability.markov.Transition#getProbability
 * <em>Probability</em>}</li>
 * <li>{@link org.palladiosimulator.reliability.markov.Transition#getFromState <em>From State</em>}
 * </li>
 * <li>{@link org.palladiosimulator.reliability.markov.Transition#getToState <em>To State</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.reliability.markov.MarkovPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Entity {

    /**
     * Returns the value of the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Probability</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Probability</em>' attribute.
     * @see #setProbability(double)
     * @see org.palladiosimulator.reliability.markov.MarkovPackage#getTransition_Probability()
     * @model required="true"
     * @generated
     */
    double getProbability();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.reliability.markov.Transition#getProbability
     * <em>Probability</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Probability</em>' attribute.
     * @see #getProbability()
     * @generated
     */
    void setProbability(double value);

    /**
     * Returns the value of the '<em><b>From State</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From State</em>' reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>From State</em>' reference.
     * @see #setFromState(State)
     * @see org.palladiosimulator.reliability.markov.MarkovPackage#getTransition_FromState()
     * @model required="true"
     * @generated
     */
    State getFromState();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.reliability.markov.Transition#getFromState <em>From State</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>From State</em>' reference.
     * @see #getFromState()
     * @generated
     */
    void setFromState(State value);

    /**
     * Returns the value of the '<em><b>To State</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To State</em>' reference isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>To State</em>' reference.
     * @see #setToState(State)
     * @see org.palladiosimulator.reliability.markov.MarkovPackage#getTransition_ToState()
     * @model required="true"
     * @generated
     */
    State getToState();

    /**
     * Sets the value of the '{@link org.palladiosimulator.reliability.markov.Transition#getToState
     * <em>To State</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>To State</em>' reference.
     * @see #getToState()
     * @generated
     */
    void setToState(State value);

} // Transition
