package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ruu extends wwu {
    public static final Parcelable.Creator<ruu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final ruu f202910c;

    /* JADX INFO: renamed from: d */
    public static final int f202911d;

    static {
        sd40 sd40VarM75321b = nxf1.f159465c;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.ReportAbuse16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            long j = n6f.f150862b;
            pk31 pk31Var = new pk31(j);
            sep sepVar = new sep(3, false);
            sepVar.m77945s(4.069f, 0.967f);
            sepVar.m77942p(7.855f);
            sepVar.m77943q(15.98f, 8.0f);
            sepVar.m77944r(-4.057f, 7.034f);
            tfe.m80658p(sepVar, 4.069f, 15.034f, 0.01f, 8.0f);
            sepVar.m77945s(4.935f, 2.467f);
            sepVar.m77943q(1.743f, 8.0f);
            sepVar.m77944r(3.192f, 5.534f);
            sepVar.m77942p(6.122f);
            sepVar.m77943q(14.25f, 8.0f);
            sepVar.m77944r(-3.192f, -5.533f);
            sepVar.m77937k();
            rd40.m75320a(rd40Var, sepVar.f208338a, pk31Var, 1.0f, 2, 1.0f);
            pk31 pk31Var2 = new pk31(j);
            sep sepVar2 = new sep(3, false);
            sepVar2.m77945s(7.246f, 9.0f);
            sepVar2.m77943q(7.246f, 4.0f);
            sepVar2.m77942p(1.5f);
            sepVar2.m77927D(5.0f);
            sepVar2.m77937k();
            sepVar2.m77945s(7.246f, 12.025f);
            sepVar2.m77927D(-1.5f);
            sepVar2.m77942p(1.5f);
            sepVar2.m77927D(1.5f);
            sepVar2.m77937k();
            rd40.m75320a(rd40Var, sepVar2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            nxf1.f159465c = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = rxf1.f203595e;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.ReportAbuse24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            long j2 = n6f.f150862b;
            pk31 pk31Var3 = new pk31(j2);
            sep sepVar3 = new sep(3, false);
            sepVar3.m77945s(6.23f, 2.0f);
            sepVar3.m77942p(11.54f);
            sepVar3.m77944r(5.77f, 10.0f);
            sepVar3.m77944r(-5.77f, 10.0f);
            tfe.m80658p(sepVar3, 6.23f, 22.0f, 0.46f, 12.0f);
            sepVar3.m77945s(7.385f, 4.0f);
            sepVar3.m77943q(2.77f, 12.0f);
            sepVar3.m77944r(4.615f, 8.0f);
            sepVar3.m77942p(9.23f);
            yds.m93467D(sepVar3, 4.615f, -8.0f, -4.615f, -8.0f);
            rd40.m75320a(rd40Var2, sepVar3.f208338a, pk31Var3, 1.0f, 2, 1.0f);
            pk31 pk31Var4 = new pk31(j2);
            sep sepVar4 = new sep(3, false);
            sepVar4.m77945s(11.0f, 14.0f);
            sepVar4.m77943q(11.0f, 6.0f);
            sepVar4.m77942p(2.0f);
            sepVar4.m77927D(8.0f);
            sepVar4.m77937k();
            sepVar4.m77945s(11.0f, 18.0f);
            sepVar4.m77927D(-2.0f);
            sepVar4.m77942p(2.0f);
            sepVar4.m77927D(2.0f);
            sepVar4.m77937k();
            rd40.m75320a(rd40Var2, sepVar4.f208338a, pk31Var4, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            rxf1.f203595e = sd40VarM75321b2;
        }
        f202910c = new ruu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f202911d = 8;
        CREATOR = new luu(5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ruu);
    }

    public final int hashCode() {
        return 777093245;
    }

    public final String toString() {
        return "ReportAbuse";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
