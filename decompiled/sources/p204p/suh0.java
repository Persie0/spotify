package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class suh0 implements bwh0 {

    /* JADX INFO: renamed from: a */
    public static final suh0 f214126a = new suh0();
    public static final Parcelable.Creator<suh0> CREATOR = new ruh0(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof suh0);
    }

    public final int hashCode() {
        return 1805749128;
    }

    public final String toString() {
        return "LoadError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
