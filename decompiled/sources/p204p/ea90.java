package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ea90 implements na90 {

    /* JADX INFO: renamed from: a */
    public static final ea90 f57605a = new ea90();
    public static final Parcelable.Creator<ea90> CREATOR = new x390(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ea90);
    }

    public final int hashCode() {
        return -1899135261;
    }

    public final String toString() {
        return "AddFriends";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
