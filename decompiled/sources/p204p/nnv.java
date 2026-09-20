package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class nnv extends pnv {

    /* JADX INFO: renamed from: a */
    public static final nnv f156494a = new nnv();
    public static final Parcelable.Creator<nnv> CREATOR = new m8v(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nnv);
    }

    public final int hashCode() {
        return 1559627669;
    }

    public final String toString() {
        return "Squared";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
