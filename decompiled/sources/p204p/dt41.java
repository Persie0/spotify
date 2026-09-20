package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dt41 implements ou41 {

    /* JADX INFO: renamed from: a */
    public static final dt41 f52726a = new dt41();
    public static final Parcelable.Creator<dt41> CREATOR = new tj41(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dt41);
    }

    public final int hashCode() {
        return -1946900664;
    }

    public final String toString() {
        return "InviteLinkFailedAfterAgeAssuranceCompleted";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
