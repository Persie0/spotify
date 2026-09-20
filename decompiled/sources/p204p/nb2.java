package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class nb2 extends ob2 {

    /* JADX INFO: renamed from: a */
    public static final nb2 f152163a = new nb2();
    public static final Parcelable.Creator<nb2> CREATOR = new lb2(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nb2);
    }

    public final int hashCode() {
        return -235820821;
    }

    public final String toString() {
        return "Valid";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
