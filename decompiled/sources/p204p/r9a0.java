package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class r9a0 implements baa0 {

    /* JADX INFO: renamed from: a */
    public static final r9a0 f196963a = new r9a0();
    public static final Parcelable.Creator<r9a0> CREATOR = new z8a0(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r9a0);
    }

    public final int hashCode() {
        return 1078653018;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
