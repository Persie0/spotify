package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class eli0 extends gli0 {
    public static final Parcelable.Creator<eli0> CREATOR = new ruh0(27);

    /* JADX INFO: renamed from: a */
    public final sr01 f60717a;

    /* JADX INFO: renamed from: b */
    public final int f60718b;

    /* JADX INFO: renamed from: c */
    public final ou31 f60719c;

    /* JADX INFO: renamed from: d */
    public final z0r f60720d;

    /* JADX INFO: renamed from: e */
    public final icr0 f60721e;

    /* JADX INFO: renamed from: f */
    public final gcr0 f60722f;

    public eli0(sr01 sr01Var, int i, ou31 ou31Var, z0r z0rVar, icr0 icr0Var, gcr0 gcr0Var) {
        this.f60717a = sr01Var;
        this.f60718b = i;
        this.f60719c = ou31Var;
        this.f60720d = z0rVar;
        this.f60721e = icr0Var;
        this.f60722f = gcr0Var;
    }

    /* JADX INFO: renamed from: k */
    public static eli0 m39391k(eli0 eli0Var, int i, z0r z0rVar, int i2) {
        sr01 sr01Var = eli0Var.f60717a;
        if ((i2 & 2) != 0) {
            i = eli0Var.f60718b;
        }
        int i3 = i;
        ou31 ou31Var = eli0Var.f60719c;
        if ((i2 & 8) != 0) {
            z0rVar = eli0Var.f60720d;
        }
        icr0 icr0Var = eli0Var.f60721e;
        gcr0 gcr0Var = eli0Var.f60722f;
        eli0Var.getClass();
        return new eli0(sr01Var, i3, ou31Var, z0rVar, icr0Var, gcr0Var);
    }

    @Override // p204p.gli0
    /* JADX INFO: renamed from: c */
    public final int mo36363c() {
        return this.f60718b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eli0)) {
            return false;
        }
        eli0 eli0Var = (eli0) obj;
        return wj50.m88271j(this.f60717a, eli0Var.f60717a) && this.f60718b == eli0Var.f60718b && wj50.m88271j(this.f60719c, eli0Var.f60719c) && wj50.m88271j(this.f60720d, eli0Var.f60720d) && wj50.m88271j(this.f60721e, eli0Var.f60721e) && wj50.m88271j(this.f60722f, eli0Var.f60722f);
    }

    @Override // p204p.gli0
    /* JADX INFO: renamed from: g */
    public final sr01 mo36364g() {
        return this.f60717a;
    }

    @Override // p204p.gli0
    /* JADX INFO: renamed from: h */
    public final z0r mo36365h() {
        return this.f60720d;
    }

    public final int hashCode() {
        int iHashCode = (this.f60719c.hashCode() + f710.m40938f(this.f60718b, this.f60717a.hashCode() * 31, 31)) * 31;
        z0r z0rVar = this.f60720d;
        int iHashCode2 = (this.f60721e.hashCode() + ((iHashCode + (z0rVar == null ? 0 : z0rVar.hashCode())) * 31)) * 31;
        gcr0 gcr0Var = this.f60722f;
        return iHashCode2 + (gcr0Var != null ? gcr0Var.hashCode() : 0);
    }

    @Override // p204p.gli0
    /* JADX INFO: renamed from: j */
    public final ou31 mo36366j() {
        return this.f60719c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f60717a, i);
        parcel.writeString(stz0.m79362p(this.f60718b));
        parcel.writeParcelable(this.f60719c, i);
        parcel.writeParcelable(this.f60721e, i);
        parcel.writeParcelable(this.f60722f, i);
    }
}
