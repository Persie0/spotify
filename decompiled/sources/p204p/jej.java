package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class jej implements lej {

    /* JADX INFO: renamed from: a */
    public static final jej f111608a = new jej();
    public static final Parcelable.Creator<jej> CREATOR = new wcj(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jej);
    }

    public final int hashCode() {
        return 1374960389;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
