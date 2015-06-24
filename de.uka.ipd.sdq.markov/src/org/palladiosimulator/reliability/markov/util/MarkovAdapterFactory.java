/**
 */
package org.palladiosimulator.reliability.markov.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.reliability.markov.Entity;
import org.palladiosimulator.reliability.markov.Label;
import org.palladiosimulator.reliability.markov.MarkovChain;
import org.palladiosimulator.reliability.markov.MarkovPackage;
import org.palladiosimulator.reliability.markov.State;
import org.palladiosimulator.reliability.markov.Transition;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.reliability.markov.MarkovPackage
 * @generated
 */
public class MarkovAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static MarkovPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MarkovAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = MarkovPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected MarkovSwitch<Adapter> modelSwitch = new MarkovSwitch<Adapter>() {

        @Override
        public Adapter caseState(final State object) {
            return MarkovAdapterFactory.this.createStateAdapter();
        }

        @Override
        public Adapter caseTransition(final Transition object) {
            return MarkovAdapterFactory.this.createTransitionAdapter();
        }

        @Override
        public Adapter caseMarkovChain(final MarkovChain object) {
            return MarkovAdapterFactory.this.createMarkovChainAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object) {
            return MarkovAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter caseLabel(final Label object) {
            return MarkovAdapterFactory.this.createLabelAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return MarkovAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.markov.State <em>State</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.markov.State
     * @generated
     */
    public Adapter createStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.markov.Transition <em>Transition</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.markov.Transition
     * @generated
     */
    public Adapter createTransitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.markov.MarkovChain <em>Chain</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.markov.MarkovChain
     * @generated
     */
    public Adapter createMarkovChainAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.markov.Entity <em>Entity</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.markov.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.markov.Label <em>Label</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.markov.Label
     * @generated
     */
    public Adapter createLabelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // MarkovAdapterFactory
