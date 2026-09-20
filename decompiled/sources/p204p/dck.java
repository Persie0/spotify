package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dck implements ick {

    /* JADX INFO: renamed from: a */
    public static final dck f47573a = new dck();
    public static final Parcelable.Creator<dck> CREATOR = new dnj(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dck);
    }

    public final int hashCode() {
        return 1219326734;
    }

    public final String toString() {
        return "DELETED_FOR_SELF";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
