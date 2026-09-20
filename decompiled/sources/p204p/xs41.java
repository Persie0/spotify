package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class xs41 extends yu41 {

    /* JADX INFO: renamed from: a */
    public static final xs41 f265485a = new xs41();
    public static final Parcelable.Creator<xs41> CREATOR = new tj41(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xs41);
    }

    public final int hashCode() {
        return 1051379455;
    }

    public final String toString() {
        return "Initialized";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
