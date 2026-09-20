package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class xzd extends yzd {

    /* JADX INFO: renamed from: a */
    public static final xzd f267587a = new xzd();
    public static final Parcelable.Creator<xzd> CREATOR = new fjd(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xzd);
    }

    public final int hashCode() {
        return 1744876974;
    }

    public final String toString() {
        return "Success";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
