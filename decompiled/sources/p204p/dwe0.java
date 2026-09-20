package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class dwe0 extends fwe0 {

    /* JADX INFO: renamed from: a */
    public static final dwe0 f53685a = new dwe0();
    public static final Parcelable.Creator<dwe0> CREATOR = new ube0(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dwe0);
    }

    public final int hashCode() {
        return -1799576032;
    }

    public final String toString() {
        return "NoMessage";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
