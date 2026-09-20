package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class t311 extends u311 {

    /* JADX INFO: renamed from: a */
    public static final t311 f216688a = new t311();
    public static final Parcelable.Creator<t311> CREATOR = new u111(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t311);
    }

    public final int hashCode() {
        return -728444805;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
