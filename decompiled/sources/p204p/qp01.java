package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class qp01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final qp01 f191110d = new qp01(17, "native-share-menu");
    public static final Parcelable.Creator<qp01> CREATOR = new vj01(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qp01);
    }

    public final int hashCode() {
        return -1478931537;
    }

    public final String toString() {
        return "More";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
