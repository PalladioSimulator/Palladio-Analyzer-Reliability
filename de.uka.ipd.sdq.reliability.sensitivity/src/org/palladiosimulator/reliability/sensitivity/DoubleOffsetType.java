/**
 */
package org.palladiosimulator.reliability.sensitivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Double Offset Type</b></em>', and utility methods for working with them. <!-- end-user-doc
 * --> <!-- begin-model-doc -->
 * <p>
 * Specifies the type of offset represented by a double value (val_off) that is connected to an
 * original value (val_orig) to achieve a new result value (val_res):
 * </p>
 * <p>
 * ADD: val_res = val_orig + val_off
 * </p>
 * <p>
 * SUBTRACT: val_res = val_orig - val_off
 * </p>
 * <p>
 * MULTIPLY: val_res = val_orig * val_off
 * </p>
 * <p>
 * DIVIDE: val_res = val_orig / val_off
 * </p>
 * <!-- end-model-doc -->
 * 
 * @see org.palladiosimulator.reliability.sensitivity.SensitivityPackage#getDoubleOffsetType()
 * @model
 * @generated
 */
public enum DoubleOffsetType implements Enumerator {
    /**
     * The '<em><b>ADD</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #ADD_VALUE
     * @generated
     * @ordered
     */
    ADD(0, "ADD", "ADD"),

    /**
     * The '<em><b>SUBTRACT</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #SUBTRACT_VALUE
     * @generated
     * @ordered
     */
    SUBTRACT(1, "SUBTRACT", "SUBTRACT"),

    /**
     * The '<em><b>MULTIPLY</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #MULTIPLY_VALUE
     * @generated
     * @ordered
     */
    MULTIPLY(2, "MULTIPLY", "MULTIPLY"),

    /**
     * The '<em><b>DIVIDE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #DIVIDE_VALUE
     * @generated
     * @ordered
     */
    DIVIDE(3, "DIVIDE", "DIVIDE");

    /**
     * The '<em><b>ADD</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ADD</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #ADD
     * @model
     * @generated
     * @ordered
     */
    public static final int ADD_VALUE = 0;

    /**
     * The '<em><b>SUBTRACT</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SUBTRACT</b></em>' literal object isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #SUBTRACT
     * @model
     * @generated
     * @ordered
     */
    public static final int SUBTRACT_VALUE = 1;

    /**
     * The '<em><b>MULTIPLY</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MULTIPLY</b></em>' literal object isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #MULTIPLY
     * @model
     * @generated
     * @ordered
     */
    public static final int MULTIPLY_VALUE = 2;

    /**
     * The '<em><b>DIVIDE</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DIVIDE</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #DIVIDE
     * @model
     * @generated
     * @ordered
     */
    public static final int DIVIDE_VALUE = 3;

    /**
     * An array of all the '<em><b>Double Offset Type</b></em>' enumerators. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final DoubleOffsetType[] VALUES_ARRAY = new DoubleOffsetType[] { ADD, SUBTRACT, MULTIPLY, DIVIDE, };

    /**
     * A public read-only list of all the '<em><b>Double Offset Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<DoubleOffsetType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Double Offset Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DoubleOffsetType get(final String literal) {
        for (final DoubleOffsetType result : VALUES_ARRAY) {
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Double Offset Type</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DoubleOffsetType getByName(final String name) {
        for (final DoubleOffsetType result : VALUES_ARRAY) {
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Double Offset Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DoubleOffsetType get(final int value) {
        switch (value) {
        case ADD_VALUE:
            return ADD;
        case SUBTRACT_VALUE:
            return SUBTRACT;
        case MULTIPLY_VALUE:
            return MULTIPLY;
        case DIVIDE_VALUE:
            return DIVIDE;
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
    private DoubleOffsetType(final int value, final String name, final String literal) {
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

} // DoubleOffsetType
