package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wzd extends yzd {

    /* JADX INFO: renamed from: a */
    public static final wzd f256573a = new wzd();
    public static final Parcelable.Creator<wzd> CREATOR = new fjd(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wzd);
    }

    public final int hashCode() {
        return -1365508286;
    }

    public final String toString() {
        return "Pending";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
