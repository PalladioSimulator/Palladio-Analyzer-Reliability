/**
 */
package org.palladiosimulator.reliability.sensitivity.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.reliability.sensitivity.CombinedSensitivityParameter;
import org.palladiosimulator.reliability.sensitivity.CommunicationLinkReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.ComponentReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.DoubleOffsetSequence;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterFunction;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterRange;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterSequence;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterVariation;
import org.palladiosimulator.reliability.sensitivity.FailureDimensionResultSpecification;
import org.palladiosimulator.reliability.sensitivity.FailureTypeResultSpecification;
import org.palladiosimulator.reliability.sensitivity.HardwareMTTFParameter;
import org.palladiosimulator.reliability.sensitivity.HardwareMTTRParameter;
import org.palladiosimulator.reliability.sensitivity.InternalActionReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.NetworkReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.ProbabilisticBranchParameter;
import org.palladiosimulator.reliability.sensitivity.ResourceMTTFParameter;
import org.palladiosimulator.reliability.sensitivity.ResourceMTTRParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.SensitivityParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityParameterVariation;
import org.palladiosimulator.reliability.sensitivity.SensitivityResultSpecification;
import org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter;
import org.palladiosimulator.reliability.sensitivity.SoftwareFailureTypesParameter;
import org.palladiosimulator.reliability.sensitivity.SoftwareReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.StringParameterSequence;
import org.palladiosimulator.reliability.sensitivity.UsageBranchParameter;
import org.palladiosimulator.reliability.sensitivity.VariableUsageParameter;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage
 * @generated
 */
public class SensitivityAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static SensitivityPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SensitivityAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SensitivityPackage.eINSTANCE;
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
    protected SensitivitySwitch<Adapter> modelSwitch = new SensitivitySwitch<Adapter>() {

        @Override
        public Adapter caseSensitivityConfiguration(final SensitivityConfiguration object) {
            return SensitivityAdapterFactory.this.createSensitivityConfigurationAdapter();
        }

        @Override
        public Adapter caseSensitivityParameter(final SensitivityParameter object) {
            return SensitivityAdapterFactory.this.createSensitivityParameterAdapter();
        }

        @Override
        public Adapter caseCombinedSensitivityParameter(final CombinedSensitivityParameter object) {
            return SensitivityAdapterFactory.this.createCombinedSensitivityParameterAdapter();
        }

        @Override
        public Adapter caseSensitivityResultSpecification(final SensitivityResultSpecification object) {
            return SensitivityAdapterFactory.this.createSensitivityResultSpecificationAdapter();
        }

        @Override
        public Adapter caseSingleSensitivityParameter(final SingleSensitivityParameter object) {
            return SensitivityAdapterFactory.this.createSingleSensitivityParameterAdapter();
        }

        @Override
        public Adapter caseSensitivityParameterVariation(final SensitivityParameterVariation object) {
            return SensitivityAdapterFactory.this.createSensitivityParameterVariationAdapter();
        }

        @Override
        public Adapter caseComponentReliabilityParameter(final ComponentReliabilityParameter object) {
            return SensitivityAdapterFactory.this.createComponentReliabilityParameterAdapter();
        }

        @Override
        public Adapter caseDoubleParameterVariation(final DoubleParameterVariation object) {
            return SensitivityAdapterFactory.this.createDoubleParameterVariationAdapter();
        }

        @Override
        public Adapter caseStringParameterSequence(final StringParameterSequence object) {
            return SensitivityAdapterFactory.this.createStringParameterSequenceAdapter();
        }

        @Override
        public Adapter caseDoubleParameterRange(final DoubleParameterRange object) {
            return SensitivityAdapterFactory.this.createDoubleParameterRangeAdapter();
        }

        @Override
        public Adapter caseDoubleParameterSequence(final DoubleParameterSequence object) {
            return SensitivityAdapterFactory.this.createDoubleParameterSequenceAdapter();
        }

        @Override
        public Adapter caseDoubleParameterFunction(final DoubleParameterFunction object) {
            return SensitivityAdapterFactory.this.createDoubleParameterFunctionAdapter();
        }

        @Override
        public Adapter caseInternalActionReliabilityParameter(final InternalActionReliabilityParameter object) {
            return SensitivityAdapterFactory.this.createInternalActionReliabilityParameterAdapter();
        }

        @Override
        public Adapter caseProbabilisticBranchParameter(final ProbabilisticBranchParameter object) {
            return SensitivityAdapterFactory.this.createProbabilisticBranchParameterAdapter();
        }

        @Override
        public Adapter caseHardwareMTTFParameter(final HardwareMTTFParameter object) {
            return SensitivityAdapterFactory.this.createHardwareMTTFParameterAdapter();
        }

        @Override
        public Adapter caseHardwareMTTRParameter(final HardwareMTTRParameter object) {
            return SensitivityAdapterFactory.this.createHardwareMTTRParameterAdapter();
        }

        @Override
        public Adapter caseResourceMTTFParameter(final ResourceMTTFParameter object) {
            return SensitivityAdapterFactory.this.createResourceMTTFParameterAdapter();
        }

        @Override
        public Adapter caseResourceMTTRParameter(final ResourceMTTRParameter object) {
            return SensitivityAdapterFactory.this.createResourceMTTRParameterAdapter();
        }

        @Override
        public Adapter caseNetworkReliabilityParameter(final NetworkReliabilityParameter object) {
            return SensitivityAdapterFactory.this.createNetworkReliabilityParameterAdapter();
        }

        @Override
        public Adapter caseCommunicationLinkReliabilityParameter(final CommunicationLinkReliabilityParameter object) {
            return SensitivityAdapterFactory.this.createCommunicationLinkReliabilityParameterAdapter();
        }

        @Override
        public Adapter caseSoftwareReliabilityParameter(final SoftwareReliabilityParameter object) {
            return SensitivityAdapterFactory.this.createSoftwareReliabilityParameterAdapter();
        }

        @Override
        public Adapter caseVariableUsageParameter(final VariableUsageParameter object) {
            return SensitivityAdapterFactory.this.createVariableUsageParameterAdapter();
        }

        @Override
        public Adapter caseUsageBranchParameter(final UsageBranchParameter object) {
            return SensitivityAdapterFactory.this.createUsageBranchParameterAdapter();
        }

        @Override
        public Adapter caseDoubleOffsetSequence(final DoubleOffsetSequence object) {
            return SensitivityAdapterFactory.this.createDoubleOffsetSequenceAdapter();
        }

        @Override
        public Adapter caseSoftwareFailureTypesParameter(final SoftwareFailureTypesParameter object) {
            return SensitivityAdapterFactory.this.createSoftwareFailureTypesParameterAdapter();
        }

        @Override
        public Adapter caseFailureTypeResultSpecification(final FailureTypeResultSpecification object) {
            return SensitivityAdapterFactory.this.createFailureTypeResultSpecificationAdapter();
        }

        @Override
        public Adapter caseFailureDimensionResultSpecification(final FailureDimensionResultSpecification object) {
            return SensitivityAdapterFactory.this.createFailureDimensionResultSpecificationAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object) {
            return SensitivityAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object) {
            return SensitivityAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object) {
            return SensitivityAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return SensitivityAdapterFactory.this.createEObjectAdapter();
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
     * {@link org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration
     * <em>Configuration</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityConfiguration
     * @generated
     */
    public Adapter createSensitivityConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.SensitivityParameter <em>Parameter</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityParameter
     * @generated
     */
    public Adapter createSensitivityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.CombinedSensitivityParameter
     * <em>Combined Sensitivity Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.CombinedSensitivityParameter
     * @generated
     */
    public Adapter createCombinedSensitivityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.SensitivityResultSpecification
     * <em>Result Specification</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityResultSpecification
     * @generated
     */
    public Adapter createSensitivityResultSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter
     * <em>Single Sensitivity Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.SingleSensitivityParameter
     * @generated
     */
    public Adapter createSingleSensitivityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.SensitivityParameterVariation
     * <em>Parameter Variation</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityParameterVariation
     * @generated
     */
    public Adapter createSensitivityParameterVariationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.ComponentReliabilityParameter
     * <em>Component Reliability Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.ComponentReliabilityParameter
     * @generated
     */
    public Adapter createComponentReliabilityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.DoubleParameterVariation
     * <em>Double Parameter Variation</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.DoubleParameterVariation
     * @generated
     */
    public Adapter createDoubleParameterVariationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.StringParameterSequence
     * <em>String Parameter Sequence</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.StringParameterSequence
     * @generated
     */
    public Adapter createStringParameterSequenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.DoubleParameterRange
     * <em>Double Parameter Range</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.DoubleParameterRange
     * @generated
     */
    public Adapter createDoubleParameterRangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.DoubleParameterSequence
     * <em>Double Parameter Sequence</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.DoubleParameterSequence
     * @generated
     */
    public Adapter createDoubleParameterSequenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.DoubleParameterFunction
     * <em>Double Parameter Function</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.DoubleParameterFunction
     * @generated
     */
    public Adapter createDoubleParameterFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.InternalActionReliabilityParameter
     * <em>Internal Action Reliability Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.InternalActionReliabilityParameter
     * @generated
     */
    public Adapter createInternalActionReliabilityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.ProbabilisticBranchParameter
     * <em>Probabilistic Branch Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.ProbabilisticBranchParameter
     * @generated
     */
    public Adapter createProbabilisticBranchParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.HardwareMTTFParameter
     * <em>Hardware MTTF Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.HardwareMTTFParameter
     * @generated
     */
    public Adapter createHardwareMTTFParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.HardwareMTTRParameter
     * <em>Hardware MTTR Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.HardwareMTTRParameter
     * @generated
     */
    public Adapter createHardwareMTTRParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.ResourceMTTFParameter
     * <em>Resource MTTF Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.ResourceMTTFParameter
     * @generated
     */
    public Adapter createResourceMTTFParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.ResourceMTTRParameter
     * <em>Resource MTTR Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.ResourceMTTRParameter
     * @generated
     */
    public Adapter createResourceMTTRParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.NetworkReliabilityParameter
     * <em>Network Reliability Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.NetworkReliabilityParameter
     * @generated
     */
    public Adapter createNetworkReliabilityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.CommunicationLinkReliabilityParameter
     * <em>Communication Link Reliability Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.CommunicationLinkReliabilityParameter
     * @generated
     */
    public Adapter createCommunicationLinkReliabilityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.SoftwareReliabilityParameter
     * <em>Software Reliability Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.SoftwareReliabilityParameter
     * @generated
     */
    public Adapter createSoftwareReliabilityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.VariableUsageParameter
     * <em>Variable Usage Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.VariableUsageParameter
     * @generated
     */
    public Adapter createVariableUsageParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.UsageBranchParameter
     * <em>Usage Branch Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.UsageBranchParameter
     * @generated
     */
    public Adapter createUsageBranchParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.DoubleOffsetSequence
     * <em>Double Offset Sequence</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.DoubleOffsetSequence
     * @generated
     */
    public Adapter createDoubleOffsetSequenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.SoftwareFailureTypesParameter
     * <em>Software Failure Types Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.SoftwareFailureTypesParameter
     * @generated
     */
    public Adapter createSoftwareFailureTypesParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.FailureTypeResultSpecification
     * <em>Failure Type Result Specification</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.FailureTypeResultSpecification
     * @generated
     */
    public Adapter createFailureTypeResultSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.reliability.sensitivity.FailureDimensionResultSpecification
     * <em>Failure Dimension Result Specification</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.reliability.sensitivity.FailureDimensionResultSpecification
     * @generated
     */
    public Adapter createFailureDimensionResultSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
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

} // SensitivityAdapterFactory
