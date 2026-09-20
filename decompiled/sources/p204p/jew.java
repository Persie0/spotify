package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jew implements kew {

    /* JADX INFO: renamed from: a */
    public static final jew f111682a = new jew();
    public static final Parcelable.Creator<jew> CREATOR = new bwv(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jew);
    }

    public final int hashCode() {
        return -998277399;
    }

    public final String toString() {
        return "PartialError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
