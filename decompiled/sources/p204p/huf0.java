package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class huf0 implements juf0 {

    /* JADX INFO: renamed from: a */
    public static final huf0 f95398a = new huf0();
    public static final Parcelable.Creator<huf0> CREATOR = new r4f0(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof huf0);
    }

    public final int hashCode() {
        return -1381550726;
    }

    public final String toString() {
        return "WontPlayOverConnect";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // p204p.juf0
    /* JADX INFO: renamed from: y */
    public final auf0 mo30512y() {
        return ztf0.f286153a;
    }
}
