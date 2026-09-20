package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class nz01 extends oz01 {

    /* JADX INFO: renamed from: a */
    public static final nz01 f159969a = new nz01();
    public static final Parcelable.Creator<nz01> CREATOR = new bv01(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nz01);
    }

    public final int hashCode() {
        return -1173756593;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
