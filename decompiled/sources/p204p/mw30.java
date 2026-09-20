package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class mw30 extends nw30 {

    /* JADX INFO: renamed from: c */
    public static final mw30 f147707c = new mw30(30, 2);
    public static final Parcelable.Creator<mw30> CREATOR = new bw30(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mw30);
    }

    public final int hashCode() {
        return -3964096;
    }

    public final String toString() {
        return "RejectJoinRequestSuccess";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
