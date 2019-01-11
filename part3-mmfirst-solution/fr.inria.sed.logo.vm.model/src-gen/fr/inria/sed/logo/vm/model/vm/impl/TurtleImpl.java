/**
 */
package fr.inria.sed.logo.vm.model.vm.impl;

import fr.inria.sed.logo.vm.model.vm.Point;
import fr.inria.sed.logo.vm.model.vm.Segment;
import fr.inria.sed.logo.vm.model.vm.Turtle;
import fr.inria.sed.logo.vm.model.vm.VmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turtle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.impl.TurtleImpl#getReachedPoints <em>Reached Points</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.impl.TurtleImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.impl.TurtleImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.impl.TurtleImpl#isPenUp <em>Pen Up</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.impl.TurtleImpl#getHeading <em>Heading</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurtleImpl extends MinimalEObjectImpl.Container implements Turtle {
	/**
	 * The cached value of the '{@link #getReachedPoints() <em>Reached Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachedPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> reachedPoints;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Point position;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> segments;

	/**
	 * The default value of the '{@link #isPenUp() <em>Pen Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPenUp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PEN_UP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPenUp() <em>Pen Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPenUp()
	 * @generated
	 * @ordered
	 */
	protected boolean penUp = PEN_UP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected static final double HEADING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected double heading = HEADING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurtleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.TURTLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getReachedPoints() {
		if (reachedPoints == null) {
			reachedPoints = new EObjectContainmentEList<Point>(Point.class, this, VmPackage.TURTLE__REACHED_POINTS);
		}
		return reachedPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject) position;
			position = (Point) eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmPackage.TURTLE__POSITION, oldPosition,
							position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Point newPosition) {
		Point oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.TURTLE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Segment> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentEList<Segment>(Segment.class, this, VmPackage.TURTLE__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPenUp() {
		return penUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenUp(boolean newPenUp) {
		boolean oldPenUp = penUp;
		penUp = newPenUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.TURTLE__PEN_UP, oldPenUp, penUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeading(double newHeading) {
		double oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.TURTLE__HEADING, oldHeading, heading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VmPackage.TURTLE__REACHED_POINTS:
			return ((InternalEList<?>) getReachedPoints()).basicRemove(otherEnd, msgs);
		case VmPackage.TURTLE__SEGMENTS:
			return ((InternalEList<?>) getSegments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VmPackage.TURTLE__REACHED_POINTS:
			return getReachedPoints();
		case VmPackage.TURTLE__POSITION:
			if (resolve)
				return getPosition();
			return basicGetPosition();
		case VmPackage.TURTLE__SEGMENTS:
			return getSegments();
		case VmPackage.TURTLE__PEN_UP:
			return isPenUp();
		case VmPackage.TURTLE__HEADING:
			return getHeading();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case VmPackage.TURTLE__REACHED_POINTS:
			getReachedPoints().clear();
			getReachedPoints().addAll((Collection<? extends Point>) newValue);
			return;
		case VmPackage.TURTLE__POSITION:
			setPosition((Point) newValue);
			return;
		case VmPackage.TURTLE__SEGMENTS:
			getSegments().clear();
			getSegments().addAll((Collection<? extends Segment>) newValue);
			return;
		case VmPackage.TURTLE__PEN_UP:
			setPenUp((Boolean) newValue);
			return;
		case VmPackage.TURTLE__HEADING:
			setHeading((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case VmPackage.TURTLE__REACHED_POINTS:
			getReachedPoints().clear();
			return;
		case VmPackage.TURTLE__POSITION:
			setPosition((Point) null);
			return;
		case VmPackage.TURTLE__SEGMENTS:
			getSegments().clear();
			return;
		case VmPackage.TURTLE__PEN_UP:
			setPenUp(PEN_UP_EDEFAULT);
			return;
		case VmPackage.TURTLE__HEADING:
			setHeading(HEADING_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case VmPackage.TURTLE__REACHED_POINTS:
			return reachedPoints != null && !reachedPoints.isEmpty();
		case VmPackage.TURTLE__POSITION:
			return position != null;
		case VmPackage.TURTLE__SEGMENTS:
			return segments != null && !segments.isEmpty();
		case VmPackage.TURTLE__PEN_UP:
			return penUp != PEN_UP_EDEFAULT;
		case VmPackage.TURTLE__HEADING:
			return heading != HEADING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (penUp: ");
		result.append(penUp);
		result.append(", heading: ");
		result.append(heading);
		result.append(')');
		return result.toString();
	}

} //TurtleImpl
