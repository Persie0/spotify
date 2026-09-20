package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class coz extends goz {

    /* JADX INFO: renamed from: d */
    public static final coz f40371d = new coz(gn80.FMA_UPSELL_SHUFFLE);
    public static final Parcelable.Creator<coz> CREATOR = new ygz(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof coz);
    }

    public final int hashCode() {
        return -209393390;
    }

    public final String toString() {
        return "Shuffle";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
