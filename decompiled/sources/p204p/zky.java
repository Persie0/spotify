package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class zky implements aly {

    /* JADX INFO: renamed from: a */
    public static final zky f283866a = new zky();
    public static final Parcelable.Creator<zky> CREATOR = new p7y(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zky);
    }

    public final int hashCode() {
        return 1510559815;
    }

    public final String toString() {
        return "ThumbsUp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
