package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class znz extends goz {

    /* JADX INFO: renamed from: d */
    public static final znz f284602d = new znz(gn80.FMA_UPSELL_DOWNLOADS);
    public static final Parcelable.Creator<znz> CREATOR = new ygz(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof znz);
    }

    public final int hashCode() {
        return -992098108;
    }

    public final String toString() {
        return "Downloads";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
