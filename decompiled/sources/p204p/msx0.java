package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class msx0 extends nsx0 {

    /* JADX INFO: renamed from: a */
    public static final msx0 f146876a = new msx0();
    public static final Parcelable.Creator<msx0> CREATOR = new csx0(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof msx0);
    }

    public final int hashCode() {
        return 1136849707;
    }

    public final String toString() {
        return "RemoteDownloadsDisabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
