package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class foz extends goz {

    /* JADX INFO: renamed from: d */
    public static final foz f71653d = new foz(gn80.FMA_UPSELL_TRACK_SELECT_SEARCH);
    public static final Parcelable.Creator<foz> CREATOR = new ygz(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof foz);
    }

    public final int hashCode() {
        return -1595859576;
    }

    public final String toString() {
        return "TrackSelectSearch";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
