package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ic2 implements Parcelable {
    public static final Parcelable.Creator<ic2> CREATOR = new lb2(3);

    /* JADX INFO: renamed from: a */
    public final int f100707a;

    /* JADX INFO: renamed from: b */
    public final int f100708b;

    /* JADX INFO: renamed from: c */
    public final int f100709c;

    /* JADX INFO: renamed from: d */
    public final he2 f100710d;

    /* JADX INFO: renamed from: e */
    public final boolean f100711e;

    /* JADX INFO: renamed from: f */
    public final boolean f100712f;

    public ic2(int i, int i2, int i3, he2 he2Var, boolean z, boolean z2) {
        this.f100707a = i;
        this.f100708b = i2;
        this.f100709c = i3;
        this.f100710d = he2Var;
        this.f100711e = z;
        this.f100712f = z2;
    }

    /* JADX INFO: renamed from: c */
    public static ic2 m50224c(ic2 ic2Var, int i, int i2, int i3, he2 he2Var, boolean z, boolean z2, int i4) {
        if ((i4 & 1) != 0) {
            i = ic2Var.f100707a;
        }
        int i5 = i;
        if ((i4 & 2) != 0) {
            i2 = ic2Var.f100708b;
        }
        int i6 = i2;
        if ((i4 & 4) != 0) {
            i3 = ic2Var.f100709c;
        }
        int i7 = i3;
        if ((i4 & 8) != 0) {
            he2Var = ic2Var.f100710d;
        }
        he2 he2Var2 = he2Var;
        if ((i4 & 16) != 0) {
            z = ic2Var.f100711e;
        }
        boolean z3 = z;
        if ((i4 & 32) != 0) {
            z2 = ic2Var.f100712f;
        }
        ic2Var.getClass();
        return new ic2(i5, i6, i7, he2Var2, z3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic2)) {
            return false;
        }
        ic2 ic2Var = (ic2) obj;
        return this.f100707a == ic2Var.f100707a && this.f100708b == ic2Var.f100708b && this.f100709c == ic2Var.f100709c && wj50.m88271j(this.f100710d, ic2Var.f100710d) && this.f100711e == ic2Var.f100711e && this.f100712f == ic2Var.f100712f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100712f) + s571.m77245d((this.f100710d.hashCode() + mt60.m62800g(this.f100709c, mt60.m62800g(this.f100708b, Integer.hashCode(this.f100707a) * 31, 31), 31)) * 31, 31, this.f100711e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f100707a);
        parcel.writeInt(this.f100708b);
        parcel.writeInt(this.f100709c);
        parcel.writeParcelable(this.f100710d, i);
        parcel.writeInt(this.f100711e ? 1 : 0);
        parcel.writeInt(this.f100712f ? 1 : 0);
    }
}
