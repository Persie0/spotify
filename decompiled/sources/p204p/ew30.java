package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ew30 extends iw30 {

    /* JADX INFO: renamed from: c */
    public static final ew30 f63409c = new ew30(22, 1);
    public static final Parcelable.Creator<ew30> CREATOR = new bw30(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ew30);
    }

    public final int hashCode() {
        return -1781821969;
    }

    public final String toString() {
        return "AskToJoinGenericError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
