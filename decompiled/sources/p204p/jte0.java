package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class jte0 implements pte0 {

    /* JADX INFO: renamed from: a */
    public static final jte0 f115852a = new jte0();
    public static final Parcelable.Creator<jte0> CREATOR = new ube0(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jte0);
    }

    public final int hashCode() {
        return 1069496567;
    }

    public final String toString() {
        return "Banner";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
