package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class w82 extends b92 {

    /* JADX INFO: renamed from: a */
    public static final w82 f248825a = new w82();
    public static final Parcelable.Creator<w82> CREATOR = new zt1(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w82);
    }

    public final int hashCode() {
        return 475244050;
    }

    public final String toString() {
        return "NotAllowed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
