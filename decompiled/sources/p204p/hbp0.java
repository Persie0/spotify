package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class hbp0 implements jbp0 {

    /* JADX INFO: renamed from: a */
    public static final hbp0 f89568a = new hbp0();
    public static final Parcelable.Creator<hbp0> CREATOR = new igo0(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hbp0);
    }

    public final int hashCode() {
        return -1025096192;
    }

    public final String toString() {
        return "Stopped";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
