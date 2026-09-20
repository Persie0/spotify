package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cx30 extends fx30 {

    /* JADX INFO: renamed from: c */
    public static final cx30 f42895c = new cx30(19, 2);
    public static final Parcelable.Creator<cx30> CREATOR = new bw30(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cx30);
    }

    public final int hashCode() {
        return 1686199172;
    }

    public final String toString() {
        return "StartJamError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
