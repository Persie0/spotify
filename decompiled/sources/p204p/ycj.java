package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ycj implements hdj {

    /* JADX INFO: renamed from: a */
    public static final ycj f271506a = new ycj();
    public static final Parcelable.Creator<ycj> CREATOR = new wcj(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ycj);
    }

    public final int hashCode() {
        return -2099305612;
    }

    public final String toString() {
        return "ChatNameChanged";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
