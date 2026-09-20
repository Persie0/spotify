package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class bq01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final bq01 f29640d = new bq01(null, "spotify-on-platform-users-nearby");
    public static final Parcelable.Creator<bq01> CREATOR = new sp01(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bq01);
    }

    public final int hashCode() {
        return 43955469;
    }

    public final String toString() {
        return "UsersNearby";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
