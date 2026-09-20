package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class dw30 extends iw30 {

    /* JADX INFO: renamed from: c */
    public static final dw30 f53595c = new dw30(24, 1);
    public static final Parcelable.Creator<dw30> CREATOR = new bw30(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dw30);
    }

    public final int hashCode() {
        return 181128478;
    }

    public final String toString() {
        return "AcceptRequestSessionFull";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
