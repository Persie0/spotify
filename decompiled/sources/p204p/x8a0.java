package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class x8a0 implements caa0 {
    public static final Parcelable.Creator<x8a0> CREATOR = new ra90(29);

    /* JADX INFO: renamed from: a */
    public final xkx0 f259099a;

    public x8a0(xkx0 xkx0Var) {
        this.f259099a = xkx0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8a0) && wj50.m88271j(this.f259099a, ((x8a0) obj).f259099a);
    }

    public final int hashCode() {
        return this.f259099a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f259099a, i);
    }
}
