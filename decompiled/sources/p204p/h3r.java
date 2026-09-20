package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class h3r extends j3r {

    /* JADX INFO: renamed from: a */
    public static final h3r f87292a = new h3r();
    public static final Parcelable.Creator<h3r> CREATOR = new lso(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h3r);
    }

    public final int hashCode() {
        return -1233102895;
    }

    public final String toString() {
        return "Enabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
