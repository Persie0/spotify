package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class htx0 implements ktx0 {

    /* JADX INFO: renamed from: a */
    public static final htx0 f95208a = new htx0();
    public static final Parcelable.Creator<htx0> CREATOR = new csx0(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof htx0);
    }

    public final int hashCode() {
        return 770261708;
    }

    public final String toString() {
        return "MaxSelected";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
