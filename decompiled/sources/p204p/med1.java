package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class med1 extends AbstractC2206o9 {

    /* JADX INFO: renamed from: a */
    public static final med1 f142685a = new med1();
    public static final Parcelable.Creator<med1> CREATOR = new vmc1(28);

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof med1);
    }

    public final int hashCode() {
        return 446599921;
    }

    public final String toString() {
        return "RoyaltyReportingDisabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
