package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class bk01 extends ck01 {

    /* JADX INFO: renamed from: a */
    public static final bk01 f27801a = new bk01();

    /* JADX INFO: renamed from: b */
    public static final float f27802b = leu.f132721a.m44636b().f164906a;
    public static final Parcelable.Creator<bk01> CREATOR = new vj01(5);

    @Override // p204p.ck01
    /* JADX INFO: renamed from: c */
    public final float mo26181c() {
        return f27802b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
