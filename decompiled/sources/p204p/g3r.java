package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class g3r extends j3r {

    /* JADX INFO: renamed from: a */
    public static final g3r f76268a = new g3r();
    public static final Parcelable.Creator<g3r> CREATOR = new lso(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g3r);
    }

    public final int hashCode() {
        return 1637619011;
    }

    public final String toString() {
        return "CampfireDisabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
