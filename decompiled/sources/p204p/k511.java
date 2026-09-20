package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class k511 extends l511 {

    /* JADX INFO: renamed from: b */
    public static final k511 f119387b = new k511("screenshot");
    public static final Parcelable.Creator<k511> CREATOR = new u111(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k511);
    }

    public final int hashCode() {
        return -1802501298;
    }

    public final String toString() {
        return "Screenshot";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
