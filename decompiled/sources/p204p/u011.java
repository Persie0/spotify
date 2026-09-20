package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class u011 extends x011 {

    /* JADX INFO: renamed from: a */
    public static final u011 f225348a = new u011();
    public static final Parcelable.Creator<u011> CREATOR = new bv01(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u011);
    }

    public final int hashCode() {
        return 1813571701;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
