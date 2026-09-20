package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ewe0 extends fwe0 {

    /* JADX INFO: renamed from: a */
    public static final ewe0 f63525a = new ewe0();
    public static final Parcelable.Creator<ewe0> CREATOR = new ube0(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ewe0);
    }

    public final int hashCode() {
        return -1812563787;
    }

    public final String toString() {
        return "Uninitialized";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
