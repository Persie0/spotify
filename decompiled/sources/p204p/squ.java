package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class squ extends wwu {
    public static final Parcelable.Creator<squ> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final squ f213162c;

    /* JADX INFO: renamed from: d */
    public static final int f213163d;

    static {
        sd40 sd40VarM75321b = dwg1.f53697a;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Headphones16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            sep sepVarM62656j = mrx0.m62656j(0.0f, 8.289f);
            sepVarM62656j.m77933g(8.0f, 8.0f, true, true, 14.77f, 4.263f);
            sepVarM62656j.m77944r(-0.913f, 1.583f);
            sepVarM62656j.m77932f(2.291f, 2.291f, true, true, 9.89f, 11.84f);
            sepVarM62656j.m77944r(1.212f, -2.09f);
            sepVarM62656j.m77932f(2.31f, 2.31f, false, true, 13.1f, 8.6f);
            sepVarM62656j.m77942p(1.392f);
            sepVarM62656j.m77933g(6.5f, 6.5f, true, false, -12.985f, 0.0f);
            sepVarM62656j.m77942p(1.39f);
            sepVarM62656j.m77933g(2.31f, 2.31f, false, true, 1.999f, 1.15f);
            sepVarM62656j.m77944r(1.212f, 2.09f);
            sepVarM62656j.m77933g(2.291f, 2.291f, true, true, -3.966f, 2.295f);
            sepVarM62656j.m77944r(-0.915f, -1.585f);
            sepVarM62656j.m77932f(7.96f, 7.96f, false, true, 0.0f, 8.289f);
            sepVarM62656j.m77946t(1.755f, 1.81f);
            sepVarM62656j.m77939m(0.172f, 0.594f, 0.426f, 1.151f, 0.749f, 1.662f);
            sepVarM62656j.m77944r(0.008f, 0.013f);
            sepVarM62656j.m77944r(0.93f, 1.611f);
            sepVarM62656j.m77933g(0.791f, 0.791f, true, false, 1.37f, -0.792f);
            sepVarM62656j.m77943q(3.6f, 10.503f);
            sepVarM62656j.m77933g(0.81f, 0.81f, false, false, -0.702f, -0.403f);
            yds.m93490t(sepVarM62656j, 14.245f, 10.099f, 13.1f, 10.099f);
            sepVarM62656j.m77933g(0.81f, 0.81f, false, false, -0.7f, 0.405f);
            sepVarM62656j.m77944r(-1.213f, 2.089f);
            sepVarM62656j.m77933g(0.791f, 0.791f, true, false, 1.37f, 0.792f);
            sepVarM62656j.m77944r(0.929f, -1.61f);
            sepVarM62656j.m77944r(0.008f, -0.012f);
            sepVarM62656j.m77939m(0.324f, -0.511f, 0.578f, -1.07f, 0.75f, -1.663f);
            sepVarM62656j.m77937k();
            rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            dwg1.f53697a = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = gwg1.f85007a;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Headphones24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            sep sepVarM62656j2 = mrx0.m62656j(0.5f, 12.5f);
            sepVarM62656j2.m77938l(0.5f, 6.149f, 5.649f, 1.0f, 12.0f, 1.0f);
            sepVarM62656j2.m77950x(11.5f, 5.149f, 11.5f, 11.5f);
            sepVarM62656j2.m77933g(11.43f, 11.43f, false, true, -1.768f, 6.13f);
            sepVarM62656j2.m77944r(-1.325f, 2.294f);
            sepVarM62656j2.m77933g(3.232f, 3.232f, true, true, -5.594f, -3.238f);
            sepVarM62656j2.m77944r(1.83f, -3.155f);
            sepVarM62656j2.m77933g(3.0f, 3.0f, false, true, 2.595f, -1.494f);
            sepVarM62656j2.m77942p(2.247f);
            sepVarM62656j2.m77933g(9.5f, 9.5f, true, false, -18.97f, 0.0f);
            sepVarM62656j2.m77943q(4.76f, 13.037f);
            sepVarM62656j2.m77933g(3.0f, 3.0f, false, true, 2.595f, 1.494f);
            sepVarM62656j2.m77944r(1.831f, 3.155f);
            sepVarM62656j2.m77933g(3.232f, 3.232f, true, true, -5.594f, 3.238f);
            sepVarM62656j2.m77944r(-1.327f, -2.298f);
            sepVarM62656j2.m77932f(11.44f, 11.44f, false, true, 0.5f, 12.5f);
            sepVarM62656j2.m77946t(2.342f, 2.537f);
            sepVarM62656j2.m77939m(0.25f, 0.907f, 0.633f, 1.76f, 1.125f, 2.537f);
            sepVarM62656j2.m77944r(0.01f, 0.017f);
            sepVarM62656j2.m77944r(1.348f, 2.333f);
            sepVarM62656j2.m77933g(1.232f, 1.232f, true, false, 2.132f, -1.234f);
            sepVarM62656j2.m77944r(-1.83f, -3.155f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, false, -0.866f, -0.498f);
            sepVarM62656j2.m77937k();
            sepVarM62656j2.m77945s(21.158f, 15.037f);
            sepVarM62656j2.m77942p(-1.92f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, false, -0.864f, 0.498f);
            sepVarM62656j2.m77944r(-1.831f, 3.155f);
            sepVarM62656j2.m77933g(1.232f, 1.232f, true, false, 2.132f, 1.234f);
            sepVarM62656j2.m77944r(1.345f, -2.33f);
            sepVarM62656j2.m77944r(0.011f, -0.017f);
            sepVarM62656j2.m77933g(9.5f, 9.5f, false, false, 1.127f, -2.54f);
            rd40.m75320a(rd40Var2, sepVarM62656j2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            gwg1.f85007a = sd40VarM75321b2;
        }
        f213162c = new squ(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f213163d = 8;
        CREATOR = new opu(28);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof squ);
    }

    public final int hashCode() {
        return -452997702;
    }

    public final String toString() {
        return "Headphones";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
