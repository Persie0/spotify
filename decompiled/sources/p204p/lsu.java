package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class lsu extends wwu {
    public static final Parcelable.Creator<lsu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final lsu f136611c;

    /* JADX INFO: renamed from: d */
    public static final int f136612d;

    static {
        sd40 sd40VarM75321b = rkk.f200085b;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Pause16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            sep sepVarM62656j = mrx0.m62656j(2.7f, 1.0f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            sepVarM62656j.m77927D(12.6f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            sepVarM62656j.m77942p(2.6f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            sepVarM62656j.m77943q(6.0f, 1.7f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            sepVarM62656j.m77937k();
            sepVarM62656j.m77945s(10.7f, 1.0f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            sepVarM62656j.m77927D(12.6f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            sepVarM62656j.m77942p(2.6f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            sepVarM62656j.m77943q(14.0f, 1.7f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            sepVarM62656j.m77937k();
            rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            rkk.f200085b = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = qlk.f189876b;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Pause24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            sep sepVarM62656j2 = mrx0.m62656j(5.7f, 3.0f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            sepVarM62656j2.m77927D(16.6f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            sepVarM62656j2.m77942p(2.6f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            sepVarM62656j2.m77943q(9.0f, 3.7f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            sepVarM62656j2.m77937k();
            sepVarM62656j2.m77945s(15.7f, 3.0f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            sepVarM62656j2.m77927D(16.6f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            sepVarM62656j2.m77942p(2.6f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            sepVarM62656j2.m77943q(19.0f, 3.7f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            sepVarM62656j2.m77937k();
            rd40.m75320a(rd40Var2, sepVarM62656j2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            qlk.f189876b = sd40VarM75321b2;
        }
        f136611c = new lsu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f136612d = 8;
        CREATOR = new asu(10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lsu);
    }

    public final int hashCode() {
        return -1476864575;
    }

    public final String toString() {
        return "Pause";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
