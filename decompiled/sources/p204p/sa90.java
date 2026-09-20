package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class sa90 implements va90 {

    /* JADX INFO: renamed from: a */
    public static final sa90 f207161a = new sa90();
    public static final Parcelable.Creator<sa90> CREATOR = new ra90(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sa90);
    }

    public final int hashCode() {
        return -1579724332;
    }

    public final String toString() {
        return "Loaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
