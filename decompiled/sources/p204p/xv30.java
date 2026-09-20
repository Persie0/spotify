package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class xv30 extends fx30 {
    public static final Parcelable.Creator<xv30> CREATOR = new mz20(26);

    /* JADX INFO: renamed from: c */
    public final boolean f266261c;

    /* JADX INFO: renamed from: d */
    public final boolean f266262d;

    public xv30(boolean z, boolean z2) {
        super(9, 1);
        this.f266261c = z;
        this.f266262d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv30)) {
            return false;
        }
        xv30 xv30Var = (xv30) obj;
        return this.f266261c == xv30Var.f266261c && this.f266262d == xv30Var.f266262d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266262d) + (Boolean.hashCode(this.f266261c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f266261c ? 1 : 0);
        parcel.writeInt(this.f266262d ? 1 : 0);
    }
}
