package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class mro0 implements sro0 {

    /* JADX INFO: renamed from: a */
    public static final mro0 f146586a = new mro0();
    public static final Parcelable.Creator<mro0> CREATOR = new igo0(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mro0);
    }

    public final int hashCode() {
        return 1476536124;
    }

    public final String toString() {
        return "Playing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
