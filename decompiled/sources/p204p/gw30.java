package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class gw30 extends iw30 {

    /* JADX INFO: renamed from: c */
    public static final gw30 f84903c = new gw30(21, 1);
    public static final Parcelable.Creator<gw30> CREATOR = new bw30(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gw30);
    }

    public final int hashCode() {
        return -743460858;
    }

    public final String toString() {
        return "CancelRequestGenericError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
