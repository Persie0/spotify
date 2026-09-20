package androidx.car.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IAppManager extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$IAppManager".replace('$', '.');
    public static final int VERSION = 1;

    public static class Default implements IAppManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.IAppManager
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.IAppManager
        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.IAppManager
        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.IAppManager
        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.IAppManager
        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        }
    }

    public static abstract class Stub extends Binder implements IAppManager {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getTemplate = 2;
        static final int TRANSACTION_onBackPressed = 3;
        static final int TRANSACTION_startLocationUpdates = 4;
        static final int TRANSACTION_stopLocationUpdates = 5;

        public static class Proxy implements IAppManager {
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
                return IAppManager.DESCRIPTOR;
            }

            @Override // androidx.car.app.IAppManager
            public int getInterfaceVersion() {
                if (this.mCachedVersion == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
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

            @Override // androidx.car.app.IAppManager
            public void getTemplate(IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(2, parcelObtain, null, 1)) {
                        throw new RemoteException("Method getTemplate is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.IAppManager
            public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(3, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onBackPressed is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.IAppManager
            public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(4, parcelObtain, null, 1)) {
                        throw new RemoteException("Method startLocationUpdates is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.IAppManager
            public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(5, parcelObtain, null, 1)) {
                        throw new RemoteException("Method stopLocationUpdates is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, IAppManager.DESCRIPTOR);
        }

        public static IAppManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAppManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAppManager)) ? new Proxy(iBinder) : (IAppManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IAppManager.DESCRIPTOR;
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
            if (i == 2) {
                getTemplate(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                onBackPressed(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 4) {
                startLocationUpdates(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                stopLocationUpdates(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    int getInterfaceVersion();

    void getTemplate(IOnDoneCallback iOnDoneCallback);

    void onBackPressed(IOnDoneCallback iOnDoneCallback);

    void startLocationUpdates(IOnDoneCallback iOnDoneCallback);

    void stopLocationUpdates(IOnDoneCallback iOnDoneCallback);
}
