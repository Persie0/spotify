package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class kp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final kp01 f124948d = new kp01(null, "spotify-on-platform-group");
    public static final Parcelable.Creator<kp01> CREATOR = new vj01(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kp01);
    }

    public final int hashCode() {
        return 1392308581;
    }

    public final String toString() {
        return "Group";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
