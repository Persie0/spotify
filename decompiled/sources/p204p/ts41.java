package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ts41 extends yu41 {

    /* JADX INFO: renamed from: a */
    public static final ts41 f223213a = new ts41();
    public static final Parcelable.Creator<ts41> CREATOR = new tj41(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ts41);
    }

    public final int hashCode() {
        return -1653650522;
    }

    public final String toString() {
        return "GenericError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
