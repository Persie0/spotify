package androidx.car.app;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import p204p.pra;

/* JADX INFO: loaded from: classes3.dex */
public interface IAppHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$IAppHost".replace('$', '.');
    public static final int VERSION = 1;

    public static abstract class Stub extends Binder implements IAppHost {
        static final int TRANSACTION_dismissAlert = 7;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_invalidate = 2;
        static final int TRANSACTION_openMicrophone = 8;
        static final int TRANSACTION_sendLocation = 5;
        static final int TRANSACTION_setSurfaceCallback = 4;
        static final int TRANSACTION_showAlert = 6;
        static final int TRANSACTION_showToast = 3;

        public static class Proxy implements IAppHost {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.IAppHost
            public void dismissAlert(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method dismissAlert is unimplemented.");
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

            public String getInterfaceDescriptor() {
                return IAppHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.IAppHost
            public int getInterfaceVersion() {
                if (this.mCachedVersion == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
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

            @Override // androidx.car.app.IAppHost
            public void invalidate() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method invalidate is unimplemented.");
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

            @Override // androidx.car.app.IAppHost
            public pra openMicrophone(pra praVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    parcelObtain.writeTypedObject(praVar, 0);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method openMicrophone is unimplemented.");
                    }
                    parcelObtain2.readException();
                    pra praVar2 = (pra) parcelObtain2.readTypedObject(pra.CREATOR);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return praVar2;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.IAppHost
            public void sendLocation(Location location) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    parcelObtain.writeTypedObject(location, 0);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method sendLocation is unimplemented.");
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

            @Override // androidx.car.app.IAppHost
            public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iSurfaceCallback);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method setSurfaceCallback is unimplemented.");
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

            @Override // androidx.car.app.IAppHost
            public void showAlert(pra praVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    parcelObtain.writeTypedObject(praVar, 0);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method showAlert is unimplemented.");
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

            @Override // androidx.car.app.IAppHost
            public void showToast(CharSequence charSequence, int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    if (charSequence != null) {
                        parcelObtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method showToast is unimplemented.");
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
            attachInterface(this, IAppHost.DESCRIPTOR);
        }

        public static IAppHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAppHost.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAppHost)) ? new Proxy(iBinder) : (IAppHost) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IAppHost.DESCRIPTOR;
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
            switch (i) {
                case 2:
                    invalidate();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    showToast((CharSequence) parcel.readTypedObject(TextUtils.CHAR_SEQUENCE_CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    setSurfaceCallback(ISurfaceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    sendLocation((Location) parcel.readTypedObject(Location.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    showAlert((pra) parcel.readTypedObject(pra.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    dismissAlert(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    pra praVarOpenMicrophone = openMicrophone((pra) parcel.readTypedObject(pra.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(praVarOpenMicrophone, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void dismissAlert(int i);

    int getInterfaceVersion();

    void invalidate();

    pra openMicrophone(pra praVar);

    void sendLocation(Location location);

    void setSurfaceCallback(ISurfaceCallback iSurfaceCallback);

    void showAlert(pra praVar);

    void showToast(CharSequence charSequence, int i);

    public static class Default implements IAppHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.IAppHost
        public void dismissAlert(int i) {
        }

        @Override // androidx.car.app.IAppHost
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.IAppHost
        public void invalidate() {
        }

        @Override // androidx.car.app.IAppHost
        public pra openMicrophone(pra praVar) {
            return null;
        }

        @Override // androidx.car.app.IAppHost
        public void sendLocation(Location location) {
        }

        @Override // androidx.car.app.IAppHost
        public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
        }

        @Override // androidx.car.app.IAppHost
        public void showToast(CharSequence charSequence, int i) {
        }

        @Override // androidx.car.app.IAppHost
        public void showAlert(pra praVar) {
        }
    }
}
