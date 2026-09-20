package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class lsx0 extends nsx0 {

    /* JADX INFO: renamed from: a */
    public static final lsx0 f136633a = new lsx0();
    public static final Parcelable.Creator<lsx0> CREATOR = new csx0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lsx0);
    }

    public final int hashCode() {
        return -1706267104;
    }

    public final String toString() {
        return "NoLicensesAvailable";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
