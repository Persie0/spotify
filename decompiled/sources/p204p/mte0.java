package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class mte0 implements pte0 {

    /* JADX INFO: renamed from: a */
    public static final mte0 f147059a = new mte0();
    public static final Parcelable.Creator<mte0> CREATOR = new ube0(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mte0);
    }

    public final int hashCode() {
        return -2145757265;
    }

    public final String toString() {
        return "Promobar";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
