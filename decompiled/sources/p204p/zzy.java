package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class zzy extends b0z {

    /* JADX INFO: renamed from: a */
    public static final zzy f288155a = new zzy();
    public static final Parcelable.Creator<zzy> CREATOR = new eqy(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zzy);
    }

    public final int hashCode() {
        return -1707410074;
    }

    public final String toString() {
        return "Custom";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
