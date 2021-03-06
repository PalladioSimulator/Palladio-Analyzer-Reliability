/**
 */
package org.palladiosimulator.reliability.sensitivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Variable Usage Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> Specifies a type of variable usage in a PCM Instance
 * <!-- end-model-doc -->
 * 
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getVariableUsageType()
 * @model
 * @generated
 */
public enum VariableUsageType implements Enumerator {
    /**
     * The '<em><b>SYSTEM CALL INPUT</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #SYSTEM_CALL_INPUT_VALUE
     * @generated
     * @ordered
     */
    SYSTEM_CALL_INPUT(0, "SYSTEM_CALL_INPUT", "SYSTEM_CALL_INPUT"),

    /**
     * The '<em><b>COMPONENT CONFIGURATION</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #COMPONENT_CONFIGURATION_VALUE
     * @generated
     * @ordered
     */
    COMPONENT_CONFIGURATION(1, "COMPONENT_CONFIGURATION", "COMPONENT_CONFIGURATION");

    /**
     * The '<em><b>SYSTEM CALL INPUT</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SYSTEM CALL INPUT</b></em>' literal object isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #SYSTEM_CALL_INPUT
     * @model
     * @generated
     * @ordered
     */
    public static final int SYSTEM_CALL_INPUT_VALUE = 0;

    /**
     * The '<em><b>COMPONENT CONFIGURATION</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>COMPONENT CONFIGURATION</b></em>' literal object isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #COMPONENT_CONFIGURATION
     * @model
     * @generated
     * @ordered
     */
    public static final int COMPONENT_CONFIGURATION_VALUE = 1;

    /**
     * An array of all the '<em><b>Variable Usage Type</b></em>' enumerators. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final VariableUsageType[] VALUES_ARRAY = new VariableUsageType[] { SYSTEM_CALL_INPUT,
            COMPONENT_CONFIGURATION, };

    /**
     * A public read-only list of all the '<em><b>Variable Usage Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<VariableUsageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Variable Usage Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VariableUsageType get(final String literal) {
        for (final VariableUsageType result : VALUES_ARRAY) {
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Variable Usage Type</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VariableUsageType getByName(final String name) {
        for (final VariableUsageType result : VALUES_ARRAY) {
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Variable Usage Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static VariableUsageType get(final int value) {
        switch (value) {
        case SYSTEM_CALL_INPUT_VALUE:
            return SYSTEM_CALL_INPUT;
        case COMPONENT_CONFIGURATION_VALUE:
            return COMPONENT_CONFIGURATION;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private VariableUsageType(final int value, final String name, final String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getValue() {
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getLiteral() {
        return this.literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        return this.literal;
    }

} // VariableUsageType
