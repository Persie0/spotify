package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class iej implements lej {

    /* JADX INFO: renamed from: a */
    public static final iej f101421a = new iej();
    public static final Parcelable.Creator<iej> CREATOR = new wcj(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iej);
    }

    public final int hashCode() {
        return -332776756;
    }

    public final String toString() {
        return "Gated";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
