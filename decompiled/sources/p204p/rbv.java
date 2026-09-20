package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rbv extends tbv {

    /* JADX INFO: renamed from: a */
    public static final rbv f197659a = new rbv();
    public static final Parcelable.Creator<rbv> CREATOR = new m8v(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rbv);
    }

    public final int hashCode() {
        return 2024530934;
    }

    public final String toString() {
        return "NewRelease";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
