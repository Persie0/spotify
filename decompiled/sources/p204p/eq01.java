package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class eq01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final eq01 f61756d = new eq01(10, "twitter");
    public static final Parcelable.Creator<eq01> CREATOR = new sp01(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eq01);
    }

    public final int hashCode() {
        return 2120834654;
    }

    public final String toString() {
        return "X";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
