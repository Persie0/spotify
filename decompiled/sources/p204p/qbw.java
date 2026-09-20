package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class qbw extends sbw {

    /* JADX INFO: renamed from: a */
    public static final qbw f187179a = new qbw();
    public static final Parcelable.Creator<qbw> CREATOR = new bwv(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qbw);
    }

    public final int hashCode() {
        return -920997582;
    }

    public final String toString() {
        return "Custom";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
