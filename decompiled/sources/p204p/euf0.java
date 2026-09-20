package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class euf0 implements juf0 {

    /* JADX INFO: renamed from: a */
    public static final euf0 f62972a = new euf0();
    public static final Parcelable.Creator<euf0> CREATOR = new r4f0(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof euf0);
    }

    public final int hashCode() {
        return 1076145056;
    }

    public final String toString() {
        return "NotAvailableWhenMixing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // p204p.juf0
    /* JADX INFO: renamed from: y */
    public final auf0 mo30512y() {
        return ytf0.f276114a;
    }
}
