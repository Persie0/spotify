package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final zp01 f284897d = new zp01(13, "tiktok-feed");
    public static final Parcelable.Creator<zp01> CREATOR = new sp01(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zp01);
    }

    public final int hashCode() {
        return 2013487762;
    }

    public final String toString() {
        return "TiktokFeed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
