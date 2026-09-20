package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class tib0 extends uib0 {

    /* JADX INFO: renamed from: a */
    public static final tib0 f220601a = new tib0();
    public static final Parcelable.Creator<tib0> CREATOR = new rib0(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tib0);
    }

    public final int hashCode() {
        return -1490264069;
    }

    public final String toString() {
        return "NotAvailable";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
