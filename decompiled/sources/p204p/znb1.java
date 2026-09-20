package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class znb1 extends aob1 {

    /* JADX INFO: renamed from: a */
    public static final znb1 f284453a = new znb1();
    public static final Parcelable.Creator<znb1> CREATOR = new c8b1(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof znb1);
    }

    public final int hashCode() {
        return -1369592260;
    }

    public final String toString() {
        return "FIT";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
