package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hw30 extends iw30 {

    /* JADX INFO: renamed from: c */
    public static final hw30 f95852c = new hw30(27, 1);
    public static final Parcelable.Creator<hw30> CREATOR = new bw30(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hw30);
    }

    public final int hashCode() {
        return -1968421183;
    }

    public final String toString() {
        return "RejectRequestGenericError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
