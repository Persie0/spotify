package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ay91 extends gy91 {

    /* JADX INFO: renamed from: a */
    public static final ay91 f21170a = new ay91();
    public static final Parcelable.Creator<ay91> CREATOR = new f891(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ay91);
    }

    public final int hashCode() {
        return -2074472470;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
