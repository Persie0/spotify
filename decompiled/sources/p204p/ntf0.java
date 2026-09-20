package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ntf0 implements ptf0 {

    /* JADX INFO: renamed from: a */
    public static final ntf0 f158060a = new ntf0();
    public static final Parcelable.Creator<ntf0> CREATOR = new r4f0(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ntf0);
    }

    public final int hashCode() {
        return 281449181;
    }

    public final String toString() {
        return "Always";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
