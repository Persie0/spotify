package androidx.car.app.navigation;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p204p.pra;

/* JADX INFO: loaded from: classes3.dex */
public interface INavigationHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$navigation$INavigationHost".replace('$', '.');
    public static final int VERSION = 1;

    public static abstract class Stub extends Binder implements INavigationHost {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_navigationEnded = 3;
        static final int TRANSACTION_navigationStarted = 2;
        static final int TRANSACTION_setVoiceAssistantCapabilities = 5;
        static final int TRANSACTION_updateTrip = 4;

        public static class Proxy implements INavigationHost {
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
                return INavigationHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.navigation.INavigationHost
            public int getInterfaceVersion() {
                if (this.mCachedVersion == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(INavigationHost.DESCRIPTOR);
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

            @Override // androidx.car.app.navigation.INavigationHost
            public void navigationEnded() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INavigationHost.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method navigationEnded is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.navigation.INavigationHost
            public void navigationStarted() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INavigationHost.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method navigationStarted is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.navigation.INavigationHost
            public void setVoiceAssistantCapabilities(pra praVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INavigationHost.DESCRIPTOR);
                    parcelObtain.writeTypedObject(praVar, 0);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method setVoiceAssistantCapabilities is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.navigation.INavigationHost
            public void updateTrip(pra praVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INavigationHost.DESCRIPTOR);
                    parcelObtain.writeTypedObject(praVar, 0);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method updateTrip is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, INavigationHost.DESCRIPTOR);
        }

        public static INavigationHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INavigationHost.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INavigationHost)) ? new Proxy(iBinder) : (INavigationHost) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = INavigationHost.DESCRIPTOR;
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
                navigationStarted();
                parcel2.writeNoException();
            } else if (i == 3) {
                navigationEnded();
                parcel2.writeNoException();
            } else if (i == 4) {
                updateTrip((pra) parcel.readTypedObject(pra.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                setVoiceAssistantCapabilities((pra) parcel.readTypedObject(pra.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    int getInterfaceVersion();

    void navigationEnded();

    void navigationStarted();

    void setVoiceAssistantCapabilities(pra praVar);

    void updateTrip(pra praVar);

    public static class Default implements INavigationHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.navigation.INavigationHost
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.navigation.INavigationHost
        public void navigationEnded() {
        }

        @Override // androidx.car.app.navigation.INavigationHost
        public void navigationStarted() {
        }

        @Override // androidx.car.app.navigation.INavigationHost
        public void setVoiceAssistantCapabilities(pra praVar) {
        }

        @Override // androidx.car.app.navigation.INavigationHost
        public void updateTrip(pra praVar) {
        }
    }
}
