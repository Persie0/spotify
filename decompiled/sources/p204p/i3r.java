package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class i3r extends j3r {

    /* JADX INFO: renamed from: a */
    public static final i3r f98255a = new i3r();
    public static final Parcelable.Creator<i3r> CREATOR = new lso(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i3r);
    }

    public final int hashCode() {
        return -449705165;
    }

    public final String toString() {
        return "RestrictionsDisabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
