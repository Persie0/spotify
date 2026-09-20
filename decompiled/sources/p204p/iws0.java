package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class iws0 implements lws0 {

    /* JADX INFO: renamed from: a */
    public static final iws0 f106508a = new iws0();
    public static final Parcelable.Creator<iws0> CREATOR = new wds0(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iws0);
    }

    public final int hashCode() {
        return 404709693;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
