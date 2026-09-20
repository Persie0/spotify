package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class qbv extends tbv {

    /* JADX INFO: renamed from: a */
    public static final qbv f187174a = new qbv();
    public static final Parcelable.Creator<qbv> CREATOR = new m8v(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qbv);
    }

    public final int hashCode() {
        return -1487892814;
    }

    public final String toString() {
        return "BestMatch";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
