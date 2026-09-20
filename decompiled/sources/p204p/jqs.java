package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class jqs implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final jqs f114969a = new jqs();
    public static final Parcelable.Creator<jqs> CREATOR = new f9s(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jqs);
    }

    public final int hashCode() {
        return 2020616790;
    }

    public final String toString() {
        return "Christmas";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
