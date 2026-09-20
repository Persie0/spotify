package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class d01 extends z01 {
    public static final Parcelable.Creator<d01> CREATOR = new zz0(3);

    /* JADX INFO: renamed from: a */
    public final int f43692a;

    /* JADX INFO: renamed from: b */
    public final int f43693b;

    public d01(int i, int i2) {
        this.f43692a = i;
        this.f43693b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d01)) {
            return false;
        }
        d01 d01Var = (d01) obj;
        return this.f43692a == d01Var.f43692a && this.f43693b == d01Var.f43693b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f43693b) + (edb.m38547C(this.f43692a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(fr0.m42451B(this.f43692a));
        parcel.writeString(fr0.m42482z(this.f43693b));
    }
}
