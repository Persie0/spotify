package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class cuf0 implements juf0 {

    /* JADX INFO: renamed from: a */
    public static final cuf0 f42107a = new cuf0();
    public static final Parcelable.Creator<cuf0> CREATOR = new r4f0(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cuf0);
    }

    public final int hashCode() {
        return -1718802370;
    }

    public final String toString() {
        return "AutoMixEnabled";
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
