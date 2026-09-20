package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class doz extends goz {

    /* JADX INFO: renamed from: d */
    public static final doz f51132d = new doz(gn80.FMA_UPSELL_SKIP_NEXT);
    public static final Parcelable.Creator<doz> CREATOR = new ygz(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof doz);
    }

    public final int hashCode() {
        return 131247641;
    }

    public final String toString() {
        return "SkipNext";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
