package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class sc81 implements vc81 {

    /* JADX INFO: renamed from: a */
    public static final sc81 f207660a = new sc81();
    public static final Parcelable.Creator<sc81> CREATOR = new f881(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sc81);
    }

    public final int hashCode() {
        return 1574085654;
    }

    public final String toString() {
        return "Mtv";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
