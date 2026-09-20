package androidx.car.app.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;

/* JADX INFO: loaded from: classes3.dex */
public interface ITelephoneKeypadCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$model$ITelephoneKeypadCallback".replace('$', '.');
    public static final int VERSION = 1;

    public static class Default implements ITelephoneKeypadCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyDown(int i, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyLongPress(int i, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyUp(int i, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public static abstract class Stub extends Binder implements ITelephoneKeypadCallback {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_onKeyDown = 3;
        static final int TRANSACTION_onKeyLongPress = 2;
        static final int TRANSACTION_onKeyUp = 4;

        public static class Proxy implements ITelephoneKeypadCallback {
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
                return ITelephoneKeypadCallback.DESCRIPTOR;
            }

            @Override // androidx.car.app.model.ITelephoneKeypadCallback
            public int getInterfaceVersion() {
                if (this.mCachedVersion == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(ITelephoneKeypadCallback.DESCRIPTOR);
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

            @Override // androidx.car.app.model.ITelephoneKeypadCallback
            public void onKeyDown(int i, IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITelephoneKeypadCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(3, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onKeyDown is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.model.ITelephoneKeypadCallback
            public void onKeyLongPress(int i, IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITelephoneKeypadCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(2, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onKeyLongPress is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.model.ITelephoneKeypadCallback
            public void onKeyUp(int i, IOnDoneCallback iOnDoneCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITelephoneKeypadCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(4, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onKeyUp is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, ITelephoneKeypadCallback.DESCRIPTOR);
        }

        public static ITelephoneKeypadCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITelephoneKeypadCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITelephoneKeypadCallback)) ? new Proxy(iBinder) : (ITelephoneKeypadCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = ITelephoneKeypadCallback.DESCRIPTOR;
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
                onKeyLongPress(parcel.readInt(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                onKeyDown(parcel.readInt(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onKeyUp(parcel.readInt(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    int getInterfaceVersion();

    void onKeyDown(int i, IOnDoneCallback iOnDoneCallback);

    void onKeyLongPress(int i, IOnDoneCallback iOnDoneCallback);

    void onKeyUp(int i, IOnDoneCallback iOnDoneCallback);
}
