package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class xcj implements hdj {

    /* JADX INFO: renamed from: a */
    public static final xcj f260243a = new xcj();
    public static final Parcelable.Creator<xcj> CREATOR = new wcj(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xcj);
    }

    public final int hashCode() {
        return -654335437;
    }

    public final String toString() {
        return "ChatCreated";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
