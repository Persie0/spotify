package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class tt41 implements ou41 {

    /* JADX INFO: renamed from: a */
    public static final tt41 f223519a = new tt41();
    public static final Parcelable.Creator<tt41> CREATOR = new tj41(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tt41);
    }

    public final int hashCode() {
        return 1603744425;
    }

    public final String toString() {
        return "NoOp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
