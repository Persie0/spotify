package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class yj01 extends ck01 {
    public static final Parcelable.Creator<yj01> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final yj01 f273239a = new yj01();

    /* JADX INFO: renamed from: b */
    public static final float f273240b;

    static {
        leu.f132721a.getClass();
        f273240b = 2.0f;
        CREATOR = new vj01(2);
    }

    @Override // p204p.ck01
    /* JADX INFO: renamed from: c */
    public final float mo26181c() {
        return f273240b;
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
