/**
 */
package org.nasdanika.models.echarts.graph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Label Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabelPosition()
 * @model
 * @generated
 */
public enum LabelPosition implements Enumerator {
	/**
	 * The '<em><b>TOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_VALUE
	 * @generated
	 * @ordered
	 */
	TOP(0, "TOP", "TOP"),

	/**
	 * The '<em><b>LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT(1, "LEFT", "LEFT"),

	/**
	 * The '<em><b>RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT(2, "RIGHT", "RIGHT"),

	/**
	 * The '<em><b>BOTTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM(3, "BOTTOM", "BOTTOM"),

	/**
	 * The '<em><b>INSIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE(4, "INSIDE", "INSIDE"),

	/**
	 * The '<em><b>INSIDE lEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE_LEFT(5, "INSIDE_lEFT", "INSIDE_lEFT"),

	/**
	 * The '<em><b>INSIDE RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE_RIGHT(6, "INSIDE_RIGHT", "INSIDE_RIGHT"),

	/**
	 * The '<em><b>INSIDE TOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE_TOP(7, "INSIDE_TOP", "INSIDE_TOP"),

	/**
	 * The '<em><b>INSIDE BOTTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE_BOTTOM(8, "INSIDE_BOTTOM", "INSIDE_BOTTOM"),

	/**
	 * The '<em><b>INSIDE TOP LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_TOP_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE_TOP_LEFT(9, "INSIDE_TOP_LEFT", "INSIDE_TOP_LEFT"),

	/**
	 * The '<em><b>INSIDE BOTTOM LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_BOTTOM_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE_BOTTOM_LEFT(10, "INSIDE_BOTTOM_LEFT", "INSIDE_BOTTOM_LEFT"),

	/**
	 * The '<em><b>INSIDE TOP RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_TOP_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE_TOP_RIGHT(11, "INSIDE_TOP_RIGHT", "INSIDE_TOP_RIGHT"),

	/**
	 * The '<em><b>INSIDE BOTTOM RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_BOTTOM_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	INSIDE_BOTTOM_RIGHT(12, "INSIDE_BOTTOM_RIGHT", "INSIDE_BOTTOM_RIGHT");

	/**
	 * The '<em><b>TOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_VALUE = 0;

	/**
	 * The '<em><b>LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VALUE = 1;

	/**
	 * The '<em><b>RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VALUE = 2;

	/**
	 * The '<em><b>BOTTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_VALUE = 3;

	/**
	 * The '<em><b>INSIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_VALUE = 4;

	/**
	 * The '<em><b>INSIDE lEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_LEFT
	 * @model name="INSIDE_lEFT"
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_LEFT_VALUE = 5;

	/**
	 * The '<em><b>INSIDE RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_RIGHT_VALUE = 6;

	/**
	 * The '<em><b>INSIDE TOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_TOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_TOP_VALUE = 7;

	/**
	 * The '<em><b>INSIDE BOTTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_BOTTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_BOTTOM_VALUE = 8;

	/**
	 * The '<em><b>INSIDE TOP LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_TOP_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_TOP_LEFT_VALUE = 9;

	/**
	 * The '<em><b>INSIDE BOTTOM LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_BOTTOM_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_BOTTOM_LEFT_VALUE = 10;

	/**
	 * The '<em><b>INSIDE TOP RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_TOP_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_TOP_RIGHT_VALUE = 11;

	/**
	 * The '<em><b>INSIDE BOTTOM RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSIDE_BOTTOM_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSIDE_BOTTOM_RIGHT_VALUE = 12;

	/**
	 * An array of all the '<em><b>Label Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LabelPosition[] VALUES_ARRAY =
		new LabelPosition[] {
			TOP,
			LEFT,
			RIGHT,
			BOTTOM,
			INSIDE,
			INSIDE_LEFT,
			INSIDE_RIGHT,
			INSIDE_TOP,
			INSIDE_BOTTOM,
			INSIDE_TOP_LEFT,
			INSIDE_BOTTOM_LEFT,
			INSIDE_TOP_RIGHT,
			INSIDE_BOTTOM_RIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Label Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LabelPosition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Label Position</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LabelPosition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelPosition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Position</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LabelPosition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelPosition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Position</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LabelPosition get(int value) {
		switch (value) {
			case TOP_VALUE: return TOP;
			case LEFT_VALUE: return LEFT;
			case RIGHT_VALUE: return RIGHT;
			case BOTTOM_VALUE: return BOTTOM;
			case INSIDE_VALUE: return INSIDE;
			case INSIDE_LEFT_VALUE: return INSIDE_LEFT;
			case INSIDE_RIGHT_VALUE: return INSIDE_RIGHT;
			case INSIDE_TOP_VALUE: return INSIDE_TOP;
			case INSIDE_BOTTOM_VALUE: return INSIDE_BOTTOM;
			case INSIDE_TOP_LEFT_VALUE: return INSIDE_TOP_LEFT;
			case INSIDE_BOTTOM_LEFT_VALUE: return INSIDE_BOTTOM_LEFT;
			case INSIDE_TOP_RIGHT_VALUE: return INSIDE_TOP_RIGHT;
			case INSIDE_BOTTOM_RIGHT_VALUE: return INSIDE_BOTTOM_RIGHT;
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
	private LabelPosition(int value, String name, String literal) {
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
	
} //LabelPosition
