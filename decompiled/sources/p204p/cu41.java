package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cu41 implements ou41 {

    /* JADX INFO: renamed from: a */
    public static final cu41 f42048a = new cu41();
    public static final Parcelable.Creator<cu41> CREATOR = new tj41(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cu41);
    }

    public final int hashCode() {
        return -673985694;
    }

    public final String toString() {
        return "Redirected";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
