/**
 */
package org.palladiosimulator.reliability.sensitivity.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.palladiosimulator.pcm.reliability.FailureType;
import org.palladiosimulator.reliability.sensitivity.FailureTypeResultSpecification;
import org.palladiosimulator.reliability.sensitivity.SensitivityPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Failure Type Result Specification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.impl.FailureTypeResultSpecificationImpl#getFailureTypes__FailureTypeResultSpecification
 * <em>Failure Types Failure Type Result Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureTypeResultSpecificationImpl extends SensitivityResultSpecificationImpl
        implements FailureTypeResultSpecification {

    /**
     * The cached value of the '{@link #getFailureTypes__FailureTypeResultSpecification()
     * <em>Failure Types Failure Type Result Specification</em>}' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFailureTypes__FailureTypeResultSpecification()
     * @generated
     * @ordered
     */
    protected EList<FailureType> failureTypes__FailureTypeResultSpecification;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected FailureTypeResultSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SensitivityPackage.Literals.FAILURE_TYPE_RESULT_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<FailureType> getFailureTypes__FailureTypeResultSpecification() {
        if (this.failureTypes__FailureTypeResultSpecification == null) {
            this.failureTypes__FailureTypeResultSpecification = new EObjectResolvingEList<FailureType>(
                    FailureType.class, this,
                    SensitivityPackage.FAILURE_TYPE_RESULT_SPECIFICATION__FAILURE_TYPES_FAILURE_TYPE_RESULT_SPECIFICATION);
        }
        return this.failureTypes__FailureTypeResultSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SensitivityPackage.FAILURE_TYPE_RESULT_SPECIFICATION__FAILURE_TYPES_FAILURE_TYPE_RESULT_SPECIFICATION:
            return this.getFailureTypes__FailureTypeResultSpecification();
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
        case SensitivityPackage.FAILURE_TYPE_RESULT_SPECIFICATION__FAILURE_TYPES_FAILURE_TYPE_RESULT_SPECIFICATION:
            this.getFailureTypes__FailureTypeResultSpecification().clear();
            this.getFailureTypes__FailureTypeResultSpecification().addAll((Collection<? extends FailureType>) newValue);
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
        case SensitivityPackage.FAILURE_TYPE_RESULT_SPECIFICATION__FAILURE_TYPES_FAILURE_TYPE_RESULT_SPECIFICATION:
            this.getFailureTypes__FailureTypeResultSpecification().clear();
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
        case SensitivityPackage.FAILURE_TYPE_RESULT_SPECIFICATION__FAILURE_TYPES_FAILURE_TYPE_RESULT_SPECIFICATION:
            return this.failureTypes__FailureTypeResultSpecification != null
                    && !this.failureTypes__FailureTypeResultSpecification.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // FailureTypeResultSpecificationImpl
