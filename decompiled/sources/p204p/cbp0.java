package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class cbp0 implements jbp0 {

    /* JADX INFO: renamed from: a */
    public static final cbp0 f36172a = new cbp0();
    public static final Parcelable.Creator<cbp0> CREATOR = new igo0(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cbp0);
    }

    public final int hashCode() {
        return 1195873647;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
