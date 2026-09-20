package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class yp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final yp01 f274789d = new yp01(19, "threads");
    public static final Parcelable.Creator<yp01> CREATOR = new sp01(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yp01);
    }

    public final int hashCode() {
        return 642354447;
    }

    public final String toString() {
        return "Threads";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
