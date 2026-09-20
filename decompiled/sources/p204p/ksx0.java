package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ksx0 extends nsx0 {

    /* JADX INFO: renamed from: a */
    public static final ksx0 f126068a = new ksx0();
    public static final Parcelable.Creator<ksx0> CREATOR = new csx0(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ksx0);
    }

    public final int hashCode() {
        return 220791220;
    }

    public final String toString() {
        return "ContextNotSupported";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
