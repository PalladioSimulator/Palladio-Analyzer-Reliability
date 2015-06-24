/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.reliability.sensitivity.CombinedSensitivityParameter;
import org.palladiosimulator.reliability.sensitivity.CommunicationLinkReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.ComponentReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.DoubleOffsetSequence;
import org.palladiosimulator.reliability.sensitivity.DoubleOffsetType;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterRange;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterSequence;
import org.palladiosimulator.reliability.sensitivity.FailureDimension;
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
import org.palladiosimulator.reliability.sensitivity.SensitivityFactory;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.SoftwareFailureTypesParameter;
import org.palladiosimulator.reliability.sensitivity.SoftwareReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.StringParameterSequence;
import org.palladiosimulator.reliability.sensitivity.UsageBranchParameter;
import org.palladiosimulator.reliability.sensitivity.VariableUsageParameter;
import org.palladiosimulator.reliability.sensitivity.VariableUsageType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class SensitivityFactoryImpl extends EFactoryImpl implements SensitivityFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static SensitivityFactory init() {
        try {
            final SensitivityFactory theSensitivityFactory = (SensitivityFactory) EPackage.Registry.INSTANCE
                    .getEFactory(SensitivityPackage.eNS_URI);
            if (theSensitivityFactory != null) {
                return theSensitivityFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SensitivityFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SensitivityFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case SensitivityPackage.SENSITIVITY_CONFIGURATION:
            return this.createSensitivityConfiguration();
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER:
            return this.createCombinedSensitivityParameter();
        case SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER:
            return this.createComponentReliabilityParameter();
        case SensitivityPackage.STRING_PARAMETER_SEQUENCE:
            return this.createStringParameterSequence();
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE:
            return this.createDoubleParameterRange();
        case SensitivityPackage.DOUBLE_PARAMETER_SEQUENCE:
            return this.createDoubleParameterSequence();
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER:
            return this.createInternalActionReliabilityParameter();
        case SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER:
            return this.createProbabilisticBranchParameter();
        case SensitivityPackage.HARDWARE_MTTF_PARAMETER:
            return this.createHardwareMTTFParameter();
        case SensitivityPackage.HARDWARE_MTTR_PARAMETER:
            return this.createHardwareMTTRParameter();
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER:
            return this.createResourceMTTFParameter();
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER:
            return this.createResourceMTTRParameter();
        case SensitivityPackage.NETWORK_RELIABILITY_PARAMETER:
            return this.createNetworkReliabilityParameter();
        case SensitivityPackage.COMMUNICATION_LINK_RELIABILITY_PARAMETER:
            return this.createCommunicationLinkReliabilityParameter();
        case SensitivityPackage.SOFTWARE_RELIABILITY_PARAMETER:
            return this.createSoftwareReliabilityParameter();
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER:
            return this.createVariableUsageParameter();
        case SensitivityPackage.USAGE_BRANCH_PARAMETER:
            return this.createUsageBranchParameter();
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE:
            return this.createDoubleOffsetSequence();
        case SensitivityPackage.SOFTWARE_FAILURE_TYPES_PARAMETER:
            return this.createSoftwareFailureTypesParameter();
        case SensitivityPackage.FAILURE_TYPE_RESULT_SPECIFICATION:
            return this.createFailureTypeResultSpecification();
        case SensitivityPackage.FAILURE_DIMENSION_RESULT_SPECIFICATION:
            return this.createFailureDimensionResultSpecification();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case SensitivityPackage.VARIABLE_USAGE_TYPE:
            return this.createVariableUsageTypeFromString(eDataType, initialValue);
        case SensitivityPackage.DOUBLE_OFFSET_TYPE:
            return this.createDoubleOffsetTypeFromString(eDataType, initialValue);
        case SensitivityPackage.FAILURE_DIMENSION:
            return this.createFailureDimensionFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case SensitivityPackage.VARIABLE_USAGE_TYPE:
            return this.convertVariableUsageTypeToString(eDataType, instanceValue);
        case SensitivityPackage.DOUBLE_OFFSET_TYPE:
            return this.convertDoubleOffsetTypeToString(eDataType, instanceValue);
        case SensitivityPackage.FAILURE_DIMENSION:
            return this.convertFailureDimensionToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SensitivityConfiguration createSensitivityConfiguration() {
        final SensitivityConfigurationImpl sensitivityConfiguration = new SensitivityConfigurationImpl();
        return sensitivityConfiguration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CombinedSensitivityParameter createCombinedSensitivityParameter() {
        final CombinedSensitivityParameterImpl combinedSensitivityParameter = new CombinedSensitivityParameterImpl();
        return combinedSensitivityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ComponentReliabilityParameter createComponentReliabilityParameter() {
        final ComponentReliabilityParameterImpl componentReliabilityParameter = new ComponentReliabilityParameterImpl();
        return componentReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public StringParameterSequence createStringParameterSequence() {
        final StringParameterSequenceImpl stringParameterSequence = new StringParameterSequenceImpl();
        return stringParameterSequence;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DoubleParameterRange createDoubleParameterRange() {
        final DoubleParameterRangeImpl doubleParameterRange = new DoubleParameterRangeImpl();
        return doubleParameterRange;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DoubleParameterSequence createDoubleParameterSequence() {
        final DoubleParameterSequenceImpl doubleParameterSequence = new DoubleParameterSequenceImpl();
        return doubleParameterSequence;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public InternalActionReliabilityParameter createInternalActionReliabilityParameter() {
        final InternalActionReliabilityParameterImpl internalActionReliabilityParameter = new InternalActionReliabilityParameterImpl();
        return internalActionReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProbabilisticBranchParameter createProbabilisticBranchParameter() {
        final ProbabilisticBranchParameterImpl probabilisticBranchParameter = new ProbabilisticBranchParameterImpl();
        return probabilisticBranchParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public HardwareMTTFParameter createHardwareMTTFParameter() {
        final HardwareMTTFParameterImpl hardwareMTTFParameter = new HardwareMTTFParameterImpl();
        return hardwareMTTFParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public HardwareMTTRParameter createHardwareMTTRParameter() {
        final HardwareMTTRParameterImpl hardwareMTTRParameter = new HardwareMTTRParameterImpl();
        return hardwareMTTRParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceMTTFParameter createResourceMTTFParameter() {
        final ResourceMTTFParameterImpl resourceMTTFParameter = new ResourceMTTFParameterImpl();
        return resourceMTTFParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceMTTRParameter createResourceMTTRParameter() {
        final ResourceMTTRParameterImpl resourceMTTRParameter = new ResourceMTTRParameterImpl();
        return resourceMTTRParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NetworkReliabilityParameter createNetworkReliabilityParameter() {
        final NetworkReliabilityParameterImpl networkReliabilityParameter = new NetworkReliabilityParameterImpl();
        return networkReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CommunicationLinkReliabilityParameter createCommunicationLinkReliabilityParameter() {
        final CommunicationLinkReliabilityParameterImpl communicationLinkReliabilityParameter = new CommunicationLinkReliabilityParameterImpl();
        return communicationLinkReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SoftwareReliabilityParameter createSoftwareReliabilityParameter() {
        final SoftwareReliabilityParameterImpl softwareReliabilityParameter = new SoftwareReliabilityParameterImpl();
        return softwareReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public VariableUsageParameter createVariableUsageParameter() {
        final VariableUsageParameterImpl variableUsageParameter = new VariableUsageParameterImpl();
        return variableUsageParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public UsageBranchParameter createUsageBranchParameter() {
        final UsageBranchParameterImpl usageBranchParameter = new UsageBranchParameterImpl();
        return usageBranchParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DoubleOffsetSequence createDoubleOffsetSequence() {
        final DoubleOffsetSequenceImpl doubleOffsetSequence = new DoubleOffsetSequenceImpl();
        return doubleOffsetSequence;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SoftwareFailureTypesParameter createSoftwareFailureTypesParameter() {
        final SoftwareFailureTypesParameterImpl softwareFailureTypesParameter = new SoftwareFailureTypesParameterImpl();
        return softwareFailureTypesParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public FailureTypeResultSpecification createFailureTypeResultSpecification() {
        final FailureTypeResultSpecificationImpl failureTypeResultSpecification = new FailureTypeResultSpecificationImpl();
        return failureTypeResultSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public FailureDimensionResultSpecification createFailureDimensionResultSpecification() {
        final FailureDimensionResultSpecificationImpl failureDimensionResultSpecification = new FailureDimensionResultSpecificationImpl();
        return failureDimensionResultSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public VariableUsageType createVariableUsageTypeFromString(final EDataType eDataType, final String initialValue) {
        final VariableUsageType result = VariableUsageType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertVariableUsageTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public DoubleOffsetType createDoubleOffsetTypeFromString(final EDataType eDataType, final String initialValue) {
        final DoubleOffsetType result = DoubleOffsetType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertDoubleOffsetTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FailureDimension createFailureDimensionFromString(final EDataType eDataType, final String initialValue) {
        final FailureDimension result = FailureDimension.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertFailureDimensionToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SensitivityPackage getSensitivityPackage() {
        return (SensitivityPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SensitivityPackage getPackage() {
        return SensitivityPackage.eINSTANCE;
    }

} // SensitivityFactoryImpl
