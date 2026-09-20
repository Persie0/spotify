package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class nk01 implements Parcelable {
    public static final Parcelable.Creator<nk01> CREATOR = new vj01(7);

    /* JADX INFO: renamed from: a */
    public final um01 f154744a;

    /* JADX INFO: renamed from: b */
    public final as01 f154745b;

    /* JADX INFO: renamed from: c */
    public final ck01 f154746c;

    /* JADX INFO: renamed from: d */
    public final boolean f154747d;

    public nk01(um01 um01Var, as01 as01Var, ck01 ck01Var, boolean z) {
        this.f154744a = um01Var;
        this.f154745b = as01Var;
        this.f154746c = ck01Var;
        this.f154747d = z;
    }

    /* JADX INFO: renamed from: c */
    public final as01 m64652c() {
        return this.f154745b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk01)) {
            return false;
        }
        nk01 nk01Var = (nk01) obj;
        return wj50.m88271j(this.f154744a, nk01Var.f154744a) && wj50.m88271j(this.f154745b, nk01Var.f154745b) && wj50.m88271j(this.f154746c, nk01Var.f154746c) && this.f154747d == nk01Var.f154747d;
    }

    public final int hashCode() {
        int iHashCode = this.f154744a.f231702a.hashCode() * 31;
        as01 as01Var = this.f154745b;
        return Boolean.hashCode(this.f154747d) + ((this.f154746c.hashCode() + ((iHashCode + (as01Var == null ? 0 : as01Var.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f154744a.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f154745b, i);
        parcel.writeParcelable(this.f154746c, i);
        parcel.writeInt(this.f154747d ? 1 : 0);
    }
}
