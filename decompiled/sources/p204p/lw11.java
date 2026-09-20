package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class lw11 implements ow11 {

    /* JADX INFO: renamed from: a */
    public static final lw11 f137433a = new lw11();
    public static final Parcelable.Creator<lw11> CREATOR = new u111(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lw11);
    }

    public final int hashCode() {
        return -1726986784;
    }

    public final String toString() {
        return "Hidden";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
