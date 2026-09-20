package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class mnv extends pnv {

    /* JADX INFO: renamed from: a */
    public static final mnv f145480a = new mnv();
    public static final Parcelable.Creator<mnv> CREATOR = new m8v(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mnv);
    }

    public final int hashCode() {
        return -2117390634;
    }

    public final String toString() {
        return "Snapshot";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
