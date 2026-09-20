package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class l0s0 extends o0s0 {
    public static final Parcelable.Creator<l0s0> CREATOR = new uir0(22);

    /* JADX INFO: renamed from: a */
    public final int f128502a;

    public l0s0(int i) {
        this.f128502a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0s0) && this.f128502a == ((l0s0) obj).f128502a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f128502a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(o7t0.m66398l(this.f128502a));
    }
}
