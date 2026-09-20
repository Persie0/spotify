package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class z300 extends a400 {

    /* JADX INFO: renamed from: b */
    public static final z300 f278736b = new z300(1000);
    public static final Parcelable.Creator<z300> CREATOR = new ygz(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z300);
    }

    public final int hashCode() {
        return 787910752;
    }

    public final String toString() {
        return "Required";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
