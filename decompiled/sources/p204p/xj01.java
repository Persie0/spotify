package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class xj01 extends ck01 {

    /* JADX INFO: renamed from: a */
    public static final xj01 f261984a = new xj01();

    /* JADX INFO: renamed from: b */
    public static final float f261985b = leu.f132721a.m44635a().f164906a;
    public static final Parcelable.Creator<xj01> CREATOR = new vj01(1);

    @Override // p204p.ck01
    /* JADX INFO: renamed from: c */
    public final float mo26181c() {
        return f261985b;
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
