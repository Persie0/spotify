package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class dbb implements ebb {

    /* JADX INFO: renamed from: a */
    public static final dbb f47269a = new dbb();
    public static final Parcelable.Creator<dbb> CREATOR = new jja(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dbb);
    }

    public final int hashCode() {
        return -679445043;
    }

    public final String toString() {
        return "Uninitialized";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
