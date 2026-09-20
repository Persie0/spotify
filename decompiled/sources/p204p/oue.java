package p204p;

import android.os.IBinder;
import android.os.Parcel;
import com.comscore.streaming.WindowState;

/* JADX INFO: loaded from: classes3.dex */
public final class oue implements yue {

    /* JADX INFO: renamed from: a */
    public IBinder f170273a;

    @Override // p204p.yue
    /* JADX INFO: renamed from: E */
    public final void mo54377E(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.ravelin.core.IDeviceIdRequestListener");
            parcelObtain.writeInt(WindowState.FULL_SCREEN);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f170273a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p204p.yue
    /* JADX INFO: renamed from: P0 */
    public final void mo54378P0(l6r l6rVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.ravelin.core.IDeviceIdRequestListener");
            parcelObtain.writeInt(1);
            l6rVar.writeToParcel(parcelObtain, 0);
            this.f170273a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() != 0) {
                l6rVar.m58385c(parcelObtain2);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f170273a;
    }
}
