package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class tda1 extends vda1 {

    /* JADX INFO: renamed from: a */
    public static final tda1 f219274a = new tda1();
    public static final Parcelable.Creator<tda1> CREATOR = new u2a1(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tda1);
    }

    public final int hashCode() {
        return -1022892649;
    }

    public final String toString() {
        return "Never";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
