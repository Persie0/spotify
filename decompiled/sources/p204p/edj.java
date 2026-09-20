package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class edj implements hdj {

    /* JADX INFO: renamed from: a */
    public static final edj f58528a = new edj();
    public static final Parcelable.Creator<edj> CREATOR = new wcj(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof edj);
    }

    public final int hashCode() {
        return -1974860591;
    }

    public final String toString() {
        return "UserJoined";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
