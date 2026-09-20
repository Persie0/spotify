package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class xp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final xp01 f264405d = new xp01(1, "snapchat-lens");
    public static final Parcelable.Creator<xp01> CREATOR = new sp01(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xp01);
    }

    public final int hashCode() {
        return 89204424;
    }

    public final String toString() {
        return "SnapchatLenses";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
