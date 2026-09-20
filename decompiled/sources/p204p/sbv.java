package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class sbv extends tbv {

    /* JADX INFO: renamed from: a */
    public static final sbv f207586a = new sbv();
    public static final Parcelable.Creator<sbv> CREATOR = new m8v(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sbv);
    }

    public final int hashCode() {
        return -1481467351;
    }

    public final String toString() {
        return "Recents";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
