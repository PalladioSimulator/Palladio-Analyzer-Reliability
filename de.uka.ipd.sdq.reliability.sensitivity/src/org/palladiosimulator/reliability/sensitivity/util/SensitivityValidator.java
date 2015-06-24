/**
 */
package org.palladiosimulator.reliability.sensitivity.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.palladiosimulator.reliability.sensitivity.CombinedSensitivityParameter;
import org.palladiosimulator.reliability.sensitivity.CommunicationLinkReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.ComponentReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.DoubleOffsetSequence;
import org.palladiosimulator.reliability.sensitivity.DoubleOffsetType;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterFunction;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterRange;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterSequence;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterVariation;
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
import org.palladiosimulator.reliability.sensitivity.VariableUsageType;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage
 * @generated
 */
public class SensitivityValidator extends EObjectValidator {

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final SensitivityValidator INSTANCE = new SensitivityValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
     * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.reliability.sensitivity";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Component
     * Reliability Parameter Must Have Double Variation' of 'Component Reliability Parameter'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int COMPONENT_RELIABILITY_PARAMETER__COMPONENT_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 1;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Internal
     * Action Reliability Parameter Must Have Double Variation' of 'Internal Action Reliability
     * Parameter'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 2;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint
     * 'Probabilistic Branch Parameter Must Have Double Variation' of 'Probabilistic Branch
     * Parameter'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 3;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Hardware
     * MTTF Parameter Must Have Double Variation' of 'Hardware MTTF Parameter'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int HARDWARE_MTTF_PARAMETER__HARDWARE_MTTF_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 4;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Hardware
     * MTTR Parameter Must Have Double Variation' of 'Hardware MTTR Parameter'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int HARDWARE_MTTR_PARAMETER__HARDWARE_MTTR_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 5;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource
     * MTTF Parameter Must Have Double Variation' of 'Resource MTTF Parameter'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int RESOURCE_MTTF_PARAMETER__RESOURCE_MTTF_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 6;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource
     * MTTR Parameter Must Have Double Variation' of 'Resource MTTR Parameter'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int RESOURCE_MTTR_PARAMETER__RESOURCE_MTTR_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 7;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Network
     * Reliability Parameter Must Have Double Variation' of 'Network Reliability Parameter'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int NETWORK_RELIABILITY_PARAMETER__NETWORK_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 8;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint
     * 'Communication Link Parameter Must Have Double Variation' of 'Communication Link Reliability
     * Parameter'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int COMMUNICATION_LINK_RELIABILITY_PARAMETER__COMMUNICATION_LINK_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 9;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Software
     * Reliability Parameter Must Have Double Variation' of 'Software Reliability Parameter'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int SOFTWARE_RELIABILITY_PARAMETER__SOFTWARE_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 10;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'System Call
     * Parameter Must Have String Sequence' of 'Variable Usage Parameter'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int VARIABLE_USAGE_PARAMETER__SYSTEM_CALL_PARAMETER_MUST_HAVE_STRING_SEQUENCE = 11;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Usage
     * Branch Parameter Must Have Double Variation' of 'Usage Branch Parameter'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int USAGE_BRANCH_PARAMETER__USAGE_BRANCH_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 12;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Software
     * Failure Type Reliability Parameter Must Have Double Variation' of 'Software Failure Types
     * Parameter'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final int SOFTWARE_FAILURE_TYPES_PARAMETER__SOFTWARE_FAILURE_TYPE_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION = 13;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 13;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants in a derived class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SensitivityValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return SensitivityPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected boolean validate(final int classifierID, final Object value, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        switch (classifierID) {
        case SensitivityPackage.SENSITIVITY_CONFIGURATION:
            return this.validateSensitivityConfiguration((SensitivityConfiguration) value, diagnostics, context);
        case SensitivityPackage.SENSITIVITY_PARAMETER:
            return this.validateSensitivityParameter((SensitivityParameter) value, diagnostics, context);
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER:
            return this.validateCombinedSensitivityParameter((CombinedSensitivityParameter) value, diagnostics,
                    context);
        case SensitivityPackage.SENSITIVITY_RESULT_SPECIFICATION:
            return this.validateSensitivityResultSpecification((SensitivityResultSpecification) value, diagnostics,
                    context);
        case SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER:
            return this.validateSingleSensitivityParameter((SingleSensitivityParameter) value, diagnostics, context);
        case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION:
            return this.validateSensitivityParameterVariation((SensitivityParameterVariation) value, diagnostics,
                    context);
        case SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER:
            return this.validateComponentReliabilityParameter((ComponentReliabilityParameter) value, diagnostics,
                    context);
        case SensitivityPackage.DOUBLE_PARAMETER_VARIATION:
            return this.validateDoubleParameterVariation((DoubleParameterVariation) value, diagnostics, context);
        case SensitivityPackage.STRING_PARAMETER_SEQUENCE:
            return this.validateStringParameterSequence((StringParameterSequence) value, diagnostics, context);
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE:
            return this.validateDoubleParameterRange((DoubleParameterRange) value, diagnostics, context);
        case SensitivityPackage.DOUBLE_PARAMETER_SEQUENCE:
            return this.validateDoubleParameterSequence((DoubleParameterSequence) value, diagnostics, context);
        case SensitivityPackage.DOUBLE_PARAMETER_FUNCTION:
            return this.validateDoubleParameterFunction((DoubleParameterFunction) value, diagnostics, context);
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER:
            return this.validateInternalActionReliabilityParameter((InternalActionReliabilityParameter) value,
                    diagnostics, context);
        case SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER:
            return this.validateProbabilisticBranchParameter((ProbabilisticBranchParameter) value, diagnostics,
                    context);
        case SensitivityPackage.HARDWARE_MTTF_PARAMETER:
            return this.validateHardwareMTTFParameter((HardwareMTTFParameter) value, diagnostics, context);
        case SensitivityPackage.HARDWARE_MTTR_PARAMETER:
            return this.validateHardwareMTTRParameter((HardwareMTTRParameter) value, diagnostics, context);
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER:
            return this.validateResourceMTTFParameter((ResourceMTTFParameter) value, diagnostics, context);
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER:
            return this.validateResourceMTTRParameter((ResourceMTTRParameter) value, diagnostics, context);
        case SensitivityPackage.NETWORK_RELIABILITY_PARAMETER:
            return this.validateNetworkReliabilityParameter((NetworkReliabilityParameter) value, diagnostics, context);
        case SensitivityPackage.COMMUNICATION_LINK_RELIABILITY_PARAMETER:
            return this.validateCommunicationLinkReliabilityParameter((CommunicationLinkReliabilityParameter) value,
                    diagnostics, context);
        case SensitivityPackage.SOFTWARE_RELIABILITY_PARAMETER:
            return this.validateSoftwareReliabilityParameter((SoftwareReliabilityParameter) value, diagnostics,
                    context);
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER:
            return this.validateVariableUsageParameter((VariableUsageParameter) value, diagnostics, context);
        case SensitivityPackage.USAGE_BRANCH_PARAMETER:
            return this.validateUsageBranchParameter((UsageBranchParameter) value, diagnostics, context);
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE:
            return this.validateDoubleOffsetSequence((DoubleOffsetSequence) value, diagnostics, context);
        case SensitivityPackage.SOFTWARE_FAILURE_TYPES_PARAMETER:
            return this.validateSoftwareFailureTypesParameter((SoftwareFailureTypesParameter) value, diagnostics,
                    context);
        case SensitivityPackage.FAILURE_TYPE_RESULT_SPECIFICATION:
            return this.validateFailureTypeResultSpecification((FailureTypeResultSpecification) value, diagnostics,
                    context);
        case SensitivityPackage.FAILURE_DIMENSION_RESULT_SPECIFICATION:
            return this.validateFailureDimensionResultSpecification((FailureDimensionResultSpecification) value,
                    diagnostics, context);
        case SensitivityPackage.VARIABLE_USAGE_TYPE:
            return this.validateVariableUsageType((VariableUsageType) value, diagnostics, context);
        case SensitivityPackage.DOUBLE_OFFSET_TYPE:
            return this.validateDoubleOffsetType((DoubleOffsetType) value, diagnostics, context);
        case SensitivityPackage.FAILURE_DIMENSION:
            return this.validateFailureDimension((FailureDimension) value, diagnostics, context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateSensitivityConfiguration(final SensitivityConfiguration sensitivityConfiguration,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(sensitivityConfiguration, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateSensitivityParameter(final SensitivityParameter sensitivityParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(sensitivityParameter, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateCombinedSensitivityParameter(final CombinedSensitivityParameter combinedSensitivityParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(combinedSensitivityParameter, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateSensitivityResultSpecification(
            final SensitivityResultSpecification sensitivityResultSpecification, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(sensitivityResultSpecification, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateSingleSensitivityParameter(final SingleSensitivityParameter singleSensitivityParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(singleSensitivityParameter, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateSensitivityParameterVariation(
            final SensitivityParameterVariation sensitivityParameterVariation, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(sensitivityParameterVariation, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateComponentReliabilityParameter(
            final ComponentReliabilityParameter componentReliabilityParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(componentReliabilityParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(componentReliabilityParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(componentReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(componentReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(componentReliabilityParameter, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(componentReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(componentReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(componentReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(componentReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateComponentReliabilityParameter_ComponentReliabilityParameterMustHaveDoubleVariation(
                    componentReliabilityParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the ComponentReliabilityParameterMustHaveDoubleVariation constraint of '
     * <em>Component Reliability Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateComponentReliabilityParameter_ComponentReliabilityParameterMustHaveDoubleVariation(
            final ComponentReliabilityParameter componentReliabilityParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return componentReliabilityParameter.ComponentReliabilityParameterMustHaveDoubleVariation(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateDoubleParameterVariation(final DoubleParameterVariation doubleParameterVariation,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(doubleParameterVariation, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateStringParameterSequence(final StringParameterSequence stringParameterSequence,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(stringParameterSequence, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateDoubleParameterRange(final DoubleParameterRange doubleParameterRange,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(doubleParameterRange, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateDoubleParameterSequence(final DoubleParameterSequence doubleParameterSequence,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(doubleParameterSequence, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateDoubleParameterFunction(final DoubleParameterFunction doubleParameterFunction,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(doubleParameterFunction, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateInternalActionReliabilityParameter(
            final InternalActionReliabilityParameter internalActionReliabilityParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(internalActionReliabilityParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(internalActionReliabilityParameter, diagnostics,
                context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(internalActionReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(internalActionReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(internalActionReliabilityParameter, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(internalActionReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(internalActionReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(internalActionReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(internalActionReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this
                    .validateInternalActionReliabilityParameter_InternalActionReliabilityParameterMustHaveDoubleVariation(
                            internalActionReliabilityParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the InternalActionReliabilityParameterMustHaveDoubleVariation constraint of '
     * <em>Internal Action Reliability Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    public boolean validateInternalActionReliabilityParameter_InternalActionReliabilityParameterMustHaveDoubleVariation(
            final InternalActionReliabilityParameter internalActionReliabilityParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return internalActionReliabilityParameter.InternalActionReliabilityParameterMustHaveDoubleVariation(diagnostics,
                context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateProbabilisticBranchParameter(final ProbabilisticBranchParameter probabilisticBranchParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(probabilisticBranchParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(probabilisticBranchParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(probabilisticBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(probabilisticBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(probabilisticBranchParameter, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(probabilisticBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(probabilisticBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(probabilisticBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(probabilisticBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateProbabilisticBranchParameter_ProbabilisticBranchParameterMustHaveDoubleVariation(
                    probabilisticBranchParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the ProbabilisticBranchParameterMustHaveDoubleVariation constraint of '
     * <em>Probabilistic Branch Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateProbabilisticBranchParameter_ProbabilisticBranchParameterMustHaveDoubleVariation(
            final ProbabilisticBranchParameter probabilisticBranchParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return probabilisticBranchParameter.ProbabilisticBranchParameterMustHaveDoubleVariation(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateHardwareMTTFParameter(final HardwareMTTFParameter hardwareMTTFParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(hardwareMTTFParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(hardwareMTTFParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(hardwareMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(hardwareMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(hardwareMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(hardwareMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(hardwareMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(hardwareMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(hardwareMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateHardwareMTTFParameter_HardwareMTTFParameterMustHaveDoubleVariation(
                    hardwareMTTFParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the HardwareMTTFParameterMustHaveDoubleVariation constraint of '
     * <em>Hardware MTTF Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateHardwareMTTFParameter_HardwareMTTFParameterMustHaveDoubleVariation(
            final HardwareMTTFParameter hardwareMTTFParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return hardwareMTTFParameter.HardwareMTTFParameterMustHaveDoubleVariation(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateHardwareMTTRParameter(final HardwareMTTRParameter hardwareMTTRParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(hardwareMTTRParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(hardwareMTTRParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(hardwareMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(hardwareMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(hardwareMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(hardwareMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(hardwareMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(hardwareMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(hardwareMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateHardwareMTTRParameter_HardwareMTTRParameterMustHaveDoubleVariation(
                    hardwareMTTRParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the HardwareMTTRParameterMustHaveDoubleVariation constraint of '
     * <em>Hardware MTTR Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateHardwareMTTRParameter_HardwareMTTRParameterMustHaveDoubleVariation(
            final HardwareMTTRParameter hardwareMTTRParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return hardwareMTTRParameter.HardwareMTTRParameterMustHaveDoubleVariation(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateResourceMTTFParameter(final ResourceMTTFParameter resourceMTTFParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(resourceMTTFParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(resourceMTTFParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(resourceMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(resourceMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(resourceMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(resourceMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(resourceMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(resourceMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(resourceMTTFParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateResourceMTTFParameter_ResourceMTTFParameterMustHaveDoubleVariation(
                    resourceMTTFParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the ResourceMTTFParameterMustHaveDoubleVariation constraint of '
     * <em>Resource MTTF Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateResourceMTTFParameter_ResourceMTTFParameterMustHaveDoubleVariation(
            final ResourceMTTFParameter resourceMTTFParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return resourceMTTFParameter.ResourceMTTFParameterMustHaveDoubleVariation(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateResourceMTTRParameter(final ResourceMTTRParameter resourceMTTRParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(resourceMTTRParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(resourceMTTRParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(resourceMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(resourceMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(resourceMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(resourceMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(resourceMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(resourceMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(resourceMTTRParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateResourceMTTRParameter_ResourceMTTRParameterMustHaveDoubleVariation(
                    resourceMTTRParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the ResourceMTTRParameterMustHaveDoubleVariation constraint of '
     * <em>Resource MTTR Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateResourceMTTRParameter_ResourceMTTRParameterMustHaveDoubleVariation(
            final ResourceMTTRParameter resourceMTTRParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return resourceMTTRParameter.ResourceMTTRParameterMustHaveDoubleVariation(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateNetworkReliabilityParameter(final NetworkReliabilityParameter networkReliabilityParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(networkReliabilityParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(networkReliabilityParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(networkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(networkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(networkReliabilityParameter, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(networkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(networkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(networkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(networkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateNetworkReliabilityParameter_NetworkReliabilityParameterMustHaveDoubleVariation(
                    networkReliabilityParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the NetworkReliabilityParameterMustHaveDoubleVariation constraint of '
     * <em>Network Reliability Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateNetworkReliabilityParameter_NetworkReliabilityParameterMustHaveDoubleVariation(
            final NetworkReliabilityParameter networkReliabilityParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return networkReliabilityParameter.NetworkReliabilityParameterMustHaveDoubleVariation(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateCommunicationLinkReliabilityParameter(
            final CommunicationLinkReliabilityParameter communicationLinkReliabilityParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(communicationLinkReliabilityParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(communicationLinkReliabilityParameter, diagnostics,
                context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(communicationLinkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(communicationLinkReliabilityParameter, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(communicationLinkReliabilityParameter,
                    diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(communicationLinkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(communicationLinkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(communicationLinkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(communicationLinkReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this
                    .validateCommunicationLinkReliabilityParameter_CommunicationLinkParameterMustHaveDoubleVariation(
                            communicationLinkReliabilityParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the CommunicationLinkParameterMustHaveDoubleVariation constraint of '
     * <em>Communication Link Reliability Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    public boolean validateCommunicationLinkReliabilityParameter_CommunicationLinkParameterMustHaveDoubleVariation(
            final CommunicationLinkReliabilityParameter communicationLinkReliabilityParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return communicationLinkReliabilityParameter.CommunicationLinkParameterMustHaveDoubleVariation(diagnostics,
                context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateSoftwareReliabilityParameter(final SoftwareReliabilityParameter softwareReliabilityParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(softwareReliabilityParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(softwareReliabilityParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(softwareReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(softwareReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(softwareReliabilityParameter, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(softwareReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(softwareReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(softwareReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(softwareReliabilityParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateSoftwareReliabilityParameter_SoftwareReliabilityParameterMustHaveDoubleVariation(
                    softwareReliabilityParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the SoftwareReliabilityParameterMustHaveDoubleVariation constraint of '
     * <em>Software Reliability Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateSoftwareReliabilityParameter_SoftwareReliabilityParameterMustHaveDoubleVariation(
            final SoftwareReliabilityParameter softwareReliabilityParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return softwareReliabilityParameter.SoftwareReliabilityParameterMustHaveDoubleVariation(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateVariableUsageParameter(final VariableUsageParameter variableUsageParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(variableUsageParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(variableUsageParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(variableUsageParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(variableUsageParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(variableUsageParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(variableUsageParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(variableUsageParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(variableUsageParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(variableUsageParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateVariableUsageParameter_SystemCallParameterMustHaveStringSequence(
                    variableUsageParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the SystemCallParameterMustHaveStringSequence constraint of '
     * <em>Variable Usage Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateVariableUsageParameter_SystemCallParameterMustHaveStringSequence(
            final VariableUsageParameter variableUsageParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return variableUsageParameter.SystemCallParameterMustHaveStringSequence(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateUsageBranchParameter(final UsageBranchParameter usageBranchParameter,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(usageBranchParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(usageBranchParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(usageBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(usageBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(usageBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(usageBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(usageBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(usageBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(usageBranchParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateUsageBranchParameter_UsageBranchParameterMustHaveDoubleVariation(
                    usageBranchParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the UsageBranchParameterMustHaveDoubleVariation constraint of '
     * <em>Usage Branch Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateUsageBranchParameter_UsageBranchParameterMustHaveDoubleVariation(
            final UsageBranchParameter usageBranchParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return usageBranchParameter.UsageBranchParameterMustHaveDoubleVariation(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateDoubleOffsetSequence(final DoubleOffsetSequence doubleOffsetSequence,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(doubleOffsetSequence, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateSoftwareFailureTypesParameter(
            final SoftwareFailureTypesParameter softwareFailureTypesParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(softwareFailureTypesParameter, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(softwareFailureTypesParameter, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(softwareFailureTypesParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(softwareFailureTypesParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(softwareFailureTypesParameter, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(softwareFailureTypesParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(softwareFailureTypesParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(softwareFailureTypesParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(softwareFailureTypesParameter, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this
                    .validateSoftwareFailureTypesParameter_SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation(
                            softwareFailureTypesParameter, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation constraint of '
     * <em>Software Failure Types Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateSoftwareFailureTypesParameter_SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation(
            final SoftwareFailureTypesParameter softwareFailureTypesParameter, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return softwareFailureTypesParameter.SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation(diagnostics,
                context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateFailureTypeResultSpecification(
            final FailureTypeResultSpecification failureTypeResultSpecification, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(failureTypeResultSpecification, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateFailureDimensionResultSpecification(
            final FailureDimensionResultSpecification failureDimensionResultSpecification,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(failureDimensionResultSpecification, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateVariableUsageType(final VariableUsageType variableUsageType,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateDoubleOffsetType(final DoubleOffsetType doubleOffsetType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateFailureDimension(final FailureDimension failureDimension, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's
     * diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} // SensitivityValidator
