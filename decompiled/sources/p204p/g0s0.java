package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class g0s0 extends o0s0 {

    /* JADX INFO: renamed from: a */
    public static final g0s0 f75430a = new g0s0();
    public static final Parcelable.Creator<g0s0> CREATOR = new uir0(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g0s0);
    }

    public final int hashCode() {
        return -2037375444;
    }

    public final String toString() {
        return "FRIEND";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
