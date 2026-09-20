package androidx.car.app.hardware;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p204p.pra;

/* JADX INFO: loaded from: classes3.dex */
public interface ICarHardwareHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$hardware$ICarHardwareHost".replace('$', '.');
    public static final int VERSION = 1;

    public static abstract class Stub extends Binder implements ICarHardwareHost {
        static final int TRANSACTION_getCarHardwareResult = 2;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_subscribeCarHardwareResult = 3;
        static final int TRANSACTION_unsubscribeCarHardwareResult = 4;

        public static class Proxy implements ICarHardwareHost {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public void getCarHardwareResult(int i, pra praVar, ICarHardwareResult iCarHardwareResult) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedObject(praVar, 0);
                    parcelObtain.writeStrongInterface(iCarHardwareResult);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method getCarHardwareResult is unimplemented.");
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
                return ICarHardwareHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public int getInterfaceVersion() {
                if (this.mCachedVersion == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
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

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public void subscribeCarHardwareResult(int i, pra praVar, ICarHardwareResult iCarHardwareResult) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedObject(praVar, 0);
                    parcelObtain.writeStrongInterface(iCarHardwareResult);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method subscribeCarHardwareResult is unimplemented.");
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

            @Override // androidx.car.app.hardware.ICarHardwareHost
            public void unsubscribeCarHardwareResult(int i, pra praVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICarHardwareHost.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedObject(praVar, 0);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method unsubscribeCarHardwareResult is unimplemented.");
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
            attachInterface(this, ICarHardwareHost.DESCRIPTOR);
        }

        public static ICarHardwareHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICarHardwareHost.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICarHardwareHost)) ? new Proxy(iBinder) : (ICarHardwareHost) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = ICarHardwareHost.DESCRIPTOR;
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
                getCarHardwareResult(parcel.readInt(), (pra) parcel.readTypedObject(pra.CREATOR), ICarHardwareResult.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                subscribeCarHardwareResult(parcel.readInt(), (pra) parcel.readTypedObject(pra.CREATOR), ICarHardwareResult.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                unsubscribeCarHardwareResult(parcel.readInt(), (pra) parcel.readTypedObject(pra.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void getCarHardwareResult(int i, pra praVar, ICarHardwareResult iCarHardwareResult);

    int getInterfaceVersion();

    void subscribeCarHardwareResult(int i, pra praVar, ICarHardwareResult iCarHardwareResult);

    void unsubscribeCarHardwareResult(int i, pra praVar);

    public static class Default implements ICarHardwareHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void unsubscribeCarHardwareResult(int i, pra praVar) {
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void getCarHardwareResult(int i, pra praVar, ICarHardwareResult iCarHardwareResult) {
        }

        @Override // androidx.car.app.hardware.ICarHardwareHost
        public void subscribeCarHardwareResult(int i, pra praVar, ICarHardwareResult iCarHardwareResult) {
        }
    }
}
