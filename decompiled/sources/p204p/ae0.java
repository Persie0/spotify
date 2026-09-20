package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ae0 implements be0 {

    /* JADX INFO: renamed from: a */
    public static final ae0 f14705a = new ae0();
    public static final Parcelable.Creator<ae0> CREATOR = new C2267ps(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ae0);
    }

    public final int hashCode() {
        return -1470290807;
    }

    public final String toString() {
        return "Inactive";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
