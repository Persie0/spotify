package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zj01 extends ck01 {
    public static final Parcelable.Creator<zj01> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final zj01 f283324a = new zj01();

    /* JADX INFO: renamed from: b */
    public static final float f283325b;

    static {
        leu.f132721a.getClass();
        f283325b = ((ofu) gfp.f79427i.getValue()).f164906a;
        CREATOR = new vj01(3);
    }

    @Override // p204p.ck01
    /* JADX INFO: renamed from: c */
    public final float mo26181c() {
        return f283325b;
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
