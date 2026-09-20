package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class t4f0 extends u4f0 {

    /* JADX INFO: renamed from: a */
    public static final t4f0 f216992a = new t4f0();
    public static final Parcelable.Creator<t4f0> CREATOR = new r4f0(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t4f0);
    }

    public final int hashCode() {
        return 370802496;
    }

    public final String toString() {
        return "PendingLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
