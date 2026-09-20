package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class iew implements kew {

    /* JADX INFO: renamed from: a */
    public static final iew f101567a = new iew();
    public static final Parcelable.Creator<iew> CREATOR = new bwv(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iew);
    }

    public final int hashCode() {
        return -475660777;
    }

    public final String toString() {
        return "FullError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
