package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ey91 extends gy91 {

    /* JADX INFO: renamed from: a */
    public static final ey91 f63995a = new ey91();
    public static final Parcelable.Creator<ey91> CREATOR = new f891(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ey91);
    }

    public final int hashCode() {
        return 1112419998;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
