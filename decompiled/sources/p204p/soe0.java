package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class soe0 extends toe0 {

    /* JADX INFO: renamed from: a */
    public static final soe0 f211178a = new soe0();
    public static final Parcelable.Creator<soe0> CREATOR = new ube0(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof soe0);
    }

    public final int hashCode() {
        return 1448755396;
    }

    public final String toString() {
        return "Initial";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
