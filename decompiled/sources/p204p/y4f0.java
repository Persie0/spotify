package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class y4f0 extends a5f0 {

    /* JADX INFO: renamed from: a */
    public static final y4f0 f269137a = new y4f0();
    public static final Parcelable.Creator<y4f0> CREATOR = new r4f0(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y4f0);
    }

    public final int hashCode() {
        return -260510057;
    }

    public final String toString() {
        return "Enriching";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
