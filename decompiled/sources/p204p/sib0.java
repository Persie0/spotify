package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class sib0 extends uib0 {

    /* JADX INFO: renamed from: a */
    public static final sib0 f209390a = new sib0();
    public static final Parcelable.Creator<sib0> CREATOR = new rib0(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sib0);
    }

    public final int hashCode() {
        return 1611831127;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
