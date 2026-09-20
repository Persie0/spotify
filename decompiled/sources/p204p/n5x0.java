package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class n5x0 extends b7x0 {

    /* JADX INFO: renamed from: a */
    public static final n5x0 f150637a = new n5x0();
    public static final Parcelable.Creator<n5x0> CREATOR = new xxw0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n5x0);
    }

    public final int hashCode() {
        return 1480305050;
    }

    public final String toString() {
        return "Cancelled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
