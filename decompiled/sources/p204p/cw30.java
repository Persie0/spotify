package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cw30 extends iw30 {

    /* JADX INFO: renamed from: c */
    public static final cw30 f42620c = new cw30(25, 1);
    public static final Parcelable.Creator<cw30> CREATOR = new bw30(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cw30);
    }

    public final int hashCode() {
        return 1742557880;
    }

    public final String toString() {
        return "AcceptRequestGenericError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
