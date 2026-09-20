package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cn50 implements dn50 {

    /* JADX INFO: renamed from: a */
    public static final cn50 f39893a = new cn50();
    public static final Parcelable.Creator<cn50> CREATOR = new gd50(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cn50);
    }

    public final int hashCode() {
        return -1247603555;
    }

    public final String toString() {
        return "Success";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
