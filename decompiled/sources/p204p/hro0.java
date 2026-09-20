package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hro0 implements sro0 {

    /* JADX INFO: renamed from: a */
    public static final hro0 f94505a = new hro0();
    public static final Parcelable.Creator<hro0> CREATOR = new igo0(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hro0);
    }

    public final int hashCode() {
        return 869345376;
    }

    public final String toString() {
        return "Paused";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
