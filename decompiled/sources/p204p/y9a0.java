package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class y9a0 implements aaa0 {

    /* JADX INFO: renamed from: a */
    public static final y9a0 f270549a = new y9a0();
    public static final Parcelable.Creator<y9a0> CREATOR = new z8a0(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y9a0);
    }

    public final int hashCode() {
        return -1492130101;
    }

    public final String toString() {
        return "Offline";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
