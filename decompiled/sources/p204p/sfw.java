package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class sfw implements agw {

    /* JADX INFO: renamed from: a */
    public static final sfw f208650a = new sfw();
    public static final Parcelable.Creator<sfw> CREATOR = new bwv(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sfw);
    }

    public final int hashCode() {
        return -1400319259;
    }

    public final String toString() {
        return "MembersLimitExceeded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
