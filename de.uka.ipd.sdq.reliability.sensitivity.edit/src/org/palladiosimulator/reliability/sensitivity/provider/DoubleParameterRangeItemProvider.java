/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.reliability.sensitivity.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.reliability.sensitivity.DoubleParameterRange;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.DoubleParameterRange} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DoubleParameterRangeItemProvider extends DoubleParameterVariationItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public DoubleParameterRangeItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addConsiderStepSizePropertyDescriptor(object);
            this.addFirstValuePropertyDescriptor(object);
            this.addLastValuePropertyDescriptor(object);
            this.addStepSizePropertyDescriptor(object);
            this.addStepCountPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Consider Step Size feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addConsiderStepSizePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_DoubleParameterRange_considerStepSize_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_DoubleParameterRange_considerStepSize_feature", "_UI_DoubleParameterRange_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.DOUBLE_PARAMETER_RANGE__CONSIDER_STEP_SIZE,
                true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the First Value feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addFirstValuePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_DoubleParameterRange_firstValue_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_DoubleParameterRange_firstValue_feature",
                        "_UI_DoubleParameterRange_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.DOUBLE_PARAMETER_RANGE__FIRST_VALUE,
                true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Last Value feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addLastValuePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_DoubleParameterRange_lastValue_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_DoubleParameterRange_lastValue_feature",
                        "_UI_DoubleParameterRange_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.DOUBLE_PARAMETER_RANGE__LAST_VALUE,
                true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Step Size feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addStepSizePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_DoubleParameterRange_stepSize_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_DoubleParameterRange_stepSize_feature",
                        "_UI_DoubleParameterRange_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.DOUBLE_PARAMETER_RANGE__STEP_SIZE,
                true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Step Count feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addStepCountPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_DoubleParameterRange_stepCount_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_DoubleParameterRange_stepCount_feature",
                        "_UI_DoubleParameterRange_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.DOUBLE_PARAMETER_RANGE__STEP_COUNT,
                true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This returns DoubleParameterRange.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/DoubleParameterRange"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        String doubleRange = "UNSPECIFIED";
        try {
            doubleRange = ((DoubleParameterRange) object).getFirstValue() + " ... "
                    + ((DoubleParameterRange) object).getLastValue();
        } catch (final Exception e) {
        }
        return doubleRange + " <" + this.getString("_UI_DoubleParameterRange_type") + ">";
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(org.palladiosimulator.reliability.sensitivity.DoubleParameterRange.class)) {
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.DOUBLE_PARAMETER_RANGE__CONSIDER_STEP_SIZE:
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.DOUBLE_PARAMETER_RANGE__FIRST_VALUE:
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.DOUBLE_PARAMETER_RANGE__LAST_VALUE:
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_SIZE:
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.DOUBLE_PARAMETER_RANGE__STEP_COUNT:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
