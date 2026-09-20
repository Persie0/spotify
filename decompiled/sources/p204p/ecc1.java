package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ecc1 implements fcc1 {

    /* JADX INFO: renamed from: a */
    public static final ecc1 f58306a = new ecc1();
    public static final Parcelable.Creator<ecc1> CREATOR = new c8b1(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ecc1);
    }

    public final int hashCode() {
        return -1726706029;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
