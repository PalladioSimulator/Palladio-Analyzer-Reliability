/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterRange;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Double Parameter Range</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.DoubleParameterRangeImpl#isConsiderStepSize
 * <em>Consider Step Size</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.DoubleParameterRangeImpl#getFirstValue
 * <em>First Value</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.DoubleParameterRangeImpl#getLastValue
 * <em>Last Value</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.DoubleParameterRangeImpl#getStepSize
 * <em>Step Size</em>}</li>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.DoubleParameterRangeImpl#getStepCount
 * <em>Step Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleParameterRangeImpl extends DoubleParameterVariationImpl implements DoubleParameterRange {

    /**
     * The default value of the '{@link #isConsiderStepSize() <em>Consider Step Size</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isConsiderStepSize()
     * @generated
     * @ordered
     */
    protected static final boolean CONSIDER_STEP_SIZE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConsiderStepSize() <em>Consider Step Size</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isConsiderStepSize()
     * @generated
     * @ordered
     */
    protected boolean considerStepSize = CONSIDER_STEP_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getFirstValue() <em>First Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFirstValue()
     * @generated
     * @ordered
     */
    protected static final double FIRST_VALUE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getFirstValue() <em>First Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFirstValue()
     * @generated
     * @ordered
     */
    protected double firstValue = FIRST_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getLastValue() <em>Last Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLastValue()
     * @generated
     * @ordered
     */
    protected static final double LAST_VALUE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getLastValue() <em>Last Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLastValue()
     * @generated
     * @ordered
     */
    protected double lastValue = LAST_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getStepSize() <em>Step Size</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStepSize()
     * @generated
     * @ordered
     */
    protected static final double STEP_SIZE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getStepSize() <em>Step Size</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStepSize()
     * @generated
     * @ordered
     */
    protected double stepSize = STEP_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getStepCount() <em>Step Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStepCount()
     * @generated
     * @ordered
     */
    protected static final int STEP_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getStepCount() <em>Step Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStepCount()
     * @generated
     * @ordered
     */
    protected int stepCount = STEP_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DoubleParameterRangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.DOUBLE_PARAMETER_RANGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isConsiderStepSize() {
        return this.considerStepSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setConsiderStepSize(final boolean newConsiderStepSize) {
        final boolean oldConsiderStepSize = this.considerStepSize;
        this.considerStepSize = newConsiderStepSize;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.DOUBLE_PARAMETER_RANGE__CONSIDER_STEP_SIZE, oldConsiderStepSize,
                    this.considerStepSize));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getFirstValue() {
        return this.firstValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setFirstValue(final double newFirstValue) {
        final double oldFirstValue = this.firstValue;
        this.firstValue = newFirstValue;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.DOUBLE_PARAMETER_RANGE__FIRST_VALUE, oldFirstValue, this.firstValue));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getLastValue() {
        return this.lastValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLastValue(final double newLastValue) {
        final double oldLastValue = this.lastValue;
        this.lastValue = newLastValue;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.DOUBLE_PARAMETER_RANGE__LAST_VALUE, oldLastValue, this.lastValue));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getStepSize() {
        return this.stepSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setStepSize(final double newStepSize) {
        final double oldStepSize = this.stepSize;
        this.stepSize = newStepSize;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_SIZE, oldStepSize, this.stepSize));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getStepCount() {
        return this.stepCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setStepCount(final int newStepCount) {
        final int oldStepCount = this.stepCount;
        this.stepCount = newStepCount;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_COUNT, oldStepCount, this.stepCount));
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
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__CONSIDER_STEP_SIZE:
            return this.isConsiderStepSize();
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__FIRST_VALUE:
            return this.getFirstValue();
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__LAST_VALUE:
            return this.getLastValue();
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_SIZE:
            return this.getStepSize();
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_COUNT:
            return this.getStepCount();
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
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__CONSIDER_STEP_SIZE:
            this.setConsiderStepSize((Boolean) newValue);
            return;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__FIRST_VALUE:
            this.setFirstValue((Double) newValue);
            return;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__LAST_VALUE:
            this.setLastValue((Double) newValue);
            return;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_SIZE:
            this.setStepSize((Double) newValue);
            return;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_COUNT:
            this.setStepCount((Integer) newValue);
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
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__CONSIDER_STEP_SIZE:
            this.setConsiderStepSize(CONSIDER_STEP_SIZE_EDEFAULT);
            return;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__FIRST_VALUE:
            this.setFirstValue(FIRST_VALUE_EDEFAULT);
            return;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__LAST_VALUE:
            this.setLastValue(LAST_VALUE_EDEFAULT);
            return;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_SIZE:
            this.setStepSize(STEP_SIZE_EDEFAULT);
            return;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_COUNT:
            this.setStepCount(STEP_COUNT_EDEFAULT);
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
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__CONSIDER_STEP_SIZE:
            return this.considerStepSize != CONSIDER_STEP_SIZE_EDEFAULT;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__FIRST_VALUE:
            return this.firstValue != FIRST_VALUE_EDEFAULT;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__LAST_VALUE:
            return this.lastValue != LAST_VALUE_EDEFAULT;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_SIZE:
            return this.stepSize != STEP_SIZE_EDEFAULT;
        case SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_COUNT:
            return this.stepCount != STEP_COUNT_EDEFAULT;
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
        result.append(" (considerStepSize: ");
        result.append(this.considerStepSize);
        result.append(", firstValue: ");
        result.append(this.firstValue);
        result.append(", lastValue: ");
        result.append(this.lastValue);
        result.append(", stepSize: ");
        result.append(this.stepSize);
        result.append(", stepCount: ");
        result.append(this.stepCount);
        result.append(')');
        return result.toString();
    }

} // DoubleParameterRangeImpl
