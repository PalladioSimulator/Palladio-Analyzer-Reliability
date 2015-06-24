/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.parameter.ParameterPackage;
import org.palladiosimulator.pcm.reliability.ReliabilityPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;
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
import org.palladiosimulator.reliability.sensitivity.SensitivityFactory;
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
import org.palladiosimulator.reliability.sensitivity.util.SensitivityValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class SensitivityPackageImpl extends EPackageImpl implements SensitivityPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass sensitivityConfigurationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass sensitivityParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass combinedSensitivityParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass sensitivityResultSpecificationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass singleSensitivityParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass sensitivityParameterVariationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass componentReliabilityParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass doubleParameterVariationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass stringParameterSequenceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass doubleParameterRangeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass doubleParameterSequenceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass doubleParameterFunctionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass internalActionReliabilityParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass probabilisticBranchParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass hardwareMTTFParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass hardwareMTTRParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass resourceMTTFParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass resourceMTTRParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass networkReliabilityParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass communicationLinkReliabilityParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass softwareReliabilityParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass variableUsageParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass usageBranchParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass doubleOffsetSequenceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass softwareFailureTypesParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass failureTypeResultSpecificationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass failureDimensionResultSpecificationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum variableUsageTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum doubleOffsetTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum failureDimensionEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SensitivityPackageImpl() {
        super(eNS_URI, SensitivityFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link SensitivityPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SensitivityPackage init() {
        if (isInited) {
            return (SensitivityPackage) EPackage.Registry.INSTANCE.getEPackage(SensitivityPackage.eNS_URI);
        }

        // Obtain or create and register package
        final SensitivityPackageImpl theSensitivityPackage = (SensitivityPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof SensitivityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new SensitivityPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PcmPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSensitivityPackage.createPackageContents();

        // Initialize created meta-data
        theSensitivityPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put(theSensitivityPackage, new EValidator.Descriptor() {

            @Override
            public EValidator getEValidator() {
                return SensitivityValidator.INSTANCE;
            }
        });

        // Mark meta-data to indicate it can't be changed
        theSensitivityPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SensitivityPackage.eNS_URI, theSensitivityPackage);
        return theSensitivityPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSensitivityConfiguration() {
        return this.sensitivityConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSensitivityConfiguration_SensitivityParameters__SensitivityConfiguration() {
        return (EReference) this.sensitivityConfigurationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSensitivityConfiguration_SensitivityResultSpecifications__SensitivityConfiguration() {
        return (EReference) this.sensitivityConfigurationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSensitivityParameter() {
        return this.sensitivityParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSensitivityParameter_ParentParameter__SensitivityParameter() {
        return (EReference) this.sensitivityParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSensitivityParameter_SensitivityConfiguration__SensitivityParameter() {
        return (EReference) this.sensitivityParameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getCombinedSensitivityParameter() {
        return this.combinedSensitivityParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getCombinedSensitivityParameter_IsCombinatory() {
        return (EAttribute) this.combinedSensitivityParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getCombinedSensitivityParameter_ChildParameters__CombinedSensitivityParameter() {
        return (EReference) this.combinedSensitivityParameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSensitivityResultSpecification() {
        return this.sensitivityResultSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSingleSensitivityParameter() {
        return this.singleSensitivityParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSingleSensitivityParameter_SensitivityParameterVariation__SingleSensitivityParameter() {
        return (EReference) this.singleSensitivityParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSensitivityParameterVariation() {
        return this.sensitivityParameterVariationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSensitivityParameterVariation_SingleSensitivityParameter__SensitivityParameterVariation() {
        return (EReference) this.sensitivityParameterVariationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getComponentReliabilityParameter() {
        return this.componentReliabilityParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getComponentReliabilityParameter_BasicComponent__ComponentReliabilityParameter() {
        return (EReference) this.componentReliabilityParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDoubleParameterVariation() {
        return this.doubleParameterVariationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getStringParameterSequence() {
        return this.stringParameterSequenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getStringParameterSequence_StringValues() {
        return (EAttribute) this.stringParameterSequenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDoubleParameterRange() {
        return this.doubleParameterRangeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDoubleParameterRange_ConsiderStepSize() {
        return (EAttribute) this.doubleParameterRangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDoubleParameterRange_FirstValue() {
        return (EAttribute) this.doubleParameterRangeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDoubleParameterRange_LastValue() {
        return (EAttribute) this.doubleParameterRangeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDoubleParameterRange_StepSize() {
        return (EAttribute) this.doubleParameterRangeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDoubleParameterRange_StepCount() {
        return (EAttribute) this.doubleParameterRangeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDoubleParameterSequence() {
        return this.doubleParameterSequenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDoubleParameterSequence_DoubleValues() {
        return (EAttribute) this.doubleParameterSequenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDoubleParameterFunction() {
        return this.doubleParameterFunctionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getInternalActionReliabilityParameter() {
        return this.internalActionReliabilityParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getInternalActionReliabilityParameter_SoftwareInducedFailureType__InternalActionReliabilityParameter() {
        return (EReference) this.internalActionReliabilityParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getInternalActionReliabilityParameter_InternalAction__InternalActionReliabilityParameter() {
        return (EReference) this.internalActionReliabilityParameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getProbabilisticBranchParameter() {
        return this.probabilisticBranchParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getProbabilisticBranchParameter_ProbabilisticBranchTransition__ProbabilisticBranchParameter() {
        return (EReference) this.probabilisticBranchParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getHardwareMTTFParameter() {
        return this.hardwareMTTFParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getHardwareMTTRParameter() {
        return this.hardwareMTTRParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getResourceMTTFParameter() {
        return this.resourceMTTFParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getResourceMTTFParameter_ProcessingResourceType__ResourceMTTFParameter() {
        return (EReference) this.resourceMTTFParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getResourceMTTFParameter_ResourceContainer__ResourceMTTFParameter() {
        return (EReference) this.resourceMTTFParameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getResourceMTTRParameter() {
        return this.resourceMTTRParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getResourceMTTRParameter_ResourceContainer__ResourceMTTRParameter() {
        return (EReference) this.resourceMTTRParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getResourceMTTRParameter_ProcessingResourceType__ResourceMTTRParameter() {
        return (EReference) this.resourceMTTRParameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNetworkReliabilityParameter() {
        return this.networkReliabilityParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getCommunicationLinkReliabilityParameter() {
        return this.communicationLinkReliabilityParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getCommunicationLinkReliabilityParameter_CommunicationLinkResourceSpecification__CommunicationLinkReliabilityParameter() {
        return (EReference) this.communicationLinkReliabilityParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSoftwareReliabilityParameter() {
        return this.softwareReliabilityParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getVariableUsageParameter() {
        return this.variableUsageParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getVariableUsageParameter_VariableName() {
        return (EAttribute) this.variableUsageParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getVariableUsageParameter_EntryLevelSystemCall__VariableUsageParameter() {
        return (EReference) this.variableUsageParameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getVariableUsageParameter_VariableCharacterisationType__VariableUsageParameter() {
        return (EAttribute) this.variableUsageParameterEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getVariableUsageParameter_VariableUsageType__VariableUsageParameter() {
        return (EAttribute) this.variableUsageParameterEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getVariableUsageParameter_BasicComponent__VariableUsageParameter() {
        return (EReference) this.variableUsageParameterEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getUsageBranchParameter() {
        return this.usageBranchParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getUsageBranchParameter_Branch__UsageBranchParameter() {
        return (EReference) this.usageBranchParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getUsageBranchParameter_ScenarioBehaviour__UsageBranchParameter() {
        return (EReference) this.usageBranchParameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDoubleOffsetSequence() {
        return this.doubleOffsetSequenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDoubleOffsetSequence_OffsetValues() {
        return (EAttribute) this.doubleOffsetSequenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDoubleOffsetSequence_DoubleOffsetType__DoubleOffsetSequence() {
        return (EAttribute) this.doubleOffsetSequenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSoftwareFailureTypesParameter() {
        return this.softwareFailureTypesParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSoftwareFailureTypesParameter_SoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter() {
        return (EReference) this.softwareFailureTypesParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getFailureTypeResultSpecification() {
        return this.failureTypeResultSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFailureTypeResultSpecification_FailureTypes__FailureTypeResultSpecification() {
        return (EReference) this.failureTypeResultSpecificationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getFailureDimensionResultSpecification() {
        return this.failureDimensionResultSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getFailureDimensionResultSpecification_FailureDimension__FailureDimensionResultSpecification() {
        return (EAttribute) this.failureDimensionResultSpecificationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getVariableUsageType() {
        return this.variableUsageTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getDoubleOffsetType() {
        return this.doubleOffsetTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getFailureDimension() {
        return this.failureDimensionEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SensitivityFactory getSensitivityFactory() {
        return (SensitivityFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.sensitivityConfigurationEClass = this.createEClass(SENSITIVITY_CONFIGURATION);
        this.createEReference(this.sensitivityConfigurationEClass,
                SENSITIVITY_CONFIGURATION__SENSITIVITY_PARAMETERS_SENSITIVITY_CONFIGURATION);
        this.createEReference(this.sensitivityConfigurationEClass,
                SENSITIVITY_CONFIGURATION__SENSITIVITY_RESULT_SPECIFICATIONS_SENSITIVITY_CONFIGURATION);

        this.sensitivityParameterEClass = this.createEClass(SENSITIVITY_PARAMETER);
        this.createEReference(this.sensitivityParameterEClass,
                SENSITIVITY_PARAMETER__PARENT_PARAMETER_SENSITIVITY_PARAMETER);
        this.createEReference(this.sensitivityParameterEClass,
                SENSITIVITY_PARAMETER__SENSITIVITY_CONFIGURATION_SENSITIVITY_PARAMETER);

        this.combinedSensitivityParameterEClass = this.createEClass(COMBINED_SENSITIVITY_PARAMETER);
        this.createEAttribute(this.combinedSensitivityParameterEClass, COMBINED_SENSITIVITY_PARAMETER__IS_COMBINATORY);
        this.createEReference(this.combinedSensitivityParameterEClass,
                COMBINED_SENSITIVITY_PARAMETER__CHILD_PARAMETERS_COMBINED_SENSITIVITY_PARAMETER);

        this.sensitivityResultSpecificationEClass = this.createEClass(SENSITIVITY_RESULT_SPECIFICATION);

        this.singleSensitivityParameterEClass = this.createEClass(SINGLE_SENSITIVITY_PARAMETER);
        this.createEReference(this.singleSensitivityParameterEClass,
                SINGLE_SENSITIVITY_PARAMETER__SENSITIVITY_PARAMETER_VARIATION_SINGLE_SENSITIVITY_PARAMETER);

        this.sensitivityParameterVariationEClass = this.createEClass(SENSITIVITY_PARAMETER_VARIATION);
        this.createEReference(this.sensitivityParameterVariationEClass,
                SENSITIVITY_PARAMETER_VARIATION__SINGLE_SENSITIVITY_PARAMETER_SENSITIVITY_PARAMETER_VARIATION);

        this.componentReliabilityParameterEClass = this.createEClass(COMPONENT_RELIABILITY_PARAMETER);
        this.createEReference(this.componentReliabilityParameterEClass,
                COMPONENT_RELIABILITY_PARAMETER__BASIC_COMPONENT_COMPONENT_RELIABILITY_PARAMETER);

        this.doubleParameterVariationEClass = this.createEClass(DOUBLE_PARAMETER_VARIATION);

        this.stringParameterSequenceEClass = this.createEClass(STRING_PARAMETER_SEQUENCE);
        this.createEAttribute(this.stringParameterSequenceEClass, STRING_PARAMETER_SEQUENCE__STRING_VALUES);

        this.doubleParameterRangeEClass = this.createEClass(DOUBLE_PARAMETER_RANGE);
        this.createEAttribute(this.doubleParameterRangeEClass, DOUBLE_PARAMETER_RANGE__CONSIDER_STEP_SIZE);
        this.createEAttribute(this.doubleParameterRangeEClass, DOUBLE_PARAMETER_RANGE__FIRST_VALUE);
        this.createEAttribute(this.doubleParameterRangeEClass, DOUBLE_PARAMETER_RANGE__LAST_VALUE);
        this.createEAttribute(this.doubleParameterRangeEClass, DOUBLE_PARAMETER_RANGE__STEP_SIZE);
        this.createEAttribute(this.doubleParameterRangeEClass, DOUBLE_PARAMETER_RANGE__STEP_COUNT);

        this.doubleParameterSequenceEClass = this.createEClass(DOUBLE_PARAMETER_SEQUENCE);
        this.createEAttribute(this.doubleParameterSequenceEClass, DOUBLE_PARAMETER_SEQUENCE__DOUBLE_VALUES);

        this.doubleParameterFunctionEClass = this.createEClass(DOUBLE_PARAMETER_FUNCTION);

        this.internalActionReliabilityParameterEClass = this.createEClass(INTERNAL_ACTION_RELIABILITY_PARAMETER);
        this.createEReference(this.internalActionReliabilityParameterEClass,
                INTERNAL_ACTION_RELIABILITY_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_ACTION_RELIABILITY_PARAMETER);
        this.createEReference(this.internalActionReliabilityParameterEClass,
                INTERNAL_ACTION_RELIABILITY_PARAMETER__INTERNAL_ACTION_INTERNAL_ACTION_RELIABILITY_PARAMETER);

        this.probabilisticBranchParameterEClass = this.createEClass(PROBABILISTIC_BRANCH_PARAMETER);
        this.createEReference(this.probabilisticBranchParameterEClass,
                PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_TRANSITION_PROBABILISTIC_BRANCH_PARAMETER);

        this.hardwareMTTFParameterEClass = this.createEClass(HARDWARE_MTTF_PARAMETER);

        this.hardwareMTTRParameterEClass = this.createEClass(HARDWARE_MTTR_PARAMETER);

        this.resourceMTTFParameterEClass = this.createEClass(RESOURCE_MTTF_PARAMETER);
        this.createEReference(this.resourceMTTFParameterEClass,
                RESOURCE_MTTF_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTF_PARAMETER);
        this.createEReference(this.resourceMTTFParameterEClass,
                RESOURCE_MTTF_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTF_PARAMETER);

        this.resourceMTTRParameterEClass = this.createEClass(RESOURCE_MTTR_PARAMETER);
        this.createEReference(this.resourceMTTRParameterEClass,
                RESOURCE_MTTR_PARAMETER__RESOURCE_CONTAINER_RESOURCE_MTTR_PARAMETER);
        this.createEReference(this.resourceMTTRParameterEClass,
                RESOURCE_MTTR_PARAMETER__PROCESSING_RESOURCE_TYPE_RESOURCE_MTTR_PARAMETER);

        this.networkReliabilityParameterEClass = this.createEClass(NETWORK_RELIABILITY_PARAMETER);

        this.communicationLinkReliabilityParameterEClass = this.createEClass(COMMUNICATION_LINK_RELIABILITY_PARAMETER);
        this.createEReference(this.communicationLinkReliabilityParameterEClass,
                COMMUNICATION_LINK_RELIABILITY_PARAMETER__COMMUNICATION_LINK_RESOURCE_SPECIFICATION_COMMUNICATION_LINK_RELIABILITY_PARAMETER);

        this.softwareReliabilityParameterEClass = this.createEClass(SOFTWARE_RELIABILITY_PARAMETER);

        this.variableUsageParameterEClass = this.createEClass(VARIABLE_USAGE_PARAMETER);
        this.createEAttribute(this.variableUsageParameterEClass, VARIABLE_USAGE_PARAMETER__VARIABLE_NAME);
        this.createEReference(this.variableUsageParameterEClass,
                VARIABLE_USAGE_PARAMETER__ENTRY_LEVEL_SYSTEM_CALL_VARIABLE_USAGE_PARAMETER);
        this.createEAttribute(this.variableUsageParameterEClass,
                VARIABLE_USAGE_PARAMETER__VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER);
        this.createEAttribute(this.variableUsageParameterEClass,
                VARIABLE_USAGE_PARAMETER__VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER);
        this.createEReference(this.variableUsageParameterEClass,
                VARIABLE_USAGE_PARAMETER__BASIC_COMPONENT_VARIABLE_USAGE_PARAMETER);

        this.usageBranchParameterEClass = this.createEClass(USAGE_BRANCH_PARAMETER);
        this.createEReference(this.usageBranchParameterEClass, USAGE_BRANCH_PARAMETER__BRANCH_USAGE_BRANCH_PARAMETER);
        this.createEReference(this.usageBranchParameterEClass,
                USAGE_BRANCH_PARAMETER__SCENARIO_BEHAVIOUR_USAGE_BRANCH_PARAMETER);

        this.doubleOffsetSequenceEClass = this.createEClass(DOUBLE_OFFSET_SEQUENCE);
        this.createEAttribute(this.doubleOffsetSequenceEClass, DOUBLE_OFFSET_SEQUENCE__OFFSET_VALUES);
        this.createEAttribute(this.doubleOffsetSequenceEClass,
                DOUBLE_OFFSET_SEQUENCE__DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE);

        this.softwareFailureTypesParameterEClass = this.createEClass(SOFTWARE_FAILURE_TYPES_PARAMETER);
        this.createEReference(this.softwareFailureTypesParameterEClass,
                SOFTWARE_FAILURE_TYPES_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPES_SOFTWARE_FAILURE_TYPE_RELIABILITY_PARAMETER);

        this.failureTypeResultSpecificationEClass = this.createEClass(FAILURE_TYPE_RESULT_SPECIFICATION);
        this.createEReference(this.failureTypeResultSpecificationEClass,
                FAILURE_TYPE_RESULT_SPECIFICATION__FAILURE_TYPES_FAILURE_TYPE_RESULT_SPECIFICATION);

        this.failureDimensionResultSpecificationEClass = this.createEClass(FAILURE_DIMENSION_RESULT_SPECIFICATION);
        this.createEAttribute(this.failureDimensionResultSpecificationEClass,
                FAILURE_DIMENSION_RESULT_SPECIFICATION__FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION);

        // Create enums
        this.variableUsageTypeEEnum = this.createEEnum(VARIABLE_USAGE_TYPE);
        this.doubleOffsetTypeEEnum = this.createEEnum(DOUBLE_OFFSET_TYPE);
        this.failureDimensionEEnum = this.createEEnum(FAILURE_DIMENSION);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
                .getEPackage(EntityPackage.eNS_URI);
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
                .getEPackage(RepositoryPackage.eNS_URI);
        final ReliabilityPackage theReliabilityPackage = (ReliabilityPackage) EPackage.Registry.INSTANCE
                .getEPackage(ReliabilityPackage.eNS_URI);
        final SeffPackage theSeffPackage = (SeffPackage) EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);
        final ResourcetypePackage theResourcetypePackage = (ResourcetypePackage) EPackage.Registry.INSTANCE
                .getEPackage(ResourcetypePackage.eNS_URI);
        final ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage) EPackage.Registry.INSTANCE
                .getEPackage(ResourceenvironmentPackage.eNS_URI);
        final UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage) EPackage.Registry.INSTANCE
                .getEPackage(UsagemodelPackage.eNS_URI);
        final ParameterPackage theParameterPackage = (ParameterPackage) EPackage.Registry.INSTANCE
                .getEPackage(ParameterPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.sensitivityConfigurationEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.sensitivityParameterEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.combinedSensitivityParameterEClass.getESuperTypes().add(this.getSensitivityParameter());
        this.sensitivityResultSpecificationEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.singleSensitivityParameterEClass.getESuperTypes().add(this.getSensitivityParameter());
        this.componentReliabilityParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.doubleParameterVariationEClass.getESuperTypes().add(this.getSensitivityParameterVariation());
        this.stringParameterSequenceEClass.getESuperTypes().add(this.getSensitivityParameterVariation());
        this.doubleParameterRangeEClass.getESuperTypes().add(this.getDoubleParameterVariation());
        this.doubleParameterSequenceEClass.getESuperTypes().add(this.getDoubleParameterVariation());
        this.doubleParameterFunctionEClass.getESuperTypes().add(this.getDoubleParameterVariation());
        this.internalActionReliabilityParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.probabilisticBranchParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.hardwareMTTFParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.hardwareMTTRParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.resourceMTTFParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.resourceMTTRParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.networkReliabilityParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.communicationLinkReliabilityParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.softwareReliabilityParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.variableUsageParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.usageBranchParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.doubleOffsetSequenceEClass.getESuperTypes().add(this.getDoubleParameterVariation());
        this.softwareFailureTypesParameterEClass.getESuperTypes().add(this.getSingleSensitivityParameter());
        this.failureTypeResultSpecificationEClass.getESuperTypes().add(this.getSensitivityResultSpecification());
        this.failureDimensionResultSpecificationEClass.getESuperTypes().add(this.getSensitivityResultSpecification());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.sensitivityConfigurationEClass, SensitivityConfiguration.class, "SensitivityConfiguration",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSensitivityConfiguration_SensitivityParameters__SensitivityConfiguration(),
                this.getSensitivityParameter(),
                this.getSensitivityParameter_SensitivityConfiguration__SensitivityParameter(),
                "sensitivityParameters__SensitivityConfiguration", null, 1, 1, SensitivityConfiguration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(
                this.getSensitivityConfiguration_SensitivityResultSpecifications__SensitivityConfiguration(),
                this.getSensitivityResultSpecification(), null,
                "sensitivityResultSpecifications__SensitivityConfiguration", null, 0, -1,
                SensitivityConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.sensitivityParameterEClass, SensitivityParameter.class, "SensitivityParameter",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSensitivityParameter_ParentParameter__SensitivityParameter(),
                this.getCombinedSensitivityParameter(),
                this.getCombinedSensitivityParameter_ChildParameters__CombinedSensitivityParameter(),
                "parentParameter__SensitivityParameter", null, 0, 1, SensitivityParameter.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        this.initEReference(this.getSensitivityParameter_SensitivityConfiguration__SensitivityParameter(),
                this.getSensitivityConfiguration(),
                this.getSensitivityConfiguration_SensitivityParameters__SensitivityConfiguration(),
                "sensitivityConfiguration__SensitivityParameter", null, 0, 1, SensitivityParameter.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);

        this.initEClass(this.combinedSensitivityParameterEClass, CombinedSensitivityParameter.class,
                "CombinedSensitivityParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getCombinedSensitivityParameter_IsCombinatory(), this.ecorePackage.getEBoolean(),
                "isCombinatory", null, 1, 1, CombinedSensitivityParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getCombinedSensitivityParameter_ChildParameters__CombinedSensitivityParameter(),
                this.getSensitivityParameter(), this.getSensitivityParameter_ParentParameter__SensitivityParameter(),
                "childParameters__CombinedSensitivityParameter", null, 1, -1, CombinedSensitivityParameter.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.sensitivityResultSpecificationEClass, SensitivityResultSpecification.class,
                "SensitivityResultSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.singleSensitivityParameterEClass, SingleSensitivityParameter.class,
                "SingleSensitivityParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(
                this.getSingleSensitivityParameter_SensitivityParameterVariation__SingleSensitivityParameter(),
                this.getSensitivityParameterVariation(),
                this.getSensitivityParameterVariation_SingleSensitivityParameter__SensitivityParameterVariation(),
                "sensitivityParameterVariation__SingleSensitivityParameter", null, 1, 1,
                SingleSensitivityParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.sensitivityParameterVariationEClass, SensitivityParameterVariation.class,
                "SensitivityParameterVariation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(
                this.getSensitivityParameterVariation_SingleSensitivityParameter__SensitivityParameterVariation(),
                this.getSingleSensitivityParameter(),
                this.getSingleSensitivityParameter_SensitivityParameterVariation__SingleSensitivityParameter(),
                "singleSensitivityParameter__SensitivityParameterVariation", null, 1, 1,
                SensitivityParameterVariation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.componentReliabilityParameterEClass, ComponentReliabilityParameter.class,
                "ComponentReliabilityParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getComponentReliabilityParameter_BasicComponent__ComponentReliabilityParameter(),
                theRepositoryPackage.getBasicComponent(), null, "basicComponent__ComponentReliabilityParameter", null,
                1, 1, ComponentReliabilityParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        EOperation op = this.addEOperation(this.componentReliabilityParameterEClass, this.ecorePackage.getEBoolean(),
                "ComponentReliabilityParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = this.createEGenericType(this.ecorePackage.getEMap());
        EGenericType g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.doubleParameterVariationEClass, DoubleParameterVariation.class, "DoubleParameterVariation",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.stringParameterSequenceEClass, StringParameterSequence.class, "StringParameterSequence",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getStringParameterSequence_StringValues(), this.ecorePackage.getEString(),
                "stringValues", null, 1, -1, StringParameterSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.doubleParameterRangeEClass, DoubleParameterRange.class, "DoubleParameterRange",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getDoubleParameterRange_ConsiderStepSize(), this.ecorePackage.getEBoolean(),
                "considerStepSize", null, 1, 1, DoubleParameterRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getDoubleParameterRange_FirstValue(), this.ecorePackage.getEDouble(), "firstValue",
                null, 1, 1, DoubleParameterRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getDoubleParameterRange_LastValue(), this.ecorePackage.getEDouble(), "lastValue", null,
                1, 1, DoubleParameterRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getDoubleParameterRange_StepSize(), this.ecorePackage.getEDouble(), "stepSize", null,
                1, 1, DoubleParameterRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getDoubleParameterRange_StepCount(), this.ecorePackage.getEInt(), "stepCount", null, 1,
                1, DoubleParameterRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.doubleParameterSequenceEClass, DoubleParameterSequence.class, "DoubleParameterSequence",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getDoubleParameterSequence_DoubleValues(), this.ecorePackage.getEDouble(),
                "doubleValues", null, 1, -1, DoubleParameterSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.doubleParameterFunctionEClass, DoubleParameterFunction.class, "DoubleParameterFunction",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.internalActionReliabilityParameterEClass, InternalActionReliabilityParameter.class,
                "InternalActionReliabilityParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(
                this.getInternalActionReliabilityParameter_SoftwareInducedFailureType__InternalActionReliabilityParameter(),
                theReliabilityPackage.getSoftwareInducedFailureType(), null,
                "softwareInducedFailureType__InternalActionReliabilityParameter", null, 1, 1,
                InternalActionReliabilityParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(
                this.getInternalActionReliabilityParameter_InternalAction__InternalActionReliabilityParameter(),
                theSeffPackage.getInternalAction(), null, "internalAction__InternalActionReliabilityParameter", null, 1,
                1, InternalActionReliabilityParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.internalActionReliabilityParameterEClass, this.ecorePackage.getEBoolean(),
                "InternalActionReliabilityParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.probabilisticBranchParameterEClass, ProbabilisticBranchParameter.class,
                "ProbabilisticBranchParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(
                this.getProbabilisticBranchParameter_ProbabilisticBranchTransition__ProbabilisticBranchParameter(),
                theSeffPackage.getProbabilisticBranchTransition(), null,
                "probabilisticBranchTransition__ProbabilisticBranchParameter", null, 1, 1,
                ProbabilisticBranchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.probabilisticBranchParameterEClass, this.ecorePackage.getEBoolean(),
                "ProbabilisticBranchParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.hardwareMTTFParameterEClass, HardwareMTTFParameter.class, "HardwareMTTFParameter",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = this.addEOperation(this.hardwareMTTFParameterEClass, this.ecorePackage.getEBoolean(),
                "HardwareMTTFParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.hardwareMTTRParameterEClass, HardwareMTTRParameter.class, "HardwareMTTRParameter",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = this.addEOperation(this.hardwareMTTRParameterEClass, this.ecorePackage.getEBoolean(),
                "HardwareMTTRParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.resourceMTTFParameterEClass, ResourceMTTFParameter.class, "ResourceMTTFParameter",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getResourceMTTFParameter_ProcessingResourceType__ResourceMTTFParameter(),
                theResourcetypePackage.getProcessingResourceType(), null,
                "processingResourceType__ResourceMTTFParameter", null, 1, 1, ResourceMTTFParameter.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        this.initEReference(this.getResourceMTTFParameter_ResourceContainer__ResourceMTTFParameter(),
                theResourceenvironmentPackage.getResourceContainer(), null, "resourceContainer__ResourceMTTFParameter",
                null, 1, 1, ResourceMTTFParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.resourceMTTFParameterEClass, this.ecorePackage.getEBoolean(),
                "ResourceMTTFParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.resourceMTTRParameterEClass, ResourceMTTRParameter.class, "ResourceMTTRParameter",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getResourceMTTRParameter_ResourceContainer__ResourceMTTRParameter(),
                theResourceenvironmentPackage.getResourceContainer(), null, "resourceContainer__ResourceMTTRParameter",
                null, 1, 1, ResourceMTTRParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getResourceMTTRParameter_ProcessingResourceType__ResourceMTTRParameter(),
                theResourcetypePackage.getProcessingResourceType(), null,
                "processingResourceType__ResourceMTTRParameter", null, 1, 1, ResourceMTTRParameter.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);

        op = this.addEOperation(this.resourceMTTRParameterEClass, this.ecorePackage.getEBoolean(),
                "ResourceMTTRParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.networkReliabilityParameterEClass, NetworkReliabilityParameter.class,
                "NetworkReliabilityParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = this.addEOperation(this.networkReliabilityParameterEClass, this.ecorePackage.getEBoolean(),
                "NetworkReliabilityParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.communicationLinkReliabilityParameterEClass, CommunicationLinkReliabilityParameter.class,
                "CommunicationLinkReliabilityParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(
                this.getCommunicationLinkReliabilityParameter_CommunicationLinkResourceSpecification__CommunicationLinkReliabilityParameter(),
                theResourceenvironmentPackage.getCommunicationLinkResourceSpecification(), null,
                "communicationLinkResourceSpecification__CommunicationLinkReliabilityParameter", null, 1, 1,
                CommunicationLinkReliabilityParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.communicationLinkReliabilityParameterEClass, this.ecorePackage.getEBoolean(),
                "CommunicationLinkParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.softwareReliabilityParameterEClass, SoftwareReliabilityParameter.class,
                "SoftwareReliabilityParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = this.addEOperation(this.softwareReliabilityParameterEClass, this.ecorePackage.getEBoolean(),
                "SoftwareReliabilityParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.variableUsageParameterEClass, VariableUsageParameter.class, "VariableUsageParameter",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getVariableUsageParameter_VariableName(), this.ecorePackage.getEString(),
                "VariableName", null, 1, 1, VariableUsageParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getVariableUsageParameter_EntryLevelSystemCall__VariableUsageParameter(),
                theUsagemodelPackage.getEntryLevelSystemCall(), null, "entryLevelSystemCall__VariableUsageParameter",
                null, 0, 1, VariableUsageParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getVariableUsageParameter_VariableCharacterisationType__VariableUsageParameter(),
                theParameterPackage.getVariableCharacterisationType(),
                "variableCharacterisationType__VariableUsageParameter", null, 1, 1, VariableUsageParameter.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        this.initEAttribute(this.getVariableUsageParameter_VariableUsageType__VariableUsageParameter(),
                this.getVariableUsageType(), "variableUsageType__VariableUsageParameter", null, 1, 1,
                VariableUsageParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getVariableUsageParameter_BasicComponent__VariableUsageParameter(),
                theRepositoryPackage.getBasicComponent(), null, "basicComponent__VariableUsageParameter", null, 0, 1,
                VariableUsageParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.variableUsageParameterEClass, this.ecorePackage.getEBoolean(),
                "SystemCallParameterMustHaveStringSequence", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.usageBranchParameterEClass, UsageBranchParameter.class, "UsageBranchParameter",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getUsageBranchParameter_Branch__UsageBranchParameter(),
                theUsagemodelPackage.getBranch(), null, "branch__UsageBranchParameter", null, 1, 1,
                UsageBranchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getUsageBranchParameter_ScenarioBehaviour__UsageBranchParameter(),
                theUsagemodelPackage.getScenarioBehaviour(), null, "scenarioBehaviour__UsageBranchParameter", null, 1,
                1, UsageBranchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.usageBranchParameterEClass, this.ecorePackage.getEBoolean(),
                "UsageBranchParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.doubleOffsetSequenceEClass, DoubleOffsetSequence.class, "DoubleOffsetSequence",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getDoubleOffsetSequence_OffsetValues(), this.ecorePackage.getEDouble(), "offsetValues",
                null, 1, -1, DoubleOffsetSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getDoubleOffsetSequence_DoubleOffsetType__DoubleOffsetSequence(),
                this.getDoubleOffsetType(), "doubleOffsetType__DoubleOffsetSequence", null, 1, 1,
                DoubleOffsetSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.softwareFailureTypesParameterEClass, SoftwareFailureTypesParameter.class,
                "SoftwareFailureTypesParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(
                this.getSoftwareFailureTypesParameter_SoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter(),
                theReliabilityPackage.getSoftwareInducedFailureType(), null,
                "softwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter", null, 1, -1,
                SoftwareFailureTypesParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.softwareFailureTypesParameterEClass, this.ecorePackage.getEBoolean(),
                "SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.failureTypeResultSpecificationEClass, FailureTypeResultSpecification.class,
                "FailureTypeResultSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getFailureTypeResultSpecification_FailureTypes__FailureTypeResultSpecification(),
                theReliabilityPackage.getFailureType(), null, "failureTypes__FailureTypeResultSpecification", null, 1,
                -1, FailureTypeResultSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.failureDimensionResultSpecificationEClass, FailureDimensionResultSpecification.class,
                "FailureDimensionResultSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(
                this.getFailureDimensionResultSpecification_FailureDimension__FailureDimensionResultSpecification(),
                this.getFailureDimension(), "failureDimension__FailureDimensionResultSpecification", null, 1, 1,
                FailureDimensionResultSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Initialize enums and add enum literals
        this.initEEnum(this.variableUsageTypeEEnum, VariableUsageType.class, "VariableUsageType");
        this.addEEnumLiteral(this.variableUsageTypeEEnum, VariableUsageType.SYSTEM_CALL_INPUT);
        this.addEEnumLiteral(this.variableUsageTypeEEnum, VariableUsageType.COMPONENT_CONFIGURATION);

        this.initEEnum(this.doubleOffsetTypeEEnum, DoubleOffsetType.class, "DoubleOffsetType");
        this.addEEnumLiteral(this.doubleOffsetTypeEEnum, DoubleOffsetType.ADD);
        this.addEEnumLiteral(this.doubleOffsetTypeEEnum, DoubleOffsetType.SUBTRACT);
        this.addEEnumLiteral(this.doubleOffsetTypeEEnum, DoubleOffsetType.MULTIPLY);
        this.addEEnumLiteral(this.doubleOffsetTypeEEnum, DoubleOffsetType.DIVIDE);

        this.initEEnum(this.failureDimensionEEnum, FailureDimension.class, "FailureDimension");
        this.addEEnumLiteral(this.failureDimensionEEnum, FailureDimension.SOFTWARE);
        this.addEEnumLiteral(this.failureDimensionEEnum, FailureDimension.HARDWARE);
        this.addEEnumLiteral(this.failureDimensionEEnum, FailureDimension.NETWORK);

        // Create resource
        this.createResource(eNS_URI);
    }

} // SensitivityPackageImpl
