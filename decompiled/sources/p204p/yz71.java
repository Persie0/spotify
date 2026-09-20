package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class yz71 extends a081 {

    /* JADX INFO: renamed from: a */
    public static final yz71 f277726a = new yz71();
    public static final Parcelable.Creator<yz71> CREATOR = new sr71(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yz71);
    }

    public final int hashCode() {
        return 112342055;
    }

    public final String toString() {
        return "Disabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
