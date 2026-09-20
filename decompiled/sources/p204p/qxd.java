package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qxd implements sxd {

    /* JADX INFO: renamed from: a */
    public static final qxd f193619a = new qxd();
    public static final Parcelable.Creator<qxd> CREATOR = new fjd(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qxd);
    }

    public final int hashCode() {
        return -703071337;
    }

    public final String toString() {
        return "DM";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
