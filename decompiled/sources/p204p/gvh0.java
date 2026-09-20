package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class gvh0 implements vvh0 {

    /* JADX INFO: renamed from: a */
    public static final gvh0 f84758a = new gvh0();
    public static final Parcelable.Creator<gvh0> CREATOR = new ruh0(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gvh0);
    }

    public final int hashCode() {
        return 413391202;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
