package androidx.car.app.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;

/* JADX INFO: loaded from: classes3.dex */
public interface IOnContentRefreshListener extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$model$IOnContentRefreshListener".replace('$', '.');
    public static final int VERSION = 1;

    public static class Default implements IOnContentRefreshListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
        }
    }

    public static abstract class Stub extends Binder implements IOnContentRefreshListener {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_onContentRefreshRequested = 2;

        public static class Proxy implements IOnContentRefreshListener {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOnContentRefreshListener.DESCRIPTOR;
            }

            @Override // androidx.car.app.model.IOnContentRefreshListener
            public int getInterfaceVersion() {
                if (this.mCachedVersion == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(IOnContentRefreshListener.DESCRIPTOR);
                        this.mRemote.transact(Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.model.IOnContentRefreshListener
            public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOnContentRefreshListener.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(2, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onContentRefreshRequested is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, IOnContentRefreshListener.DESCRIPTOR);
        }

        public static IOnContentRefreshListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOnContentRefreshListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOnContentRefreshListener)) ? new Proxy(iBinder) : (IOnContentRefreshListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IOnContentRefreshListener.DESCRIPTOR;
            if (i >= 1 && i <= TRANSACTION_getInterfaceVersion) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == TRANSACTION_getInterfaceVersion) {
                parcel2.writeNoException();
                parcel2.writeInt(getInterfaceVersion());
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onContentRefreshRequested(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }
    }

    int getInterfaceVersion();

    void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback);
}
