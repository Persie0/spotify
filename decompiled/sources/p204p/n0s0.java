package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class n0s0 extends o0s0 {

    /* JADX INFO: renamed from: a */
    public static final n0s0 f149139a = new n0s0();
    public static final Parcelable.Creator<n0s0> CREATOR = new uir0(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n0s0);
    }

    public final int hashCode() {
        return 1581124188;
    }

    public final String toString() {
        return "UNKNOWN";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
