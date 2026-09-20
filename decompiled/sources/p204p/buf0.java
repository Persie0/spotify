package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class buf0 implements juf0 {

    /* JADX INFO: renamed from: a */
    public static final buf0 f31130a = new buf0();
    public static final Parcelable.Creator<buf0> CREATOR = new r4f0(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof buf0);
    }

    public final int hashCode() {
        return 1180450079;
    }

    public final String toString() {
        return "AutoMixDisabled";
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
