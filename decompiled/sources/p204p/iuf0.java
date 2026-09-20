package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class iuf0 implements juf0 {

    /* JADX INFO: renamed from: a */
    public static final iuf0 f105960a = new iuf0();
    public static final Parcelable.Creator<iuf0> CREATOR = new r4f0(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iuf0);
    }

    public final int hashCode() {
        return -1268179290;
    }

    public final String toString() {
        return "WontPlayOverJam";
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
