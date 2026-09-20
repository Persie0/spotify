package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tth0 implements auh0 {

    /* JADX INFO: renamed from: a */
    public static final tth0 f223599a = new tth0();
    public static final Parcelable.Creator<tth0> CREATOR = new xuf0(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tth0);
    }

    public final int hashCode() {
        return -20977996;
    }

    public final String toString() {
        return "Playback";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
