package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class y300 extends a400 {

    /* JADX INFO: renamed from: b */
    public static final y300 f268720b = new y300(900);
    public static final Parcelable.Creator<y300> CREATOR = new ygz(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y300);
    }

    public final int hashCode() {
        return 381733603;
    }

    public final String toString() {
        return "High";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
