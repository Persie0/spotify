package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class nx01 extends ox01 {

    /* JADX INFO: renamed from: a */
    public static final nx01 f159318a = new nx01();
    public static final Parcelable.Creator<nx01> CREATOR = new bv01(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nx01);
    }

    public final int hashCode() {
        return 885290340;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
