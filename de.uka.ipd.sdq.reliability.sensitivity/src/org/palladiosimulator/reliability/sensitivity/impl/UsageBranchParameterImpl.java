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
import org.palladiosimulator.pcm.usagemodel.Branch;
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;
import org.palladiosimulator.reliability.sensitivity.UsageBranchParameter;
import org.palladiosimulator.reliability.sensitivity.util.SensitivityValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Usage Branch Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.UsageBranchParameterImpl#getBranch__UsageBranchParameter
 * <em>Branch Usage Branch Parameter</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.UsageBranchParameterImpl#getScenarioBehaviour__UsageBranchParameter
 * <em>Scenario Behaviour Usage Branch Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageBranchParameterImpl extends SingleSensitivityParameterImpl implements UsageBranchParameter {

    /**
     * The cached value of the '{@link #getBranch__UsageBranchParameter()
     * <em>Branch Usage Branch Parameter</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getBranch__UsageBranchParameter()
     * @generated
     * @ordered
     */
    protected Branch branch__UsageBranchParameter;

    /**
     * The cached value of the '{@link #getScenarioBehaviour__UsageBranchParameter()
     * <em>Scenario Behaviour Usage Branch Parameter</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getScenarioBehaviour__UsageBranchParameter()
     * @generated
     * @ordered
     */
    protected ScenarioBehaviour scenarioBehaviour__UsageBranchParameter;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected UsageBranchParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.USAGE_BRANCH_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Branch getBranch__UsageBranchParameter() {
        if (this.branch__UsageBranchParameter != null && ((EObject) this.branch__UsageBranchParameter).eIsProxy()) {
            final InternalEObject oldBranch__UsageBranchParameter = (InternalEObject) this.branch__UsageBranchParameter;
            this.branch__UsageBranchParameter = (Branch) this.eResolveProxy(oldBranch__UsageBranchParameter);
            if (this.branch__UsageBranchParameter != oldBranch__UsageBranchParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.USAGE_BRANCH_PARAMETER__BRANCH_USAGE_BRANCH_PARAMETER,
                            oldBranch__UsageBranchParameter, this.branch__UsageBranchParameter));
                }
            }
        }
        return this.branch__UsageBranchParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Branch basicGetBranch__UsageBranchParameter() {
        return this.branch__UsageBranchParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setBranch__UsageBranchParameter(final Branch newBranch__UsageBranchParameter) {
        final Branch oldBranch__UsageBranchParameter = this.branch__UsageBranchParameter;
        this.branch__UsageBranchParameter = newBranch__UsageBranchParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.USAGE_BRANCH_PARAMETER__BRANCH_USAGE_BRANCH_PARAMETER,
                    oldBranch__UsageBranchParameter, this.branch__UsageBranchParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ScenarioBehaviour getScenarioBehaviour__UsageBranchParameter() {
        if (this.scenarioBehaviour__UsageBranchParameter != null
                && ((EObject) this.scenarioBehaviour__UsageBranchParameter).eIsProxy()) {
            final InternalEObject oldScenarioBehaviour__UsageBranchParameter = (InternalEObject) this.scenarioBehaviour__UsageBranchParameter;
            this.scenarioBehaviour__UsageBranchParameter = (ScenarioBehaviour) this
                    .eResolveProxy(oldScenarioBehaviour__UsageBranchParameter);
            if (this.scenarioBehaviour__UsageBranchParameter != oldScenarioBehaviour__UsageBranchParameter) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SensitivityPackage.USAGE_BRANCH_PARAMETER__SCENARIO_BEHAVIOUR_USAGE_BRANCH_PARAMETER,
                            oldScenarioBehaviour__UsageBranchParameter, this.scenarioBehaviour__UsageBranchParameter));
                }
            }
        }
        return this.scenarioBehaviour__UsageBranchParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ScenarioBehaviour basicGetScenarioBehaviour__UsageBranchParameter() {
        return this.scenarioBehaviour__UsageBranchParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setScenarioBehaviour__UsageBranchParameter(
            final ScenarioBehaviour newScenarioBehaviour__UsageBranchParameter) {
        final ScenarioBehaviour oldScenarioBehaviour__UsageBranchParameter = this.scenarioBehaviour__UsageBranchParameter;
        this.scenarioBehaviour__UsageBranchParameter = newScenarioBehaviour__UsageBranchParameter;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.USAGE_BRANCH_PARAMETER__SCENARIO_BEHAVIOUR_USAGE_BRANCH_PARAMETER,
                    oldScenarioBehaviour__UsageBranchParameter, this.scenarioBehaviour__UsageBranchParameter));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean UsageBranchParameterMustHaveDoubleVariation(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics
                        .add(new BasicDiagnostic(Diagnostic.ERROR, SensitivityValidator.DIAGNOSTIC_SOURCE,
                                SensitivityValidator.USAGE_BRANCH_PARAMETER__USAGE_BRANCH_PARAMETER_MUST_HAVE_DOUBLE_VARIATION,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "UsageBranchParameterMustHaveDoubleVariation",
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
        case SensitivityPackage.USAGE_BRANCH_PARAMETER__BRANCH_USAGE_BRANCH_PARAMETER:
            if (resolve) {
                return this.getBranch__UsageBranchParameter();
            }
            return this.basicGetBranch__UsageBranchParameter();
        case SensitivityPackage.USAGE_BRANCH_PARAMETER__SCENARIO_BEHAVIOUR_USAGE_BRANCH_PARAMETER:
            if (resolve) {
                return this.getScenarioBehaviour__UsageBranchParameter();
            }
            return this.basicGetScenarioBehaviour__UsageBranchParameter();
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
        case SensitivityPackage.USAGE_BRANCH_PARAMETER__BRANCH_USAGE_BRANCH_PARAMETER:
            this.setBranch__UsageBranchParameter((Branch) newValue);
            return;
        case SensitivityPackage.USAGE_BRANCH_PARAMETER__SCENARIO_BEHAVIOUR_USAGE_BRANCH_PARAMETER:
            this.setScenarioBehaviour__UsageBranchParameter((ScenarioBehaviour) newValue);
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
        case SensitivityPackage.USAGE_BRANCH_PARAMETER__BRANCH_USAGE_BRANCH_PARAMETER:
            this.setBranch__UsageBranchParameter((Branch) null);
            return;
        case SensitivityPackage.USAGE_BRANCH_PARAMETER__SCENARIO_BEHAVIOUR_USAGE_BRANCH_PARAMETER:
            this.setScenarioBehaviour__UsageBranchParameter((ScenarioBehaviour) null);
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
        case SensitivityPackage.USAGE_BRANCH_PARAMETER__BRANCH_USAGE_BRANCH_PARAMETER:
            return this.branch__UsageBranchParameter != null;
        case SensitivityPackage.USAGE_BRANCH_PARAMETER__SCENARIO_BEHAVIOUR_USAGE_BRANCH_PARAMETER:
            return this.scenarioBehaviour__UsageBranchParameter != null;
        }
        return super.eIsSet(featureID);
    }

} // UsageBranchParameterImpl
