package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cdj implements hdj {

    /* JADX INFO: renamed from: a */
    public static final cdj f36897a = new cdj();
    public static final Parcelable.Creator<cdj> CREATOR = new wcj(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cdj);
    }

    public final int hashCode() {
        return 1273193029;
    }

    public final String toString() {
        return "PhotoChange";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
