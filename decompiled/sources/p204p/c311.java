package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class c311 extends d311 {

    /* JADX INFO: renamed from: a */
    public static final c311 f33524a = new c311();
    public static final Parcelable.Creator<c311> CREATOR = new u111(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c311);
    }

    public final int hashCode() {
        return 1994305729;
    }

    public final String toString() {
        return "Uninitialized";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
