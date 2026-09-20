package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fdj implements hdj {

    /* JADX INFO: renamed from: a */
    public static final fdj f68510a = new fdj();
    public static final Parcelable.Creator<fdj> CREATOR = new wcj(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fdj);
    }

    public final int hashCode() {
        return -328261745;
    }

    public final String toString() {
        return "UserLeft";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
