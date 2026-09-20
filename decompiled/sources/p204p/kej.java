package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class kej implements lej {

    /* JADX INFO: renamed from: a */
    public static final kej f121896a = new kej();
    public static final Parcelable.Creator<kej> CREATOR = new wcj(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kej);
    }

    public final int hashCode() {
        return 1220592197;
    }

    public final String toString() {
        return "Windowing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
