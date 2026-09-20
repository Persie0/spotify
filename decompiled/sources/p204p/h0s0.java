package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class h0s0 extends o0s0 {

    /* JADX INFO: renamed from: a */
    public static final h0s0 f86348a = new h0s0();
    public static final Parcelable.Creator<h0s0> CREATOR = new uir0(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h0s0);
    }

    public final int hashCode() {
        return -1674557127;
    }

    public final String toString() {
        return "INCOMING_FRIEND_REQUEST";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
