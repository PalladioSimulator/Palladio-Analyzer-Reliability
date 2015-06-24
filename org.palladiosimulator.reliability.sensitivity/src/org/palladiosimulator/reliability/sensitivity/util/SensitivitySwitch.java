/**
 */
package org.palladiosimulator.reliability.sensitivity.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage
 * @generated
 */
public class SensitivitySwitch<T> extends Switch<T> {

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static SensitivityPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SensitivitySwitch() {
        if (modelPackage == null) {
            modelPackage = SensitivityPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case SensitivityPackage.SENSITIVITY_CONFIGURATION: {
            final SensitivityConfiguration sensitivityConfiguration = (SensitivityConfiguration) theEObject;
            T result = this.caseSensitivityConfiguration(sensitivityConfiguration);
            if (result == null) {
                result = this.caseEntity(sensitivityConfiguration);
            }
            if (result == null) {
                result = this.caseIdentifier(sensitivityConfiguration);
            }
            if (result == null) {
                result = this.caseNamedElement(sensitivityConfiguration);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.SENSITIVITY_PARAMETER: {
            final SensitivityParameter sensitivityParameter = (SensitivityParameter) theEObject;
            T result = this.caseSensitivityParameter(sensitivityParameter);
            if (result == null) {
                result = this.caseEntity(sensitivityParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(sensitivityParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(sensitivityParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.COMBINED_SENSITIVITY_PARAMETER: {
            final CombinedSensitivityParameter combinedSensitivityParameter = (CombinedSensitivityParameter) theEObject;
            T result = this.caseCombinedSensitivityParameter(combinedSensitivityParameter);
            if (result == null) {
                result = this.caseSensitivityParameter(combinedSensitivityParameter);
            }
            if (result == null) {
                result = this.caseEntity(combinedSensitivityParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(combinedSensitivityParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(combinedSensitivityParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.SENSITIVITY_RESULT_SPECIFICATION: {
            final SensitivityResultSpecification sensitivityResultSpecification = (SensitivityResultSpecification) theEObject;
            T result = this.caseSensitivityResultSpecification(sensitivityResultSpecification);
            if (result == null) {
                result = this.caseEntity(sensitivityResultSpecification);
            }
            if (result == null) {
                result = this.caseIdentifier(sensitivityResultSpecification);
            }
            if (result == null) {
                result = this.caseNamedElement(sensitivityResultSpecification);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.SINGLE_SENSITIVITY_PARAMETER: {
            final SingleSensitivityParameter singleSensitivityParameter = (SingleSensitivityParameter) theEObject;
            T result = this.caseSingleSensitivityParameter(singleSensitivityParameter);
            if (result == null) {
                result = this.caseSensitivityParameter(singleSensitivityParameter);
            }
            if (result == null) {
                result = this.caseEntity(singleSensitivityParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(singleSensitivityParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(singleSensitivityParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.SENSITIVITY_PARAMETER_VARIATION: {
            final SensitivityParameterVariation sensitivityParameterVariation = (SensitivityParameterVariation) theEObject;
            T result = this.caseSensitivityParameterVariation(sensitivityParameterVariation);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER: {
            final ComponentReliabilityParameter componentReliabilityParameter = (ComponentReliabilityParameter) theEObject;
            T result = this.caseComponentReliabilityParameter(componentReliabilityParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(componentReliabilityParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(componentReliabilityParameter);
            }
            if (result == null) {
                result = this.caseEntity(componentReliabilityParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(componentReliabilityParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(componentReliabilityParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.DOUBLE_PARAMETER_VARIATION: {
            final DoubleParameterVariation doubleParameterVariation = (DoubleParameterVariation) theEObject;
            T result = this.caseDoubleParameterVariation(doubleParameterVariation);
            if (result == null) {
                result = this.caseSensitivityParameterVariation(doubleParameterVariation);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.STRING_PARAMETER_SEQUENCE: {
            final StringParameterSequence stringParameterSequence = (StringParameterSequence) theEObject;
            T result = this.caseStringParameterSequence(stringParameterSequence);
            if (result == null) {
                result = this.caseSensitivityParameterVariation(stringParameterSequence);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE: {
            final DoubleParameterRange doubleParameterRange = (DoubleParameterRange) theEObject;
            T result = this.caseDoubleParameterRange(doubleParameterRange);
            if (result == null) {
                result = this.caseDoubleParameterVariation(doubleParameterRange);
            }
            if (result == null) {
                result = this.caseSensitivityParameterVariation(doubleParameterRange);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.DOUBLE_PARAMETER_SEQUENCE: {
            final DoubleParameterSequence doubleParameterSequence = (DoubleParameterSequence) theEObject;
            T result = this.caseDoubleParameterSequence(doubleParameterSequence);
            if (result == null) {
                result = this.caseDoubleParameterVariation(doubleParameterSequence);
            }
            if (result == null) {
                result = this.caseSensitivityParameterVariation(doubleParameterSequence);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.DOUBLE_PARAMETER_FUNCTION: {
            final DoubleParameterFunction doubleParameterFunction = (DoubleParameterFunction) theEObject;
            T result = this.caseDoubleParameterFunction(doubleParameterFunction);
            if (result == null) {
                result = this.caseDoubleParameterVariation(doubleParameterFunction);
            }
            if (result == null) {
                result = this.caseSensitivityParameterVariation(doubleParameterFunction);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.INTERNAL_ACTION_RELIABILITY_PARAMETER: {
            final InternalActionReliabilityParameter internalActionReliabilityParameter = (InternalActionReliabilityParameter) theEObject;
            T result = this.caseInternalActionReliabilityParameter(internalActionReliabilityParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(internalActionReliabilityParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(internalActionReliabilityParameter);
            }
            if (result == null) {
                result = this.caseEntity(internalActionReliabilityParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(internalActionReliabilityParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(internalActionReliabilityParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.PROBABILISTIC_BRANCH_PARAMETER: {
            final ProbabilisticBranchParameter probabilisticBranchParameter = (ProbabilisticBranchParameter) theEObject;
            T result = this.caseProbabilisticBranchParameter(probabilisticBranchParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(probabilisticBranchParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(probabilisticBranchParameter);
            }
            if (result == null) {
                result = this.caseEntity(probabilisticBranchParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(probabilisticBranchParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(probabilisticBranchParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.HARDWARE_MTTF_PARAMETER: {
            final HardwareMTTFParameter hardwareMTTFParameter = (HardwareMTTFParameter) theEObject;
            T result = this.caseHardwareMTTFParameter(hardwareMTTFParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(hardwareMTTFParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(hardwareMTTFParameter);
            }
            if (result == null) {
                result = this.caseEntity(hardwareMTTFParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(hardwareMTTFParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(hardwareMTTFParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.HARDWARE_MTTR_PARAMETER: {
            final HardwareMTTRParameter hardwareMTTRParameter = (HardwareMTTRParameter) theEObject;
            T result = this.caseHardwareMTTRParameter(hardwareMTTRParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(hardwareMTTRParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(hardwareMTTRParameter);
            }
            if (result == null) {
                result = this.caseEntity(hardwareMTTRParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(hardwareMTTRParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(hardwareMTTRParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.RESOURCE_MTTF_PARAMETER: {
            final ResourceMTTFParameter resourceMTTFParameter = (ResourceMTTFParameter) theEObject;
            T result = this.caseResourceMTTFParameter(resourceMTTFParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(resourceMTTFParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(resourceMTTFParameter);
            }
            if (result == null) {
                result = this.caseEntity(resourceMTTFParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(resourceMTTFParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(resourceMTTFParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.RESOURCE_MTTR_PARAMETER: {
            final ResourceMTTRParameter resourceMTTRParameter = (ResourceMTTRParameter) theEObject;
            T result = this.caseResourceMTTRParameter(resourceMTTRParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(resourceMTTRParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(resourceMTTRParameter);
            }
            if (result == null) {
                result = this.caseEntity(resourceMTTRParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(resourceMTTRParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(resourceMTTRParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.NETWORK_RELIABILITY_PARAMETER: {
            final NetworkReliabilityParameter networkReliabilityParameter = (NetworkReliabilityParameter) theEObject;
            T result = this.caseNetworkReliabilityParameter(networkReliabilityParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(networkReliabilityParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(networkReliabilityParameter);
            }
            if (result == null) {
                result = this.caseEntity(networkReliabilityParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(networkReliabilityParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(networkReliabilityParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.COMMUNICATION_LINK_RELIABILITY_PARAMETER: {
            final CommunicationLinkReliabilityParameter communicationLinkReliabilityParameter = (CommunicationLinkReliabilityParameter) theEObject;
            T result = this.caseCommunicationLinkReliabilityParameter(communicationLinkReliabilityParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(communicationLinkReliabilityParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(communicationLinkReliabilityParameter);
            }
            if (result == null) {
                result = this.caseEntity(communicationLinkReliabilityParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(communicationLinkReliabilityParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(communicationLinkReliabilityParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.SOFTWARE_RELIABILITY_PARAMETER: {
            final SoftwareReliabilityParameter softwareReliabilityParameter = (SoftwareReliabilityParameter) theEObject;
            T result = this.caseSoftwareReliabilityParameter(softwareReliabilityParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(softwareReliabilityParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(softwareReliabilityParameter);
            }
            if (result == null) {
                result = this.caseEntity(softwareReliabilityParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(softwareReliabilityParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(softwareReliabilityParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.VARIABLE_USAGE_PARAMETER: {
            final VariableUsageParameter variableUsageParameter = (VariableUsageParameter) theEObject;
            T result = this.caseVariableUsageParameter(variableUsageParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(variableUsageParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(variableUsageParameter);
            }
            if (result == null) {
                result = this.caseEntity(variableUsageParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(variableUsageParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(variableUsageParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.USAGE_BRANCH_PARAMETER: {
            final UsageBranchParameter usageBranchParameter = (UsageBranchParameter) theEObject;
            T result = this.caseUsageBranchParameter(usageBranchParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(usageBranchParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(usageBranchParameter);
            }
            if (result == null) {
                result = this.caseEntity(usageBranchParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(usageBranchParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(usageBranchParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.DOUBLE_OFFSET_SEQUENCE: {
            final DoubleOffsetSequence doubleOffsetSequence = (DoubleOffsetSequence) theEObject;
            T result = this.caseDoubleOffsetSequence(doubleOffsetSequence);
            if (result == null) {
                result = this.caseDoubleParameterVariation(doubleOffsetSequence);
            }
            if (result == null) {
                result = this.caseSensitivityParameterVariation(doubleOffsetSequence);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.SOFTWARE_FAILURE_TYPES_PARAMETER: {
            final SoftwareFailureTypesParameter softwareFailureTypesParameter = (SoftwareFailureTypesParameter) theEObject;
            T result = this.caseSoftwareFailureTypesParameter(softwareFailureTypesParameter);
            if (result == null) {
                result = this.caseSingleSensitivityParameter(softwareFailureTypesParameter);
            }
            if (result == null) {
                result = this.caseSensitivityParameter(softwareFailureTypesParameter);
            }
            if (result == null) {
                result = this.caseEntity(softwareFailureTypesParameter);
            }
            if (result == null) {
                result = this.caseIdentifier(softwareFailureTypesParameter);
            }
            if (result == null) {
                result = this.caseNamedElement(softwareFailureTypesParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.FAILURE_TYPE_RESULT_SPECIFICATION: {
            final FailureTypeResultSpecification failureTypeResultSpecification = (FailureTypeResultSpecification) theEObject;
            T result = this.caseFailureTypeResultSpecification(failureTypeResultSpecification);
            if (result == null) {
                result = this.caseSensitivityResultSpecification(failureTypeResultSpecification);
            }
            if (result == null) {
                result = this.caseEntity(failureTypeResultSpecification);
            }
            if (result == null) {
                result = this.caseIdentifier(failureTypeResultSpecification);
            }
            if (result == null) {
                result = this.caseNamedElement(failureTypeResultSpecification);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SensitivityPackage.FAILURE_DIMENSION_RESULT_SPECIFICATION: {
            final FailureDimensionResultSpecification failureDimensionResultSpecification = (FailureDimensionResultSpecification) theEObject;
            T result = this.caseFailureDimensionResultSpecification(failureDimensionResultSpecification);
            if (result == null) {
                result = this.caseSensitivityResultSpecification(failureDimensionResultSpecification);
            }
            if (result == null) {
                result = this.caseEntity(failureDimensionResultSpecification);
            }
            if (result == null) {
                result = this.caseIdentifier(failureDimensionResultSpecification);
            }
            if (result == null) {
                result = this.caseNamedElement(failureDimensionResultSpecification);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSensitivityConfiguration(final SensitivityConfiguration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSensitivityParameter(final SensitivityParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Combined Sensitivity Parameter</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Combined Sensitivity Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCombinedSensitivityParameter(final CombinedSensitivityParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Result Specification</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Result Specification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSensitivityResultSpecification(final SensitivityResultSpecification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Single Sensitivity Parameter</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Single Sensitivity Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSingleSensitivityParameter(final SingleSensitivityParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter Variation</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter Variation</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSensitivityParameterVariation(final SensitivityParameterVariation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Component Reliability Parameter</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Component Reliability Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComponentReliabilityParameter(final ComponentReliabilityParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Double Parameter Variation</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Double Parameter Variation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoubleParameterVariation(final DoubleParameterVariation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>String Parameter Sequence</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>String Parameter Sequence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringParameterSequence(final StringParameterSequence object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Double Parameter Range</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Double Parameter Range</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoubleParameterRange(final DoubleParameterRange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Double Parameter Sequence</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Double Parameter Sequence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoubleParameterSequence(final DoubleParameterSequence object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Double Parameter Function</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Double Parameter Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoubleParameterFunction(final DoubleParameterFunction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Internal Action Reliability Parameter</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Internal Action Reliability Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInternalActionReliabilityParameter(final InternalActionReliabilityParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Probabilistic Branch Parameter</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Probabilistic Branch Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProbabilisticBranchParameter(final ProbabilisticBranchParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Hardware MTTF Parameter</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Hardware MTTF Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHardwareMTTFParameter(final HardwareMTTFParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Hardware MTTR Parameter</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Hardware MTTR Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHardwareMTTRParameter(final HardwareMTTRParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Resource MTTF Parameter</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Resource MTTF Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceMTTFParameter(final ResourceMTTFParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Resource MTTR Parameter</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Resource MTTR Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceMTTRParameter(final ResourceMTTRParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Network Reliability Parameter</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Network Reliability Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNetworkReliabilityParameter(final NetworkReliabilityParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Communication Link Reliability Parameter</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Communication Link Reliability Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommunicationLinkReliabilityParameter(final CommunicationLinkReliabilityParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Software Reliability Parameter</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Software Reliability Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoftwareReliabilityParameter(final SoftwareReliabilityParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Variable Usage Parameter</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Variable Usage Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableUsageParameter(final VariableUsageParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Usage Branch Parameter</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Usage Branch Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUsageBranchParameter(final UsageBranchParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Double Offset Sequence</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Double Offset Sequence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoubleOffsetSequence(final DoubleOffsetSequence object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Software Failure Types Parameter</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Software Failure Types Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoftwareFailureTypesParameter(final SoftwareFailureTypesParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Failure Type Result Specification</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Failure Type Result Specification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFailureTypeResultSpecification(final FailureTypeResultSpecification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Failure Dimension Result Specification</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Failure Dimension Result Specification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFailureDimensionResultSpecification(final FailureDimensionResultSpecification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(final NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(final Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // SensitivitySwitch
