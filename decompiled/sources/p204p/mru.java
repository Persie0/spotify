package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class mru extends wwu {
    public static final Parcelable.Creator<mru> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final mru f146615c;

    /* JADX INFO: renamed from: d */
    public static final int f146616d;

    static {
        sd40 sd40VarM75321b = w1h1.f247102a;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Locked16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            sep sepVarM62656j = mrx0.m62656j(4.0f, 4.0f);
            sepVarM62656j.m77933g(4.0f, 4.0f, true, true, 8.0f, 0.0f);
            sepVarM62656j.m77927D(3.0f);
            sepVarM62656j.m77942p(1.25f);
            sepVarM62656j.m77939m(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f);
            sepVarM62656j.m77927D(5.5f);
            sepVarM62656j.m77932f(1.75f, 1.75f, false, true, 13.25f, 16.0f);
            sepVarM62656j.m77943q(2.75f, 16.0f);
            sepVarM62656j.m77932f(1.75f, 1.75f, false, true, 1.0f, 14.25f);
            sepVarM62656j.m77927D(-5.5f);
            sepVarM62656j.m77938l(1.0f, 7.784f, 1.784f, 7.0f, 2.75f, 7.0f);
            yds.m93494x(sepVarM62656j, 4.0f, 7.0f, 5.5f, 7.0f);
            sepVarM62656j.m77942p(5.0f);
            sepVarM62656j.m77943q(10.5f, 4.0f);
            sepVarM62656j.m77933g(2.5f, 2.5f, false, false, -5.0f, 0.0f);
            sepVarM62656j.m77937k();
            sepVarM62656j.m77945s(2.75f, 8.5f);
            sepVarM62656j.m77933g(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            sepVarM62656j.m77927D(5.5f);
            sepVarM62656j.m77939m(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            sepVarM62656j.m77942p(10.5f);
            sepVarM62656j.m77933g(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            sepVarM62656j.m77927D(-5.5f);
            sepVarM62656j.m77933g(0.25f, 0.25f, false, false, -0.25f, -0.25f);
            sepVarM62656j.m77937k();
            rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            w1h1.f247102a = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = z1h1.f278317b;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Locked24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            sep sepVarM62656j2 = mrx0.m62656j(6.0f, 7.0f);
            sepVarM62656j2.m77933g(6.0f, 6.0f, true, true, 12.0f, 0.0f);
            sepVarM62656j2.m77927D(3.0f);
            sepVarM62656j2.m77942p(1.0f);
            sepVarM62656j2.m77933g(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            sepVarM62656j2.m77927D(8.0f);
            sepVarM62656j2.m77933g(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            sepVarM62656j2.m77943q(5.0f, 22.0f);
            sepVarM62656j2.m77933g(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            sepVarM62656j2.m77927D(-8.0f);
            sepVarM62656j2.m77933g(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            yds.m93495y(sepVarM62656j2, 1.0f, 8.0f, 10.0f, 8.0f);
            sepVarM62656j2.m77943q(16.0f, 7.0f);
            sepVarM62656j2.m77933g(4.0f, 4.0f, false, false, -8.0f, 0.0f);
            sepVarM62656j2.m77937k();
            sepVarM62656j2.m77945s(5.0f, 12.0f);
            sepVarM62656j2.m77927D(8.0f);
            sepVarM62656j2.m77942p(14.0f);
            sepVarM62656j2.m77927D(-8.0f);
            sepVarM62656j2.m77937k();
            rd40.m75320a(rd40Var2, sepVarM62656j2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            z1h1.f278317b = sd40VarM75321b2;
        }
        suu suuVar = new suu(sd40VarM75321b, sd40VarM75321b2);
        sd40 sd40VarM75321b3 = f2h1.f65196a;
        if (sd40VarM75321b3 == null) {
            float f3 = 16;
            rd40 rd40Var3 = new rd40("Encore.Vector.LockedActive16", f3, f3, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = c5b1.f34134a;
            pk31 pk31Var3 = new pk31(n6f.f150862b);
            sep sepVarM62656j3 = mrx0.m62656j(8.0f, 0.0f);
            sepVarM62656j3.m77933g(4.0f, 4.0f, false, false, -4.0f, 4.0f);
            sepVarM62656j3.m77927D(3.0f);
            sepVarM62656j3.m77941o(2.75f);
            sepVarM62656j3.m77932f(1.75f, 1.75f, false, false, 1.0f, 8.75f);
            sepVarM62656j3.m77927D(5.5f);
            sepVarM62656j3.m77939m(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f);
            sepVarM62656j3.m77942p(10.5f);
            sepVarM62656j3.m77932f(1.75f, 1.75f, false, false, 15.0f, 14.25f);
            sepVarM62656j3.m77927D(-5.5f);
            sepVarM62656j3.m77932f(1.75f, 1.75f, false, false, 13.25f, 7.0f);
            sepVarM62656j3.m77941o(12.0f);
            sepVarM62656j3.m77926C(4.0f);
            sepVarM62656j3.m77933g(4.0f, 4.0f, false, false, -4.0f, -4.0f);
            sepVarM62656j3.m77946t(2.5f, 4.0f);
            sepVarM62656j3.m77927D(3.0f);
            sepVarM62656j3.m77942p(-5.0f);
            sepVarM62656j3.m77926C(4.0f);
            sepVarM62656j3.m77933g(2.5f, 2.5f, false, true, 5.0f, 0.0f);
            rd40.m75320a(rd40Var3, sepVarM62656j3.f208338a, pk31Var3, 1.0f, 2, 1.0f);
            sd40VarM75321b3 = rd40Var3.m75321b();
            f2h1.f65196a = sd40VarM75321b3;
        }
        sd40 sd40VarM75321b4 = i2h1.f97845a;
        if (sd40VarM75321b4 == null) {
            float f4 = 24;
            rd40 rd40Var4 = new rd40("Encore.Vector.LockedActive24", f4, f4, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = c5b1.f34134a;
            pk31 pk31Var4 = new pk31(n6f.f150862b);
            sep sepVarM62656j4 = mrx0.m62656j(12.0f, 1.0f);
            sepVarM62656j4.m77933g(6.0f, 6.0f, false, false, -6.0f, 6.0f);
            sepVarM62656j4.m77927D(3.0f);
            sepVarM62656j4.m77941o(5.0f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            sepVarM62656j4.m77927D(8.0f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            sepVarM62656j4.m77942p(14.0f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, false, 2.0f, -2.0f);
            sepVarM62656j4.m77927D(-8.0f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            sepVarM62656j4.m77942p(-1.0f);
            sepVarM62656j4.m77926C(7.0f);
            sepVarM62656j4.m77933g(6.0f, 6.0f, false, false, -6.0f, -6.0f);
            sepVarM62656j4.m77946t(4.0f, 6.0f);
            sepVarM62656j4.m77927D(3.0f);
            sepVarM62656j4.m77941o(8.0f);
            sepVarM62656j4.m77926C(7.0f);
            sepVarM62656j4.m77933g(4.0f, 4.0f, true, true, 8.0f, 0.0f);
            rd40.m75320a(rd40Var4, sepVarM62656j4.f208338a, pk31Var4, 1.0f, 2, 1.0f);
            sd40VarM75321b4 = rd40Var4.m75321b();
            i2h1.f97845a = sd40VarM75321b4;
        }
        f146615c = new mru(suuVar, new suu(sd40VarM75321b3, sd40VarM75321b4));
        f146616d = 8;
        CREATOR = new uqu(16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mru);
    }

    public final int hashCode() {
        return 1359707295;
    }

    public final String toString() {
        return "Locked";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
