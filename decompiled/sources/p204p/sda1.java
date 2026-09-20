package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class sda1 extends vda1 {

    /* JADX INFO: renamed from: a */
    public static final sda1 f207966a = new sda1();
    public static final Parcelable.Creator<sda1> CREATOR = new u2a1(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sda1);
    }

    public final int hashCode() {
        return -60484520;
    }

    public final String toString() {
        return "Monthly";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
