package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ynb1 extends aob1 {

    /* JADX INFO: renamed from: a */
    public static final ynb1 f274430a = new ynb1();
    public static final Parcelable.Creator<ynb1> CREATOR = new c8b1(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ynb1);
    }

    public final int hashCode() {
        return 492312728;
    }

    public final String toString() {
        return "FILL";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
