package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ulc1 implements xlc1 {

    /* JADX INFO: renamed from: a */
    public static final ulc1 f231526a = new ulc1();
    public static final Parcelable.Creator<ulc1> CREATOR = new nlc1(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ulc1);
    }

    public final int hashCode() {
        return -1306868593;
    }

    public final String toString() {
        return "Dismiss";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
