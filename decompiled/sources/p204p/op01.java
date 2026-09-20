package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class op01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final op01 f167731d = new op01(11, "line");
    public static final Parcelable.Creator<op01> CREATOR = new vj01(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof op01);
    }

    public final int hashCode() {
        return -1478967218;
    }

    public final String toString() {
        return "Line";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
