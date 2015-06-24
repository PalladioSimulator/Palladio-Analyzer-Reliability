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
import org.palladiosimulator.reliability.sensitivity.DoubleOffsetSequence;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.DoubleOffsetSequence} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DoubleOffsetSequenceItemProvider extends DoubleParameterVariationItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public DoubleOffsetSequenceItemProvider(final AdapterFactory adapterFactory) {
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

            this.addOffsetValuesPropertyDescriptor(object);
            this.addDoubleOffsetType__DoubleOffsetSequencePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Offset Values feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addOffsetValuesPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_DoubleOffsetSequence_offsetValues_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_DoubleOffsetSequence_offsetValues_feature",
                        "_UI_DoubleOffsetSequence_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.DOUBLE_OFFSET_SEQUENCE__OFFSET_VALUES,
                true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Double Offset Type Double Offset Sequence feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addDoubleOffsetType__DoubleOffsetSequencePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_DoubleOffsetSequence_doubleOffsetType__DoubleOffsetSequence_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_DoubleOffsetSequence_doubleOffsetType__DoubleOffsetSequence_feature",
                        "_UI_DoubleOffsetSequence_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.DOUBLE_OFFSET_SEQUENCE__DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns DoubleOffsetSequence.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/DoubleOffsetSequence"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        String doubleSequence = "UNSPECIFIED";
        String offsetType = "";
        try {
            final org.eclipse.emf.common.util.EList<Double> values = ((DoubleOffsetSequence) object).getOffsetValues();
            switch (((DoubleOffsetSequence) object).getDoubleOffsetType__DoubleOffsetSequence()) {
            case ADD:
                offsetType = "x + ";
                break;
            case SUBTRACT:
                offsetType = "x - ";
                break;
            case MULTIPLY:
                offsetType = "x * ";
                break;
            case DIVIDE:
                offsetType = "x / ";
                break;
            }
            doubleSequence = offsetType + values.get(0).toString() + " ... " + offsetType
                    + values.get(values.size() - 1).toString();
        } catch (final Exception e) {
        }
        return doubleSequence + " <" + this.getString("_UI_DoubleOffsetSequence_type") + ">";
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

        switch (notification.getFeatureID(org.palladiosimulator.reliability.sensitivity.DoubleOffsetSequence.class)) {
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__OFFSET_VALUES:
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.DOUBLE_OFFSET_SEQUENCE__DOUBLE_OFFSET_TYPE_DOUBLE_OFFSET_SEQUENCE:
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
