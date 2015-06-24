/**
 */
package org.palladiosimulator.reliability.markov;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.reliability.markov.MarkovPackage
 * @generated
 */
public interface MarkovFactory extends EFactory {

    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    MarkovFactory eINSTANCE = org.palladiosimulator.reliability.markov.impl.MarkovFactoryImpl.init();

    /**
     * Returns a new object of class '<em>State</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>State</em>'.
     * @generated
     */
    State createState();

    /**
     * Returns a new object of class '<em>Transition</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Transition</em>'.
     * @generated
     */
    Transition createTransition();

    /**
     * Returns a new object of class '<em>Chain</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Chain</em>'.
     * @generated
     */
    MarkovChain createMarkovChain();

    /**
     * Returns a new object of class '<em>Entity</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return a new object of class '<em>Entity</em>'.
     * @generated
     */
    Entity createEntity();

    /**
     * Returns a new object of class '<em>Label</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Label</em>'.
     * @generated
     */
    Label createLabel();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    MarkovPackage getMarkovPackage();

} // MarkovFactory
