package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class g2i extends h2i {

    /* JADX INFO: renamed from: a */
    public static final g2i f75963a = new g2i();
    public static final Parcelable.Creator<g2i> CREATOR = new f2i(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g2i);
    }

    public final int hashCode() {
        return -1328627416;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
