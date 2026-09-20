package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class y0c implements z0c {

    /* JADX INFO: renamed from: a */
    public static final y0c f267958a = new y0c();
    public static final Parcelable.Creator<y0c> CREATOR = new jja(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y0c);
    }

    public final int hashCode() {
        return -835943978;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
