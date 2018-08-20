/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.palladiosimulator.pcm.reliability.SoftwareInducedFailureType;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.SoftwareFailureTypesParameter;
import org.palladiosimulator.reliability.sensitivity.util.SensitivityValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Software Failure Types Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.SoftwareFailureTypesParameterImpl#getSoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter
 * <em>Software Induced Failure Types Software Failure Type Reliability Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareFailureTypesParameterImpl extends SingleSensitivityParameterImpl
        implements SoftwareFailureTypesParameter {

    /**
     * The cached value of the '
     * {@link #getSoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter()
     * <em>Software Induced Failure Types Software Failure Type Reliability Parameter</em>}'
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter()
     * @generated
     * @ordered
     */
    protected EList<SoftwareInducedFailureType> softwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SoftwareFailureTypesParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.SOFTWARE_FAILURE_TYPES_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<SoftwareInducedFailureType> getSoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter() {
        if (this.softwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter == null) {
            this.softwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter = new EObjectResolvingEList<SoftwareInducedFailureType>(
                    SoftwareInducedFailureType.class, this,
                    SensitivityPackage.SOFTWARE_FAILURE_TYPES_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPES_SOFTWARE_FAILURE_TYPE_RELIABILITY_PARAMETER);
        }
        return this.softwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, SensitivityValidator.DIAGNOSTIC_SOURCE,
                                SensitivityValidator.SOFTWARE_FAILURE_TYPES_PARAMETER__SOFTWARE_FAILURE_TYPE_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "SoftwareFailureTypeReliabilityParameterMustHaveDoubleVariation",
                                                EObjectValidator.getObjectLabel(this, context) }),
                        new Object[] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SensitivityPackage.SOFTWARE_FAILURE_TYPES_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPES_SOFTWARE_FAILURE_TYPE_RELIABILITY_PARAMETER:
            return this.getSoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case SensitivityPackage.SOFTWARE_FAILURE_TYPES_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPES_SOFTWARE_FAILURE_TYPE_RELIABILITY_PARAMETER:
            this.getSoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter().clear();
            this.getSoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter()
                    .addAll((Collection<? extends SoftwareInducedFailureType>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case SensitivityPackage.SOFTWARE_FAILURE_TYPES_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPES_SOFTWARE_FAILURE_TYPE_RELIABILITY_PARAMETER:
            this.getSoftwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case SensitivityPackage.SOFTWARE_FAILURE_TYPES_PARAMETER__SOFTWARE_INDUCED_FAILURE_TYPES_SOFTWARE_FAILURE_TYPE_RELIABILITY_PARAMETER:
            return this.softwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter != null
                    && !this.softwareInducedFailureTypes__SoftwareFailureTypeReliabilityParameter.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SoftwareFailureTypesParameterImpl
