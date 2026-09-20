package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class os41 extends yu41 {

    /* JADX INFO: renamed from: a */
    public static final os41 f168744a = new os41();
    public static final Parcelable.Creator<os41> CREATOR = new tj41(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof os41);
    }

    public final int hashCode() {
        return 106134516;
    }

    public final String toString() {
        return "AppUpdateRequired";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
