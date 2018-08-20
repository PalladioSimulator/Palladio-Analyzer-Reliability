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
import org.palladiosimulator.reliability.sensitivity.VariableUsageParameter;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.VariableUsageParameter} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class VariableUsageParameterItemProvider extends SingleSensitivityParameterItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public VariableUsageParameterItemProvider(final AdapterFactory adapterFactory) {
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

            this.addVariableNamePropertyDescriptor(object);
            this.addEntryLevelSystemCall__VariableUsageParameterPropertyDescriptor(object);
            this.addVariableCharacterisationType__VariableUsageParameterPropertyDescriptor(object);
            this.addVariableUsageType__VariableUsageParameterPropertyDescriptor(object);
            this.addBasicComponent__VariableUsageParameterPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Variable Name feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addVariableNamePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_VariableUsageParameter_VariableName_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_VariableUsageParameter_VariableName_feature",
                        "_UI_VariableUsageParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.VARIABLE_USAGE_PARAMETER__VARIABLE_NAME,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Entry Level System Call Variable Usage Parameter
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addEntryLevelSystemCall__VariableUsageParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_VariableUsageParameter_entryLevelSystemCall__VariableUsageParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_VariableUsageParameter_entryLevelSystemCall__VariableUsageParameter_feature",
                        "_UI_VariableUsageParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.VARIABLE_USAGE_PARAMETER__ENTRY_LEVEL_SYSTEM_CALL_VARIABLE_USAGE_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Variable Characterisation Type Variable Usage
     * Parameter feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addVariableCharacterisationType__VariableUsageParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString(
                        "_UI_VariableUsageParameter_variableCharacterisationType__VariableUsageParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_VariableUsageParameter_variableCharacterisationType__VariableUsageParameter_feature",
                        "_UI_VariableUsageParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.VARIABLE_USAGE_PARAMETER__VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Variable Usage Type Variable Usage Parameter feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addVariableUsageType__VariableUsageParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_VariableUsageParameter_variableUsageType__VariableUsageParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_VariableUsageParameter_variableUsageType__VariableUsageParameter_feature",
                        "_UI_VariableUsageParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.VARIABLE_USAGE_PARAMETER__VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Basic Component Variable Usage Parameter feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addBasicComponent__VariableUsageParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_VariableUsageParameter_basicComponent__VariableUsageParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_VariableUsageParameter_basicComponent__VariableUsageParameter_feature",
                        "_UI_VariableUsageParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.VARIABLE_USAGE_PARAMETER__BASIC_COMPONENT_VARIABLE_USAGE_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This returns VariableUsageParameter.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/VariableUsageParameter"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        String paramName = "UNSPECIFIED";
        try {
            switch (((VariableUsageParameter) object).getVariableUsageType__VariableUsageParameter()) {
            case SYSTEM_CALL_INPUT:
                paramName = ((VariableUsageParameter) object).getEntryLevelSystemCall__VariableUsageParameter()
                        .getEntityName();
                break;
            case COMPONENT_CONFIGURATION:
                paramName = ((VariableUsageParameter) object).getBasicComponent__VariableUsageParameter()
                        .getEntityName();
                break;
            }
        } catch (final Exception e) {
        }
        final String inputCharacterisation = ((VariableUsageParameter) object).getVariableName() + "."
                + ((VariableUsageParameter) object).getVariableCharacterisationType__VariableUsageParameter()
                        .toString();
        return ((VariableUsageParameter) object).getEntityName() + " (" + paramName + "/" + inputCharacterisation + ")"
                + " [ID: " + ((VariableUsageParameter) object).getId() + "]" + " <"
                + this.getString("_UI_VariableUsageParameter_type") + ">";
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

        switch (notification.getFeatureID(org.palladiosimulator.reliability.sensitivity.VariableUsageParameter.class)) {
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_NAME:
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_CHARACTERISATION_TYPE_VARIABLE_USAGE_PARAMETER:
        case org.palladiosimulator.reliability.sensitivity.SensitivityPackage.VARIABLE_USAGE_PARAMETER__VARIABLE_USAGE_TYPE_VARIABLE_USAGE_PARAMETER:
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
