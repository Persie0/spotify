package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xc91 implements yc91 {

    /* JADX INFO: renamed from: a */
    public static final xc91 f260172a = new xc91();
    public static final Parcelable.Creator<xc91> CREATOR = new f891(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xc91);
    }

    public final int hashCode() {
        return -1550803143;
    }

    public final String toString() {
        return "Unsupported";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
