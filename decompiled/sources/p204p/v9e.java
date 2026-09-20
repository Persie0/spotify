package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class v9e implements dae {

    /* JADX INFO: renamed from: a */
    public static final v9e f238925a = new v9e();
    public static final Parcelable.Creator<v9e> CREATOR = new n6e(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v9e);
    }

    public final int hashCode() {
        return -1413712135;
    }

    public final String toString() {
        return "SkippedToSpotify";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
