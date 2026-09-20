package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class lw30 extends nw30 {

    /* JADX INFO: renamed from: c */
    public static final lw30 f137442c = new lw30(29, 2);
    public static final Parcelable.Creator<lw30> CREATOR = new bw30(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lw30);
    }

    public final int hashCode() {
        return -1899681600;
    }

    public final String toString() {
        return "JoinRequestRejected";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
