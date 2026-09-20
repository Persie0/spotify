package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class gp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final gp01 f83051d = new gp01(18, "download-copy-link");
    public static final Parcelable.Creator<gp01> CREATOR = new vj01(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gp01);
    }

    public final int hashCode() {
        return -1607656478;
    }

    public final String toString() {
        return "Download";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
