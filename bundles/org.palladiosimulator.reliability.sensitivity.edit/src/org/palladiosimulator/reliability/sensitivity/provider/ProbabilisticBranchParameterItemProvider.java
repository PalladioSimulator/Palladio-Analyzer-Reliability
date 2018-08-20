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
import org.palladiosimulator.reliability.sensitivity.ProbabilisticBranchParameter;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.reliability.sensitivity.ProbabilisticBranchParameter} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProbabilisticBranchParameterItemProvider extends SingleSensitivityParameterItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public ProbabilisticBranchParameterItemProvider(final AdapterFactory adapterFactory) {
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

            this.addProbabilisticBranchTransition__ProbabilisticBranchParameterPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Probabilistic Branch Transition Probabilistic Branch
     * Parameter feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProbabilisticBranchTransition__ProbabilisticBranchParameterPropertyDescriptor(
            final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString(
                        "_UI_ProbabilisticBranchParameter_probabilisticBranchTransition__ProbabilisticBranchParameter_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ProbabilisticBranchParameter_probabilisticBranchTransition__ProbabilisticBranchParameter_feature",
                        "_UI_ProbabilisticBranchParameter_type"),
                org.palladiosimulator.reliability.sensitivity.SensitivityPackage.Literals.PROBABILISTIC_BRANCH_PARAMETER__PROBABILISTIC_BRANCH_TRANSITION_PROBABILISTIC_BRANCH_PARAMETER,
                true, false, true, null, null, null));
    }

    /**
     * This returns ProbabilisticBranchParameter.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ProbabilisticBranchParameter"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated not
     */
    @Override
    public String getText(final Object object) {
        String branchActionName = "UNSPECIFIED";
        try {
            branchActionName = ((ProbabilisticBranchParameter) object)
                    .getProbabilisticBranchTransition__ProbabilisticBranchParameter()
                    .getBranchAction_AbstractBranchTransition().getEntityName();
        } catch (final Exception e) {
        }
        String transitionName = "UNSPECIFIED";
        try {
            transitionName = ((ProbabilisticBranchParameter) object)
                    .getProbabilisticBranchTransition__ProbabilisticBranchParameter().getEntityName();
        } catch (final Exception e) {
        }
        return ((ProbabilisticBranchParameter) object).getEntityName() + " (" + branchActionName + "/" + transitionName
                + ")" + " [ID: " + ((ProbabilisticBranchParameter) object).getId() + "]" + " <"
                + this.getString("_UI_ProbabilisticBranchParameter_type") + ">";
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
