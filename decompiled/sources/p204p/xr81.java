package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class xr81 implements as81 {

    /* JADX INFO: renamed from: a */
    public static final xr81 f265291a = new xr81();
    public static final Parcelable.Creator<xr81> CREATOR = new f881(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xr81);
    }

    public final int hashCode() {
        return -401695931;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
