package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class wt1 implements du1 {

    /* JADX INFO: renamed from: a */
    public static final wt1 f254795a = new wt1();
    public static final Parcelable.Creator<wt1> CREATOR = new g11(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wt1);
    }

    public final int hashCode() {
        return -1349886379;
    }

    public final String toString() {
        return "Default";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
