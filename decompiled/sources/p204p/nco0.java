package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class nco0 implements qco0 {

    /* JADX INFO: renamed from: a */
    public static final nco0 f152564a = new nco0();
    public static final Parcelable.Creator<nco0> CREATOR = new o2o0(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nco0);
    }

    public final int hashCode() {
        return -1789623041;
    }

    public final String toString() {
        return "Free";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
