package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tab0 implements Parcelable {
    public static final Parcelable.Creator<tab0> CREATOR = new l0b0(18);

    /* JADX INFO: renamed from: a */
    public final int f218531a;

    /* JADX INFO: renamed from: b */
    public final int f218532b;

    public tab0(int i, int i2) {
        this.f218531a = i;
        this.f218532b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tab0)) {
            return false;
        }
        tab0 tab0Var = (tab0) obj;
        return this.f218531a == tab0Var.f218531a && this.f218532b == tab0Var.f218532b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f218532b) + (Integer.hashCode(this.f218531a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f218531a);
        parcel.writeInt(this.f218532b);
    }
}
