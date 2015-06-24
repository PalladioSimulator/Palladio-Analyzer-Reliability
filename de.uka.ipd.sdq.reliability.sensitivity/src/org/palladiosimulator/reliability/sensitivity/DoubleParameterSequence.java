/**
 */
package org.palladiosimulator.reliability.sensitivity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Double Parameter Sequence</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Specifies&nbsp;a sequence of values, to define&nbsp;a
 * variation&nbsp;of&nbsp;a&nbsp;sensitivity parameter of type DOUBLE. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.reliability.sensitivity.DoubleParameterSequence#getDoubleValues
 * <em>Double Values</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getDoubleParameterSequence()
 * @model
 * @generated
 */
public interface DoubleParameterSequence extends DoubleParameterVariation {

    /**
     * Returns the value of the '<em><b>Double Values</b></em>' attribute list. The list contents
     * are of type {@link java.lang.Double}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The&nbsp;list&nbsp;of&nbsp;DOUBLE&nbsp;values. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Double Values</em>' attribute list.
     * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getDoubleParameterSequence_DoubleValues()
     * @model unique="false" required="true"
     * @generated
     */
    EList<Double> getDoubleValues();

} // DoubleParameterSequence
