package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class x9a0 implements aaa0 {

    /* JADX INFO: renamed from: a */
    public static final x9a0 f259307a = new x9a0();
    public static final Parcelable.Creator<x9a0> CREATOR = new z8a0(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x9a0);
    }

    public final int hashCode() {
        return 1195818832;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
