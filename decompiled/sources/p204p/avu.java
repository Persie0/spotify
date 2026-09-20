package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class avu extends wwu {
    public static final Parcelable.Creator<avu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final avu f20261c;

    /* JADX INFO: renamed from: d */
    public static final int f20262d;

    static {
        sd40 sd40VarM75321b = r9g1.f197060c;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.SkipForward16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            sep sepVarM62656j = mrx0.m62656j(12.7f, 1.0f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            sepVarM62656j.m77927D(5.15f);
            sepVarM62656j.m77943q(2.05f, 1.107f);
            sepVarM62656j.m77932f(0.7f, 0.7f, false, false, 1.0f, 1.712f);
            sepVarM62656j.m77927D(12.575f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, 1.05f, 0.607f);
            sepVarM62656j.m77943q(12.0f, 9.149f);
            sepVarM62656j.m77926C(14.3f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            sepVarM62656j.m77942p(1.6f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            sepVarM62656j.m77926C(1.7f);
            sepVarM62656j.m77933g(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            sepVarM62656j.m77937k();
            rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            r9g1.f197060c = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = u9g1.f228196c;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.SkipForward24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            sep sepVarM62656j2 = mrx0.m62656j(17.7f, 3.0f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            sepVarM62656j2.m77927D(6.805f);
            sepVarM62656j2.m77943q(5.05f, 3.606f);
            sepVarM62656j2.m77932f(0.7f, 0.7f, false, false, 4.0f, 4.212f);
            sepVarM62656j2.m77927D(15.576f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, 1.05f, 0.606f);
            sepVarM62656j2.m77943q(17.0f, 13.495f);
            sepVarM62656j2.m77926C(20.3f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            sepVarM62656j2.m77942p(1.6f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            sepVarM62656j2.m77926C(3.7f);
            sepVarM62656j2.m77933g(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            sepVarM62656j2.m77937k();
            rd40.m75320a(rd40Var2, sepVarM62656j2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            u9g1.f228196c = sd40VarM75321b2;
        }
        f20261c = new avu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f20262d = 8;
        CREATOR = new luu(12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof avu);
    }

    public final int hashCode() {
        return -1181592623;
    }

    public final String toString() {
        return "SkipForward";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
