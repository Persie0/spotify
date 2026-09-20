package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class xpu extends wwu {
    public static final Parcelable.Creator<xpu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final xpu f264726c;

    /* JADX INFO: renamed from: d */
    public static final int f264727d;

    static {
        sd40 sd40VarM75321b = qqg1.f191597a;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Email16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            sep sepVar = new sep(3, false);
            sepVar.m77945s(0.0f, 2.0f);
            sepVar.m77942p(16.0f);
            sepVar.m77927D(13.0f);
            yds.m93494x(sepVar, 0.0f, 15.0f, 1.5f, 4.567f);
            sepVar.m77943q(8.0f, 8.32f);
            sepVar.m77944r(6.5f, -3.753f);
            yds.m93489s(sepVar, 14.5f, 3.5f, -13.0f);
            sepVar.m77945s(14.5f, 6.299f);
            sepVar.m77943q(8.0f, 10.052f);
            sepVar.m77943q(1.5f, 6.299f);
            yds.m93489s(sepVar, 1.5f, 13.5f, 13.0f);
            rd40.m75320a(rd40Var, sepVar.f208338a, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            qqg1.f191597a = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = rqg1.f201832a;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Email24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            sep sepVar2 = new sep(3, false);
            sepVar2.m77945s(1.0f, 3.0f);
            sepVar2.m77942p(22.0f);
            sepVar2.m77927D(18.0f);
            yds.m93494x(sepVar2, 1.0f, 21.0f, 3.0f, 5.0f);
            sepVar2.m77927D(1.711f);
            sepVar2.m77944r(9.0f, 5.197f);
            sepVar2.m77944r(9.0f, -5.197f);
            sepVar2.m77943q(21.0f, 5.0f);
            sepVar2.m77937k();
            sepVar2.m77945s(21.0f, 9.02f);
            sepVar2.m77943q(12.0f, 14.217f);
            sepVar2.m77943q(3.0f, 9.02f);
            yds.m93489s(sepVar2, 3.0f, 19.0f, 18.0f);
            rd40.m75320a(rd40Var2, sepVar2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            rqg1.f201832a = sd40VarM75321b2;
        }
        f264726c = new xpu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f264727d = 8;
        CREATOR = new opu(7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xpu);
    }

    public final int hashCode() {
        return -1486685337;
    }

    public final String toString() {
        return "Email";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
