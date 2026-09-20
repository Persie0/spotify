package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xvd0 implements awd0 {

    /* JADX INFO: renamed from: a */
    public static final xvd0 f266367a = new xvd0();
    public static final Parcelable.Creator<xvd0> CREATOR = new jfd0(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xvd0);
    }

    public final int hashCode() {
        return -328441671;
    }

    public final String toString() {
        return "Cancelled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
