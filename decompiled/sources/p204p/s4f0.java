package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class s4f0 extends u4f0 {

    /* JADX INFO: renamed from: a */
    public static final s4f0 f205579a = new s4f0();
    public static final Parcelable.Creator<s4f0> CREATOR = new r4f0(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s4f0);
    }

    public final int hashCode() {
        return 1564007393;
    }

    public final String toString() {
        return "LoadingWithError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
