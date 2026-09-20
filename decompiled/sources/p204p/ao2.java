package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ao2 implements bo2 {

    /* JADX INFO: renamed from: a */
    public static final ao2 f17544a = new ao2();
    public static final Parcelable.Creator<ao2> CREATOR = new lb2(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ao2);
    }

    public final int hashCode() {
        return -1344869664;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
