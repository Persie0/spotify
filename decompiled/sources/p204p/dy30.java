package p204p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;

/* JADX INFO: loaded from: classes11.dex */
public final class dy30 implements fy30 {

    /* JADX INFO: renamed from: a */
    public IBinder f54160a;

    /* JADX INFO: renamed from: C */
    public final Messenger m37315C(String str, Bundle bundle, Messenger messenger) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.waze.sdk.ISdkService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            if (messenger != null) {
                parcelObtain.writeInt(1);
                messenger.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.f54160a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i = ey30.f63932a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (Messenger) Messenger.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f54160a;
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m37316v1() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.waze.sdk.ISdkService");
            if (!this.f54160a.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i = ey30.f63932a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
