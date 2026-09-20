package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class guu extends wwu {
    public static final Parcelable.Creator<guu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final guu f84544c;

    /* JADX INFO: renamed from: d */
    public static final int f84545d;

    static {
        sd40 sd40VarM75321b = vsf1.f244432d;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Queue16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            sep sepVar = new sep(3, false);
            sepVar.m77945s(15.0f, 15.0f);
            sepVar.m77943q(1.0f, 15.0f);
            sepVar.m77927D(-1.5f);
            yds.m93492v(sepVar, 14.0f, 15.0f, 10.5f);
            sepVar.m77943q(1.0f, 10.5f);
            yds.m93489s(sepVar, 1.0f, 9.0f, 14.0f);
            sepVar.m77945s(1.0f, 3.5f);
            sepVar.m77932f(2.5f, 2.5f, false, true, 3.5f, 1.0f);
            sepVar.m77942p(9.0f);
            sepVar.m77933g(2.5f, 2.5f, false, true, 0.0f, 5.0f);
            sepVar.m77942p(-9.0f);
            sepVar.m77932f(2.5f, 2.5f, false, true, 1.0f, 3.5f);
            sepVar.m77946t(2.5f, -1.0f);
            sepVar.m77933g(1.0f, 1.0f, false, false, 0.0f, 2.0f);
            sepVar.m77942p(9.0f);
            sepVar.m77933g(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            sepVar.m77937k();
            rd40.m75320a(rd40Var, sepVar.f208338a, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            vsf1.f244432d = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = zsf1.f285939b;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Queue24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            sep sepVar2 = new sep(3, false);
            sepVar2.m77945s(21.0f, 22.0f);
            sepVar2.m77943q(3.0f, 22.0f);
            sepVar2.m77927D(-2.0f);
            yds.m93492v(sepVar2, 18.0f, 21.0f, 16.0f);
            yds.m93464A(sepVar2, 3.0f, 16.0f, -2.0f, 18.0f);
            sepVar2.m77945s(2.05f, 6.546f);
            sepVar2.m77933g(3.5f, 3.5f, false, true, 3.5f, -3.5f);
            sepVar2.m77942p(13.0f);
            sepVar2.m77933g(3.5f, 3.5f, false, true, 0.0f, 7.0f);
            sepVar2.m77942p(-13.0f);
            sepVar2.m77933g(3.5f, 3.5f, false, true, -3.5f, -3.5f);
            sepVar2.m77946t(3.5f, -1.5f);
            sepVar2.m77933g(1.5f, 1.5f, false, false, 0.0f, 3.0f);
            sepVar2.m77942p(13.0f);
            sepVar2.m77933g(1.5f, 1.5f, false, false, 0.0f, -3.0f);
            sepVar2.m77937k();
            rd40.m75320a(rd40Var2, sepVar2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            zsf1.f285939b = sd40VarM75321b2;
        }
        f84544c = new guu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f84545d = 8;
        CREATOR = new ftu(25);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof guu);
    }

    public final int hashCode() {
        return -1475360548;
    }

    public final String toString() {
        return "Queue";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
