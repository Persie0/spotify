package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class uc91 implements yc91 {

    /* JADX INFO: renamed from: a */
    public static final uc91 f228976a = new uc91();
    public static final Parcelable.Creator<uc91> CREATOR = new f891(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof uc91);
    }

    public final int hashCode() {
        return -419398664;
    }

    public final String toString() {
        return "Disabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
