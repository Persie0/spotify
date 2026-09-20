package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class d081 extends e081 {

    /* JADX INFO: renamed from: a */
    public static final d081 f43812a = new d081();
    public static final Parcelable.Creator<d081> CREATOR = new sr71(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d081);
    }

    public final int hashCode() {
        return 974092696;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
