package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ehy implements ghy {

    /* JADX INFO: renamed from: a */
    public static final ehy f59751a = new ehy();
    public static final Parcelable.Creator<ehy> CREATOR = new p7y(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ehy);
    }

    public final int hashCode() {
        return -1829438770;
    }

    public final String toString() {
        return "Following";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
