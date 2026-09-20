package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ibl0 extends nbl0 {
    public static final Parcelable.Creator<ibl0> CREATOR = new hbl0(0);

    /* JADX INFO: renamed from: a */
    public final int f100604a;

    /* JADX INFO: renamed from: b */
    public final int f100605b;

    /* JADX INFO: renamed from: c */
    public final j3r f100606c;

    /* JADX INFO: renamed from: d */
    public final w9j0 f100607d;

    public ibl0(int i, int i2, j3r j3rVar, w9j0 w9j0Var) {
        this.f100604a = i;
        this.f100605b = i2;
        this.f100606c = j3rVar;
        this.f100607d = w9j0Var;
    }

    @Override // p204p.nbl0
    /* JADX INFO: renamed from: c */
    public final j3r mo50186c() {
        return this.f100606c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibl0)) {
            return false;
        }
        ibl0 ibl0Var = (ibl0) obj;
        return this.f100604a == ibl0Var.f100604a && this.f100605b == ibl0Var.f100605b && wj50.m88271j(this.f100606c, ibl0Var.f100606c) && wj50.m88271j(this.f100607d, ibl0Var.f100607d);
    }

    @Override // p204p.nbl0
    /* JADX INFO: renamed from: g */
    public final w9j0 mo50187g() {
        return this.f100607d;
    }

    public final int hashCode() {
        return this.f100607d.f249183a.hashCode() + ((this.f100606c.hashCode() + mt60.m62800g(this.f100605b, Integer.hashCode(this.f100604a) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f100604a);
        parcel.writeInt(this.f100605b);
        parcel.writeParcelable(this.f100606c, i);
        this.f100607d.writeToParcel(parcel, i);
    }
}
