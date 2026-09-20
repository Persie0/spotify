package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class j0s0 extends o0s0 {

    /* JADX INFO: renamed from: a */
    public static final j0s0 f107544a = new j0s0();
    public static final Parcelable.Creator<j0s0> CREATOR = new uir0(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j0s0);
    }

    public final int hashCode() {
        return -405150240;
    }

    public final String toString() {
        return "PLAYLIST";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
