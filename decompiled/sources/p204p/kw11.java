package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kw11 implements ow11 {

    /* JADX INFO: renamed from: a */
    public static final kw11 f126992a = new kw11();
    public static final Parcelable.Creator<kw11> CREATOR = new u111(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kw11);
    }

    public final int hashCode() {
        return 634538770;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
