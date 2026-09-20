package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class z251 implements a351 {

    /* JADX INFO: renamed from: a */
    public static final z251 f278498a = new z251();
    public static final Parcelable.Creator<z251> CREATOR = new q051(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z251);
    }

    public final int hashCode() {
        return 2082755207;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
