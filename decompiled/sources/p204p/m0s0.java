package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class m0s0 extends o0s0 {

    /* JADX INFO: renamed from: a */
    public static final m0s0 f138731a = new m0s0();
    public static final Parcelable.Creator<m0s0> CREATOR = new uir0(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m0s0);
    }

    public final int hashCode() {
        return 675012127;
    }

    public final String toString() {
        return "TOP_ARTIST";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
