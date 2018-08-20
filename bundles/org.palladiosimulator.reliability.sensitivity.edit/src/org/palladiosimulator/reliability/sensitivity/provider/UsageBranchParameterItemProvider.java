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
import org.palladiosimulator.reliability.sensitivity.UsageBranchParameter;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.UsageBranchParameter} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class UsageBranchParameterItemProvider extends SingleSensitivityParameterItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public UsageBranchParameterItemProvider(final AdapterFactory adapterFactory) {
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

            this.addBranch__UsageBranchParameterPropertyDescriptor(object);
            this.addScenarioBehaviour__UsageBranchParameterPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Branch Usage Branch Parameter feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addBranch__UsageBranchParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_UsageBranchParameter_branch__UsageBranchParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_UsageBranchParameter_branch__UsageBranchParameter_feature",
                        "_UI_UsageBranchParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.USAGE_BRANCH_PARAMETER__BRANCH_USAGE_BRANCH_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Scenario Behaviour Usage Branch Parameter feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addScenarioBehaviour__UsageBranchParameterPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_UsageBranchParameter_scenarioBehaviour__UsageBranchParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_UsageBranchParameter_scenarioBehaviour__UsageBranchParameter_feature",
                        "_UI_UsageBranchParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.USAGE_BRANCH_PARAMETER__SCENARIO_BEHAVIOUR_USAGE_BRANCH_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This returns UsageBranchParameter.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/UsageBranchParameter"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        String branchName = "UNSPECIFIED";
        try {
            branchName = ((UsageBranchParameter) object).getBranch__UsageBranchParameter().getEntityName();
        } catch (final Exception e) {
        }
        String behaviourName = "UNSPECIFIED";
        try {
            behaviourName = ((UsageBranchParameter) object).getScenarioBehaviour__UsageBranchParameter()
                    .getEntityName();
        } catch (final Exception e) {
        }
        return ((UsageBranchParameter) object).getEntityName() + " (" + branchName + "/" + behaviourName + ")"
                + " [ID: " + ((UsageBranchParameter) object).getId() + "]" + " <"
                + this.getString("_UI_UsageBranchParameter_type") + ">";
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
