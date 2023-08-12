/**
 */
package org.nasdanika.models.echarts.graph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Border Cap</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getBorderCap()
 * @model
 * @generated
 */
public enum BorderCap implements Enumerator {
	/**
	 * The '<em><b>BUTT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTT_VALUE
	 * @generated
	 * @ordered
	 */
	BUTT(0, "BUTT", "BUTT"),

	/**
	 * The '<em><b>ROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND(1, "ROUND", "ROUND"),

	/**
	 * The '<em><b>SQUARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_VALUE
	 * @generated
	 * @ordered
	 */
	SQUARE(2, "SQUARE", "SQUARE");

	/**
	 * The '<em><b>BUTT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTT_VALUE = 0;

	/**
	 * The '<em><b>ROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_VALUE = 1;

	/**
	 * The '<em><b>SQUARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Border Cap</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BorderCap[] VALUES_ARRAY =
		new BorderCap[] {
			BUTT,
			ROUND,
			SQUARE,
		};

	/**
	 * A public read-only list of all the '<em><b>Border Cap</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BorderCap> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Border Cap</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BorderCap get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BorderCap result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Border Cap</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BorderCap getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BorderCap result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Border Cap</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BorderCap get(int value) {
		switch (value) {
			case BUTT_VALUE: return BUTT;
			case ROUND_VALUE: return ROUND;
			case SQUARE_VALUE: return SQUARE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BorderCap(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BorderCap
