package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class eoz extends goz {

    /* JADX INFO: renamed from: d */
    public static final eoz f61518d = new eoz(gn80.FMA_UPSELL_TRACK_SELECT);
    public static final Parcelable.Creator<eoz> CREATOR = new ygz(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eoz);
    }

    public final int hashCode() {
        return -1766483008;
    }

    public final String toString() {
        return "TrackSelect";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
