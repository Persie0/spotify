package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class lp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final lp01 f135591d = new lp01(5, "instagram-direct");
    public static final Parcelable.Creator<lp01> CREATOR = new vj01(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lp01);
    }

    public final int hashCode() {
        return -2006088093;
    }

    public final String toString() {
        return "InstagramDirectMessaging";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
