package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fe0 implements ge0 {

    /* JADX INFO: renamed from: a */
    public static final fe0 f68628a = new fe0();
    public static final Parcelable.Creator<fe0> CREATOR = new C2267ps(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fe0);
    }

    public final int hashCode() {
        return -1640571338;
    }

    public final String toString() {
        return "Inactive";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
