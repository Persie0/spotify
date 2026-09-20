package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kbl0 extends nbl0 {
    public static final Parcelable.Creator<kbl0> CREATOR = new hbl0(2);

    /* JADX INFO: renamed from: a */
    public final int f121226a;

    /* JADX INFO: renamed from: b */
    public final int f121227b;

    /* JADX INFO: renamed from: c */
    public final j3r f121228c;

    /* JADX INFO: renamed from: d */
    public final w9j0 f121229d;

    public kbl0(int i, int i2, j3r j3rVar, w9j0 w9j0Var) {
        this.f121226a = i;
        this.f121227b = i2;
        this.f121228c = j3rVar;
        this.f121229d = w9j0Var;
    }

    @Override // p204p.nbl0
    /* JADX INFO: renamed from: c */
    public final j3r mo50186c() {
        return this.f121228c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbl0)) {
            return false;
        }
        kbl0 kbl0Var = (kbl0) obj;
        return this.f121226a == kbl0Var.f121226a && this.f121227b == kbl0Var.f121227b && wj50.m88271j(this.f121228c, kbl0Var.f121228c) && wj50.m88271j(this.f121229d, kbl0Var.f121229d);
    }

    @Override // p204p.nbl0
    /* JADX INFO: renamed from: g */
    public final w9j0 mo50187g() {
        return this.f121229d;
    }

    public final int hashCode() {
        return this.f121229d.f249183a.hashCode() + ((this.f121228c.hashCode() + mt60.m62800g(this.f121227b, Integer.hashCode(this.f121226a) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121226a);
        parcel.writeInt(this.f121227b);
        parcel.writeParcelable(this.f121228c, i);
        this.f121229d.writeToParcel(parcel, i);
    }
}
