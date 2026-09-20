package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fvh0 implements bwh0 {

    /* JADX INFO: renamed from: a */
    public static final fvh0 f73798a = new fvh0();
    public static final Parcelable.Creator<fvh0> CREATOR = new ruh0(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fvh0);
    }

    public final int hashCode() {
        return -1598084734;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
