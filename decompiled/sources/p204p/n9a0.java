package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class n9a0 implements aaa0 {

    /* JADX INFO: renamed from: a */
    public static final n9a0 f151762a = new n9a0();
    public static final Parcelable.Creator<n9a0> CREATOR = new z8a0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n9a0);
    }

    public final int hashCode() {
        return -1926981091;
    }

    public final String toString() {
        return "Loaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
