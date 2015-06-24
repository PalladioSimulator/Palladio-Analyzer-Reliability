/**
 */
package org.palladiosimulator.reliability.markov;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Chain</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.reliability.markov.MarkovChain#getStates <em>States</em>}</li>
 * <li>{@link org.palladiosimulator.reliability.markov.MarkovChain#getTransitions
 * <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.reliability.markov.MarkovPackage#getMarkovChain()
 * @model
 * @generated
 */
public interface MarkovChain extends Entity {

    /**
     * Returns the value of the '<em><b>States</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.reliability.markov.State}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>States</em>' containment reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>States</em>' containment reference list.
     * @see org.palladiosimulator.reliability.markov.MarkovPackage#getMarkovChain_States()
     * @model containment="true"
     * @generated
     */
    EList<State> getStates();

    /**
     * Returns the value of the '<em><b>Transitions</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.reliability.markov.Transition}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Transitions</em>' containment reference list.
     * @see org.palladiosimulator.reliability.markov.MarkovPackage#getMarkovChain_Transitions()
     * @model containment="true"
     * @generated
     */
    EList<Transition> getTransitions();

} // MarkovChain
