/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.reliability.sensitivity.ComponentReliabilityParameter;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.util.SensitivityValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Component Reliability Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.ComponentReliabilityParameterImpl#getBasicComponent__ComponentReliabilityParameter
 * <em>Basic Component Component Reliability Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentReliabilityParameterImpl extends SingleSensitivityParameterImpl
        implements ComponentReliabilityParameter {

    /**
     * The cached value of the '{@link #getBasicComponent__ComponentReliabilityParameter()
     * <em>Basic Component Component Reliability Parameter</em>}' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getBasicComponent__ComponentReliabilityParameter()
     * @generated
     * @ordered
     */
    protected BasicComponent basicComponent__ComponentReliabilityParameter;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ComponentReliabilityParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.COMPONENT_RELIABILITY_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BasicComponent getBasicComponent__ComponentReliabilityParameter() {
        if (this.basicComponent__ComponentReliabilityParameter != null
                && ((EObject) this.basicComponent__ComponentReliabilityParameter).eIsProxy()) {
            final InternalEObject oldBasicComponent__ComponentReliabilityParameter = (InternalEObject) this.basicComponent__ComponentReliabilityParameter;
            this.basicComponent__ComponentReliabilityParameter = (BasicComponent) this
                    .eResolveProxy(oldBasicComponent__ComponentReliabilityParameter);
            if (this.basicComponent__ComponentReliabilityParameter != oldBasicComponent__ComponentReliabilityParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER__BASIC_COMPONENT_COMPONENT_RELIABILITY_PARAMETER,
                            oldBasicComponent__ComponentReliabilityParameter,
                            this.basicComponent__ComponentReliabilityParameter));
                }
            }
        }
        return this.basicComponent__ComponentReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public BasicComponent basicGetBasicComponent__ComponentReliabilityParameter() {
        return this.basicComponent__ComponentReliabilityParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setBasicComponent__ComponentReliabilityParameter(
            final BasicComponent newBasicComponent__ComponentReliabilityParameter) {
        final BasicComponent oldBasicComponent__ComponentReliabilityParameter = this.basicComponent__ComponentReliabilityParameter;
        this.basicComponent__ComponentReliabilityParameter = newBasicComponent__ComponentReliabilityParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER__BASIC_COMPONENT_COMPONENT_RELIABILITY_PARAMETER,
                    oldBasicComponent__ComponentReliabilityParameter,
                    this.basicComponent__ComponentReliabilityParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean ComponentReliabilityParameterMustHaveDoubleVariation(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, SensitivityValidator.DIAGNOSTIC_SOURCE,
                                SensitivityValidator.COMPONENT_RELIABILITY_PARAMETER__COMPONENT_RELIABILITY_PARAMETER_MUST_HAVE_DOUBLE_VARIATION,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "ComponentReliabilityParameterMustHaveDoubleVariation",
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
        case SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER__BASIC_COMPONENT_COMPONENT_RELIABILITY_PARAMETER:
            if (resolve) {
                return this.getBasicComponent__ComponentReliabilityParameter();
            }
            return this.basicGetBasicComponent__ComponentReliabilityParameter();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER__BASIC_COMPONENT_COMPONENT_RELIABILITY_PARAMETER:
            this.setBasicComponent__ComponentReliabilityParameter((BasicComponent) newValue);
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
        case SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER__BASIC_COMPONENT_COMPONENT_RELIABILITY_PARAMETER:
            this.setBasicComponent__ComponentReliabilityParameter((BasicComponent) null);
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
        case SensitivityPackage.COMPONENT_RELIABILITY_PARAMETER__BASIC_COMPONENT_COMPONENT_RELIABILITY_PARAMETER:
            return this.basicComponent__ComponentReliabilityParameter != null;
        }
        return super.eIsSet(featureID);
    }

} // ComponentReliabilityParameterImpl
