package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class b081 extends e081 {

    /* JADX INFO: renamed from: a */
    public static final b081 f21799a = new b081();
    public static final Parcelable.Creator<b081> CREATOR = new sr71(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b081);
    }

    public final int hashCode() {
        return -1207578268;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
