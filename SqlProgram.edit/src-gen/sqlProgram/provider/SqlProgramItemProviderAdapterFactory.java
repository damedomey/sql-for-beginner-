/**
 */
package sqlProgram.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import sqlProgram.util.SqlProgramAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlProgramItemProviderAdapterFactory extends SqlProgramAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlProgramItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link sqlProgram.SqlProgram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlProgramItemProvider sqlProgramItemProvider;

	/**
	 * This creates an adapter for a {@link sqlProgram.SqlProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSqlProgramAdapter() {
		if (sqlProgramItemProvider == null) {
			sqlProgramItemProvider = new SqlProgramItemProvider(this);
		}

		return sqlProgramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sqlProgram.Selection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionItemProvider selectionItemProvider;

	/**
	 * This creates an adapter for a {@link sqlProgram.Selection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionAdapter() {
		if (selectionItemProvider == null) {
			selectionItemProvider = new SelectionItemProvider(this);
		}

		return selectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sqlProgram.Table} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableItemProvider tableItemProvider;

	/**
	 * This creates an adapter for a {@link sqlProgram.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableAdapter() {
		if (tableItemProvider == null) {
			tableItemProvider = new TableItemProvider(this);
		}

		return tableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sqlProgram.Column} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnItemProvider columnItemProvider;

	/**
	 * This creates an adapter for a {@link sqlProgram.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnAdapter() {
		if (columnItemProvider == null) {
			columnItemProvider = new ColumnItemProvider(this);
		}

		return columnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sqlProgram.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link sqlProgram.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sqlProgram.Library} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryItemProvider libraryItemProvider;

	/**
	 * This creates an adapter for a {@link sqlProgram.Library}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLibraryAdapter() {
		if (libraryItemProvider == null) {
			libraryItemProvider = new LibraryItemProvider(this);
		}

		return libraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sqlProgram.Clause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClauseItemProvider clauseItemProvider;

	/**
	 * This creates an adapter for a {@link sqlProgram.Clause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClauseAdapter() {
		if (clauseItemProvider == null) {
			clauseItemProvider = new ClauseItemProvider(this);
		}

		return clauseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sqlProgram.Creation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreationItemProvider creationItemProvider;

	/**
	 * This creates an adapter for a {@link sqlProgram.Creation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreationAdapter() {
		if (creationItemProvider == null) {
			creationItemProvider = new CreationItemProvider(this);
		}

		return creationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sqlProgram.Constaint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstaintItemProvider constaintItemProvider;

	/**
	 * This creates an adapter for a {@link sqlProgram.Constaint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstaintAdapter() {
		if (constaintItemProvider == null) {
			constaintItemProvider = new ConstaintItemProvider(this);
		}

		return constaintItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (sqlProgramItemProvider != null)
			sqlProgramItemProvider.dispose();
		if (selectionItemProvider != null)
			selectionItemProvider.dispose();
		if (tableItemProvider != null)
			tableItemProvider.dispose();
		if (columnItemProvider != null)
			columnItemProvider.dispose();
		if (typeItemProvider != null)
			typeItemProvider.dispose();
		if (libraryItemProvider != null)
			libraryItemProvider.dispose();
		if (clauseItemProvider != null)
			clauseItemProvider.dispose();
		if (creationItemProvider != null)
			creationItemProvider.dispose();
		if (constaintItemProvider != null)
			constaintItemProvider.dispose();
	}

}
