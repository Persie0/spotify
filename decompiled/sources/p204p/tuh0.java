package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class tuh0 implements vvh0 {

    /* JADX INFO: renamed from: a */
    public static final tuh0 f223864a = new tuh0();
    public static final Parcelable.Creator<tuh0> CREATOR = new ruh0(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tuh0);
    }

    public final int hashCode() {
        return 2098840424;
    }

    public final String toString() {
        return "LoadError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
