package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class rt41 extends yu41 {

    /* JADX INFO: renamed from: a */
    public static final rt41 f202491a = new rt41();
    public static final Parcelable.Creator<rt41> CREATOR = new tj41(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rt41);
    }

    public final int hashCode() {
        return 673917380;
    }

    public final String toString() {
        return "MaxChildrenReached";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
