/**
 */
package org.palladiosimulator.reliability.sensitivity;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.reliability.FailureType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Failure Type Result Specification</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Describes the overall failure potential&nbsp;associated with&nbsp;the
 * specified set of failure types. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.reliability.sensitivity.FailureTypeResultSpecification#getFailureTypes__FailureTypeResultSpecification
 * <em>Failure Types Failure Type Result Specification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getFailureTypeResultSpecification()
 * @model
 * @generated
 */
public interface FailureTypeResultSpecification extends SensitivityResultSpecification {

    /**
     * Returns the value of the '<em><b>Failure Types Failure Type Result Specification</b></em>'
     * reference list. The list contents are of type
     * {@link org.palladiosimulator.pcm.reliability.FailureType}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Failure Types Failure Type Result Specification</em>' reference
     * list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Failure Types Failure Type Result Specification</em>' reference
     *         list.
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getFailureTypeResultSpecification_FailureTypes__FailureTypeResultSpecification()
     * @model required="true" ordered="false"
     * @generated
     */
    EList<FailureType> getFailureTypes__FailureTypeResultSpecification();

} // FailureTypeResultSpecification
