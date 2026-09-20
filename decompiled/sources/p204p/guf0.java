package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class guf0 implements juf0 {

    /* JADX INFO: renamed from: a */
    public static final guf0 f84465a = new guf0();
    public static final Parcelable.Creator<guf0> CREATOR = new r4f0(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof guf0);
    }

    public final int hashCode() {
        return 1815287410;
    }

    public final String toString() {
        return "ReorderSuccess";
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
