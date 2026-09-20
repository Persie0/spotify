package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rda1 extends vda1 {

    /* JADX INFO: renamed from: a */
    public static final rda1 f198084a = new rda1();
    public static final Parcelable.Creator<rda1> CREATOR = new u2a1(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rda1);
    }

    public final int hashCode() {
        return -1032259292;
    }

    public final String toString() {
        return "Daily";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
