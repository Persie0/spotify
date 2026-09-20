package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class o4f0 extends u4f0 {

    /* JADX INFO: renamed from: a */
    public static final o4f0 f161662a = new o4f0();
    public static final Parcelable.Creator<o4f0> CREATOR = new ube0(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o4f0);
    }

    public final int hashCode() {
        return 538161824;
    }

    public final String toString() {
        return "Loaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
