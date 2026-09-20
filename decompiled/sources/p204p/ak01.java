package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ak01 extends ck01 {
    public static final Parcelable.Creator<ak01> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final ak01 f16384a = new ak01();

    /* JADX INFO: renamed from: b */
    public static final float f16385b;

    static {
        leu.f132721a.getClass();
        f16385b = ((ofu) gfp.f79422d.getValue()).f164906a;
        CREATOR = new vj01(4);
    }

    @Override // p204p.ck01
    /* JADX INFO: renamed from: c */
    public final float mo26181c() {
        return f16385b;
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
