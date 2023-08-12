/**
 */
package org.nasdanika.models.echarts.graph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Font Weight</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getFontWeight()
 * @model
 * @generated
 */
public enum FontWeight implements Enumerator {
	/**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(0, "NORMAL", "NORMAL"),

	/**
	 * The '<em><b>BOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD(1, "BOLD", "BOLD"),

	/**
	 * The '<em><b>BOLDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	BOLDER(2, "BOLDER", "BOLDER"),

	/**
	 * The '<em><b>LIGHTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTER_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTER(3, "LIGHTER", "LIGHTER");

	/**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 0;

	/**
	 * The '<em><b>BOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_VALUE = 1;

	/**
	 * The '<em><b>BOLDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOLDER_VALUE = 2;

	/**
	 * The '<em><b>LIGHTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Font Weight</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FontWeight[] VALUES_ARRAY =
		new FontWeight[] {
			NORMAL,
			BOLD,
			BOLDER,
			LIGHTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Font Weight</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FontWeight> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Font Weight</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontWeight get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontWeight result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Weight</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontWeight getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontWeight result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Weight</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontWeight get(int value) {
		switch (value) {
			case NORMAL_VALUE: return NORMAL;
			case BOLD_VALUE: return BOLD;
			case BOLDER_VALUE: return BOLDER;
			case LIGHTER_VALUE: return LIGHTER;
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
	private FontWeight(int value, String name, String literal) {
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
	
} //FontWeight
