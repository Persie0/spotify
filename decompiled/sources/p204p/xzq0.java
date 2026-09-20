package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class xzq0 extends yzq0 {
    public static final Parcelable.Creator<xzq0> CREATOR = new vzq0(1);

    /* JADX INFO: renamed from: b */
    public final int f267735b;

    /* JADX INFO: renamed from: c */
    public final boolean f267736c;

    /* JADX INFO: renamed from: d */
    public final nz4 f267737d;

    public xzq0(int i, boolean z, nz4 nz4Var) {
        super(z);
        this.f267735b = i;
        this.f267736c = z;
        this.f267737d = nz4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzq0)) {
            return false;
        }
        xzq0 xzq0Var = (xzq0) obj;
        return this.f267735b == xzq0Var.f267735b && this.f267736c == xzq0Var.f267736c && wj50.m88271j(this.f267737d, xzq0Var.f267737d);
    }

    public final int hashCode() {
        return this.f267737d.hashCode() + s571.m77245d(edb.m38547C(this.f267735b) * 31, 31, this.f267736c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(m5p0.m60878j(this.f267735b));
        parcel.writeInt(this.f267736c ? 1 : 0);
        parcel.writeParcelable(this.f267737d, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xzq0(int i, boolean z, int i2) {
        nz4 nz4Var;
        z = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            nz4Var = lz4.f138257c;
        } else {
            nz4Var = kz4.f128008c;
        }
        this(i, z, nz4Var);
    }
}
