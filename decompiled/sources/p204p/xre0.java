package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xre0 implements zre0 {

    /* JADX INFO: renamed from: a */
    public static final xre0 f265332a = new xre0();
    public static final Parcelable.Creator<xre0> CREATOR = new ube0(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xre0);
    }

    public final int hashCode() {
        return -1869574649;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
