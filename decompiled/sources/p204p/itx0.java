package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class itx0 implements ktx0 {

    /* JADX INFO: renamed from: a */
    public static final itx0 f105787a = new itx0();
    public static final Parcelable.Creator<itx0> CREATOR = new csx0(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof itx0);
    }

    public final int hashCode() {
        return 1695045496;
    }

    public final String toString() {
        return "NoSelection";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
