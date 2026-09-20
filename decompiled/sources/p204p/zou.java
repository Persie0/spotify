package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class zou extends wwu {
    public static final Parcelable.Creator<zou> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final zou f284873c;

    /* JADX INFO: renamed from: d */
    public static final int f284874d;

    static {
        sd40 sd40VarM75321b = wjg1.f251968a;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.CopyAlt16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            long j = n6f.f150862b;
            pk31 pk31Var = new pk31(j);
            sep sepVarM62656j = mrx0.m62656j(5.0f, 0.75f);
            sepVarM62656j.m77932f(0.75f, 0.75f, false, true, 5.75f, 0.0f);
            sepVarM62656j.m77942p(9.5f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            sepVarM62656j.m77927D(10.5f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            sepVarM62656j.m77941o(12.0f);
            sepVarM62656j.m77927D(-1.5f);
            sepVarM62656j.m77942p(2.5f);
            sepVarM62656j.m77927D(-9.0f);
            sepVarM62656j.m77942p(-8.0f);
            sepVarM62656j.m77926C(3.0f);
            sepVarM62656j.m77941o(5.0f);
            sepVarM62656j.m77937k();
            rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
            pk31 pk31Var2 = new pk31(j);
            sep sepVarM62656j2 = mrx0.m62656j(0.75f, 4.0f);
            sepVarM62656j2.m77933g(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            sepVarM62656j2.m77927D(10.5f);
            sepVarM62656j2.m77939m(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            sepVarM62656j2.m77942p(9.5f);
            sepVarM62656j2.m77933g(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            sepVarM62656j2.m77943q(11.0f, 4.75f);
            sepVarM62656j2.m77933g(0.75f, 0.75f, false, false, -0.75f, -0.75f);
            sepVarM62656j2.m77937k();
            sepVarM62656j2.m77945s(1.5f, 14.5f);
            sepVarM62656j2.m77927D(-9.0f);
            sepVarM62656j2.m77942p(8.0f);
            sepVarM62656j2.m77927D(9.0f);
            sepVarM62656j2.m77937k();
            rd40.m75320a(rd40Var, sepVarM62656j2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            wjg1.f251968a = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = yjg1.f273365a;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.CopyAlt24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            long j2 = n6f.f150862b;
            pk31 pk31Var3 = new pk31(j2);
            sep sepVarM62656j3 = mrx0.m62656j(8.0f, 2.0f);
            sepVarM62656j3.m77933g(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            sepVarM62656j3.m77942p(11.0f);
            sepVarM62656j3.m77933g(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            sepVarM62656j3.m77927D(13.0f);
            sepVarM62656j3.m77933g(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            sepVarM62656j3.m77942p(-3.0f);
            sepVarM62656j3.m77927D(-2.0f);
            sepVarM62656j3.m77942p(3.0f);
            sepVarM62656j3.m77926C(2.0f);
            sepVarM62656j3.m77941o(10.0f);
            sepVarM62656j3.m77927D(1.0f);
            sepVarM62656j3.m77941o(8.0f);
            sepVarM62656j3.m77937k();
            rd40.m75320a(rd40Var2, sepVarM62656j3.f208338a, pk31Var3, 1.0f, 2, 1.0f);
            pk31 pk31Var4 = new pk31(j2);
            sep sepVarM62656j4 = mrx0.m62656j(3.0f, 5.0f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            sepVarM62656j4.m77927D(13.0f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            sepVarM62656j4.m77942p(11.0f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, false, 2.0f, -2.0f);
            sepVarM62656j4.m77943q(16.0f, 7.0f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            sepVarM62656j4.m77937k();
            sepVarM62656j4.m77945s(3.0f, 7.0f);
            sepVarM62656j4.m77942p(11.0f);
            sepVarM62656j4.m77927D(13.0f);
            sepVarM62656j4.m77943q(3.0f, 20.0f);
            sepVarM62656j4.m77937k();
            rd40.m75320a(rd40Var2, sepVarM62656j4.f208338a, pk31Var4, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            yjg1.f273365a = sd40VarM75321b2;
        }
        f284873c = new zou(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f284874d = 8;
        CREATOR = new jou(15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zou);
    }

    public final int hashCode() {
        return -183956737;
    }

    public final String toString() {
        return "CopyAlt";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
