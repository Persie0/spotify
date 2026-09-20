package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ryv extends tyv {

    /* JADX INFO: renamed from: b */
    public static final ryv f203973b = new ryv("memberDetails");
    public static final Parcelable.Creator<ryv> CREATOR = new bwv(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ryv);
    }

    public final int hashCode() {
        return -2100175729;
    }

    public final String toString() {
        return "MemberDetails";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
