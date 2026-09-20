package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class q4f0 extends u4f0 {

    /* JADX INFO: renamed from: a */
    public static final q4f0 f185172a = new q4f0();
    public static final Parcelable.Creator<q4f0> CREATOR = new ube0(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q4f0);
    }

    public final int hashCode() {
        return -496848383;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
