package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class dlc implements glc {

    /* JADX INFO: renamed from: a */
    public static final dlc f50180a = new dlc();
    public static final Parcelable.Creator<dlc> CREATOR = new a5c(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dlc);
    }

    public final int hashCode() {
        return -1314971023;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
