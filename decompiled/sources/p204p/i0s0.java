package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class i0s0 extends o0s0 {

    /* JADX INFO: renamed from: a */
    public static final i0s0 f97313a = new i0s0();
    public static final Parcelable.Creator<i0s0> CREATOR = new uir0(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i0s0);
    }

    public final int hashCode() {
        return 500212368;
    }

    public final String toString() {
        return "INVITED_FRIEND";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
