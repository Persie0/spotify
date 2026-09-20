package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class w9e implements dae {

    /* JADX INFO: renamed from: a */
    public static final w9e f249164a = new w9e();
    public static final Parcelable.Creator<w9e> CREATOR = new n6e(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w9e);
    }

    public final int hashCode() {
        return 211997808;
    }

    public final String toString() {
        return "SkippedToSpotifyNative";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
