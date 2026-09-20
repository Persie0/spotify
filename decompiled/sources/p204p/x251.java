package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class x251 implements a351 {

    /* JADX INFO: renamed from: a */
    public static final x251 f257363a = new x251();
    public static final Parcelable.Creator<x251> CREATOR = new q051(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x251);
    }

    public final int hashCode() {
        return -1647027931;
    }

    public final String toString() {
        return "Graphic";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
