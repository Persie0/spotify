package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class f0s0 extends o0s0 {

    /* JADX INFO: renamed from: a */
    public static final f0s0 f64712a = new f0s0();
    public static final Parcelable.Creator<f0s0> CREATOR = new uir0(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f0s0);
    }

    public final int hashCode() {
        return 1844527102;
    }

    public final String toString() {
        return "BLOCKED";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
