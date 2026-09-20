package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class mbl0 extends nbl0 {
    public static final Parcelable.Creator<mbl0> CREATOR = new hbl0(4);

    /* JADX INFO: renamed from: a */
    public final int f141943a;

    /* JADX INFO: renamed from: b */
    public final int f141944b;

    /* JADX INFO: renamed from: c */
    public final j3r f141945c;

    /* JADX INFO: renamed from: d */
    public final w9j0 f141946d;

    public mbl0(int i, int i2, j3r j3rVar, w9j0 w9j0Var) {
        this.f141943a = i;
        this.f141944b = i2;
        this.f141945c = j3rVar;
        this.f141946d = w9j0Var;
    }

    @Override // p204p.nbl0
    /* JADX INFO: renamed from: c */
    public final j3r mo50186c() {
        return this.f141945c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbl0)) {
            return false;
        }
        mbl0 mbl0Var = (mbl0) obj;
        return this.f141943a == mbl0Var.f141943a && this.f141944b == mbl0Var.f141944b && wj50.m88271j(this.f141945c, mbl0Var.f141945c) && wj50.m88271j(this.f141946d, mbl0Var.f141946d);
    }

    @Override // p204p.nbl0
    /* JADX INFO: renamed from: g */
    public final w9j0 mo50187g() {
        return this.f141946d;
    }

    public final int hashCode() {
        return this.f141946d.f249183a.hashCode() + ((this.f141945c.hashCode() + mt60.m62800g(this.f141944b, Integer.hashCode(this.f141943a) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f141943a);
        parcel.writeInt(this.f141944b);
        parcel.writeParcelable(this.f141945c, i);
        this.f141946d.writeToParcel(parcel, i);
    }
}
