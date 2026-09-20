package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class nae implements oae {

    /* JADX INFO: renamed from: a */
    public static final nae f152049a = new nae();
    public static final Parcelable.Creator<nae> CREATOR = new n6e(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nae);
    }

    public final int hashCode() {
        return -2048065632;
    }

    public final String toString() {
        return "Retry";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
