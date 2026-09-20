package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class e0s0 extends o0s0 {

    /* JADX INFO: renamed from: a */
    public static final e0s0 f55029a = new e0s0();
    public static final Parcelable.Creator<e0s0> CREATOR = new uir0(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e0s0);
    }

    public final int hashCode() {
        return 2114777813;
    }

    public final String toString() {
        return "ARTIST";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
