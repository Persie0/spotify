package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final rp01 f201396d = new rp01(null, "spotify-on-platform-search");
    public static final Parcelable.Creator<rp01> CREATOR = new vj01(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rp01);
    }

    public final int hashCode() {
        return 543016834;
    }

    public final String toString() {
        return "Search";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
