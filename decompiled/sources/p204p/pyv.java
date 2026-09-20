package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class pyv extends tyv {

    /* JADX INFO: renamed from: b */
    public static final pyv f183528b = new pyv("accountTransition");
    public static final Parcelable.Creator<pyv> CREATOR = new bwv(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pyv);
    }

    public final int hashCode() {
        return -1477025239;
    }

    public final String toString() {
        return "AccountTransition";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
