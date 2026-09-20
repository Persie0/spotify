package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class zrh0 implements csh0 {

    /* JADX INFO: renamed from: a */
    public static final zrh0 f285689a = new zrh0();
    public static final Parcelable.Creator<zrh0> CREATOR = new xuf0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zrh0);
    }

    public final int hashCode() {
        return -1777144180;
    }

    public final String toString() {
        return "NoBeatmatching";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
