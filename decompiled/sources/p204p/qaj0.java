package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class qaj0 implements taj0 {

    /* JADX INFO: renamed from: a */
    public static final qaj0 f186892a = new qaj0();
    public static final Parcelable.Creator<qaj0> CREATOR = new rri0(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qaj0);
    }

    public final int hashCode() {
        return 1597982723;
    }

    public final String toString() {
        return "InviteSheet";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
