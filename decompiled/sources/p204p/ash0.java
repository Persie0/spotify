package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ash0 implements csh0 {

    /* JADX INFO: renamed from: a */
    public static final ash0 f19458a = new ash0();
    public static final Parcelable.Creator<ash0> CREATOR = new xuf0(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ash0);
    }

    public final int hashCode() {
        return 1958535600;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
