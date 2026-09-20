package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class pp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final pp01 f179843d = new pp01(20, "linkedin");
    public static final Parcelable.Creator<pp01> CREATOR = new vj01(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pp01);
    }

    public final int hashCode() {
        return -1840783240;
    }

    public final String toString() {
        return "LinkedIn";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
