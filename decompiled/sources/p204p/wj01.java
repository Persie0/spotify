package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class wj01 extends ck01 {
    public static final Parcelable.Creator<wj01> CREATOR;

    /* JADX INFO: renamed from: a */
    public static final wj01 f251822a = new wj01();

    /* JADX INFO: renamed from: b */
    public static final float f251823b;

    static {
        leu.f132721a.getClass();
        f251823b = 1.1111112f;
        CREATOR = new vj01(0);
    }

    @Override // p204p.ck01
    /* JADX INFO: renamed from: c */
    public final float mo26181c() {
        return f251823b;
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
