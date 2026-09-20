package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class k0s0 extends o0s0 {

    /* JADX INFO: renamed from: a */
    public static final k0s0 f118140a = new k0s0();
    public static final Parcelable.Creator<k0s0> CREATOR = new uir0(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k0s0);
    }

    public final int hashCode() {
        return 1556539323;
    }

    public final String toString() {
        return "PROFILE";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
