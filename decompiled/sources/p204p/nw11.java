package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class nw11 implements ow11 {

    /* JADX INFO: renamed from: a */
    public static final nw11 f159003a = new nw11();
    public static final Parcelable.Creator<nw11> CREATOR = new u111(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nw11);
    }

    public final int hashCode() {
        return 1722040262;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
