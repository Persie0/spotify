package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class bh41 implements s6m0 {

    /* JADX INFO: renamed from: a */
    public static final bh41 f27081a = new bh41();
    public static final Parcelable.Creator<bh41> CREATOR = new ln31(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bh41);
    }

    public final int hashCode() {
        return 1440769281;
    }

    public final String toString() {
        return "Stack";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
