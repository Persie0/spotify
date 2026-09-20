package p204p;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class nu30 implements pu30 {

    /* JADX INFO: renamed from: a */
    public IBinder f158506a;

    /* JADX INFO: renamed from: C */
    public final boolean m65669C(jbm jbmVar, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(pu30.f181322c);
            parcelObtain.writeStrongInterface(jbmVar);
            q350.m72064s(parcelObtain, uri);
            q350.m72064s(parcelObtain, bundle);
            parcelObtain.writeInt(-1);
            this.f158506a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final boolean m65670a2(jbm jbmVar, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(pu30.f181322c);
            parcelObtain.writeStrongInterface(jbmVar);
            q350.m72064s(parcelObtain, bundle);
            this.f158506a.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f158506a;
    }

    /* JADX INFO: renamed from: b2 */
    public final boolean m65671b2(jbm jbmVar, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(pu30.f181322c);
            parcelObtain.writeStrongInterface(jbmVar);
            q350.m72064s(parcelObtain, uri);
            parcelObtain.writeInt(1);
            q350.m72064s(parcelObtain, bundle);
            this.f158506a.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final boolean m65672c2() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(pu30.f181322c);
            parcelObtain.writeLong(0L);
            this.f158506a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m65673v1(jbm jbmVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(pu30.f181322c);
            parcelObtain.writeStrongInterface(jbmVar);
            this.f158506a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
