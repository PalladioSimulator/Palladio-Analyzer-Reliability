/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.reliability.sensitivity.FailureDimension;
import org.palladiosimulator.reliability.sensitivity.FailureDimensionResultSpecification;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Failure Dimension Result Specification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.FailureDimensionResultSpecificationImpl#getFailureDimension__FailureDimensionResultSpecification
 * <em>Failure Dimension Failure Dimension Result Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureDimensionResultSpecificationImpl extends SensitivityResultSpecificationImpl
        implements FailureDimensionResultSpecification {

    /**
     * The default value of the '{@link #getFailureDimension__FailureDimensionResultSpecification()
     * <em>Failure Dimension Failure Dimension Result Specification</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFailureDimension__FailureDimensionResultSpecification()
     * @generated
     * @ordered
     */
    protected static final FailureDimension FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION_EDEFAULT = FailureDimension.SOFTWARE;

    /**
     * The cached value of the '{@link #getFailureDimension__FailureDimensionResultSpecification()
     * <em>Failure Dimension Failure Dimension Result Specification</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFailureDimension__FailureDimensionResultSpecification()
     * @generated
     * @ordered
     */
    protected FailureDimension failureDimension__FailureDimensionResultSpecification = FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected FailureDimensionResultSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.FAILURE_DIMENSION_RESULT_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public FailureDimension getFailureDimension__FailureDimensionResultSpecification() {
        return this.failureDimension__FailureDimensionResultSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setFailureDimension__FailureDimensionResultSpecification(
            final FailureDimension newFailureDimension__FailureDimensionResultSpecification) {
        final FailureDimension oldFailureDimension__FailureDimensionResultSpecification = this.failureDimension__FailureDimensionResultSpecification;
        this.failureDimension__FailureDimensionResultSpecification = newFailureDimension__FailureDimensionResultSpecification == null
                ? FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION_EDEFAULT
                : newFailureDimension__FailureDimensionResultSpecification;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.FAILURE_DIMENSION_RESULT_SPECIFICATION__FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION,
                    oldFailureDimension__FailureDimensionResultSpecification,
                    this.failureDimension__FailureDimensionResultSpecification));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SensitivityPackage.FAILURE_DIMENSION_RESULT_SPECIFICATION__FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION:
            return this.getFailureDimension__FailureDimensionResultSpecification();
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
        case SensitivityPackage.FAILURE_DIMENSION_RESULT_SPECIFICATION__FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION:
            this.setFailureDimension__FailureDimensionResultSpecification((FailureDimension) newValue);
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
        case SensitivityPackage.FAILURE_DIMENSION_RESULT_SPECIFICATION__FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION:
            this.setFailureDimension__FailureDimensionResultSpecification(
                    FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION_EDEFAULT);
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
        case SensitivityPackage.FAILURE_DIMENSION_RESULT_SPECIFICATION__FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION:
            return this.failureDimension__FailureDimensionResultSpecification != FAILURE_DIMENSION_FAILURE_DIMENSION_RESULT_SPECIFICATION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (failureDimension__FailureDimensionResultSpecification: ");
        result.append(this.failureDimension__FailureDimensionResultSpecification);
        result.append(')');
        return result.toString();
    }

} // FailureDimensionResultSpecificationImpl
