package androidx.car.app.constraints;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IConstraintHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$constraints$IConstraintHost".replace('$', '.');
    public static final int VERSION = 1;

    public static class Default implements IConstraintHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.constraints.IConstraintHost
        public int getContentLimit(int i) {
            return 0;
        }

        @Override // androidx.car.app.constraints.IConstraintHost
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.constraints.IConstraintHost
        public boolean isAppDrivenRefreshEnabled() {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IConstraintHost {
        static final int TRANSACTION_getContentLimit = 2;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_isAppDrivenRefreshEnabled = 3;

        public static class Proxy implements IConstraintHost {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.constraints.IConstraintHost
            public int getContentLimit(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IConstraintHost.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method getContentLimit is unimplemented.");
                    }
                    parcelObtain2.readException();
                    int i2 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i2;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return IConstraintHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.constraints.IConstraintHost
            public int getInterfaceVersion() {
                if (this.mCachedVersion == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(IConstraintHost.DESCRIPTOR);
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

            @Override // androidx.car.app.constraints.IConstraintHost
            public boolean isAppDrivenRefreshEnabled() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IConstraintHost.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method isAppDrivenRefreshEnabled is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, IConstraintHost.DESCRIPTOR);
        }

        public static IConstraintHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IConstraintHost.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IConstraintHost)) ? new Proxy(iBinder) : (IConstraintHost) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IConstraintHost.DESCRIPTOR;
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
                int contentLimit = getContentLimit(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(contentLimit);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                boolean zIsAppDrivenRefreshEnabled = isAppDrivenRefreshEnabled();
                parcel2.writeNoException();
                parcel2.writeInt(zIsAppDrivenRefreshEnabled ? 1 : 0);
            }
            return true;
        }
    }

    int getContentLimit(int i);

    int getInterfaceVersion();

    boolean isAppDrivenRefreshEnabled();
}
