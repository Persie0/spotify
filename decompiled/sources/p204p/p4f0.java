package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class p4f0 extends u4f0 {

    /* JADX INFO: renamed from: a */
    public static final p4f0 f173915a = new p4f0();
    public static final Parcelable.Creator<p4f0> CREATOR = new ube0(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p4f0);
    }

    public final int hashCode() {
        return -1337647582;
    }

    public final String toString() {
        return "LoadedWithError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
