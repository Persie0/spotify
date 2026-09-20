package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class w011 extends x011 {

    /* JADX INFO: renamed from: a */
    public static final w011 f246617a = new w011();
    public static final Parcelable.Creator<w011> CREATOR = new bv01(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w011);
    }

    public final int hashCode() {
        return 901320809;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
