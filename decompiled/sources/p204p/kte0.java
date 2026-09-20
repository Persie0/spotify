package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class kte0 implements pte0 {

    /* JADX INFO: renamed from: a */
    public static final kte0 f126252a = new kte0();
    public static final Parcelable.Creator<kte0> CREATOR = new ube0(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kte0);
    }

    public final int hashCode() {
        return 1184834313;
    }

    public final String toString() {
        return "BottomSheet";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
