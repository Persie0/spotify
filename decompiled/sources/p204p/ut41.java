package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ut41 extends yu41 {

    /* JADX INFO: renamed from: a */
    public static final ut41 f233771a = new ut41();
    public static final Parcelable.Creator<ut41> CREATOR = new tj41(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ut41);
    }

    public final int hashCode() {
        return -903718454;
    }

    public final String toString() {
        return "NotAllowed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
