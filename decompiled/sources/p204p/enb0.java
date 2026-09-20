package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class enb0 implements fnb0 {

    /* JADX INFO: renamed from: a */
    public static final enb0 f61122a = new enb0();
    public static final Parcelable.Creator<enb0> CREATOR = new rib0(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof enb0);
    }

    public final int hashCode() {
        return -1282036935;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
