package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class bqu extends wwu {
    public static final Parcelable.Creator<bqu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final bqu f29881c;

    /* JADX INFO: renamed from: d */
    public static final int f29882d;

    static {
        sd40 sd40VarM75321b = grg1.f83764a;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.ExclamationCircle16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            long j = n6f.f150862b;
            pk31 pk31Var = new pk31(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new gcn0(8.0f, 1.5f));
            arrayList.add(new kcn0(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f));
            arrayList.add(new kcn0(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f));
            arrayList.add(new gcn0(0.0f, 8.0f));
            arrayList.add(new kcn0(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f));
            arrayList.add(new bcn0(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f));
            rd40.m75320a(rd40Var, arrayList, pk31Var, 1.0f, 2, 1.0f);
            pk31 pk31Var2 = new pk31(j);
            sep sepVar = new sep(3, false);
            sepVar.m77945s(7.25f, 9.0f);
            sepVar.m77943q(7.25f, 4.0f);
            sepVar.m77942p(1.5f);
            sepVar.m77927D(5.0f);
            sepVar.m77937k();
            sepVar.m77945s(7.25f, 12.026f);
            sepVar.m77927D(-1.5f);
            sepVar.m77942p(1.5f);
            sepVar.m77927D(1.5f);
            sepVar.m77937k();
            rd40.m75320a(rd40Var, sepVar.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            grg1.f83764a = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = hrg1.f94437a;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.ExclamationCircle24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            long j2 = n6f.f150862b;
            pk31 pk31Var3 = new pk31(j2);
            sep sepVar2 = new sep(3, false);
            sepVar2.m77945s(11.0f, 18.0f);
            sepVar2.m77927D(-2.0f);
            sepVar2.m77942p(2.0f);
            sepVar2.m77927D(2.0f);
            sepVar2.m77937k();
            sepVar2.m77945s(11.0f, 14.0f);
            sepVar2.m77943q(11.0f, 6.0f);
            sepVar2.m77942p(2.0f);
            sepVar2.m77927D(8.0f);
            sepVar2.m77937k();
            rd40.m75320a(rd40Var2, sepVar2.f208338a, pk31Var3, 1.0f, 2, 1.0f);
            pk31 pk31Var4 = new pk31(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new gcn0(12.0f, 3.0f));
            arrayList2.add(new kcn0(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f));
            arrayList2.add(new kcn0(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f));
            arrayList2.add(new gcn0(1.0f, 12.0f));
            arrayList2.add(new dcn0(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f));
            arrayList2.add(new qcn0(11.0f, 4.925f, 11.0f, 11.0f));
            arrayList2.add(new qcn0(-4.925f, 11.0f, -11.0f, 11.0f));
            arrayList2.add(new icn0(1.0f, 18.075f, 1.0f, 12.0f));
            rd40.m75320a(rd40Var2, arrayList2, pk31Var4, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            hrg1.f94437a = sd40VarM75321b2;
        }
        suu suuVar = new suu(sd40VarM75321b, sd40VarM75321b2);
        sd40 sd40VarM75321b3 = krg1.f125648a;
        if (sd40VarM75321b3 == null) {
            float f3 = 16;
            rd40 rd40Var3 = new rd40("Encore.Vector.ExclamationCircleActive16", f3, f3, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = c5b1.f34134a;
            pk31 pk31Var5 = new pk31(n6f.f150862b);
            sep sepVarM62656j = mrx0.m62656j(0.0f, 8.0f);
            sepVarM62656j.m77933g(8.0f, 8.0f, true, true, 16.0f, 0.0f);
            sepVarM62656j.m77932f(8.0f, 8.0f, false, true, 0.0f, 8.0f);
            sepVarM62656j.m77946t(7.25f, -5.0f);
            sepVarM62656j.m77927D(7.0f);
            sepVarM62656j.m77942p(1.5f);
            yds.m93494x(sepVarM62656j, 8.75f, 3.0f, 7.25f, 11.526f);
            sepVarM62656j.m77927D(1.5f);
            sepVarM62656j.m77942p(1.5f);
            sepVarM62656j.m77927D(-1.5f);
            sepVarM62656j.m77937k();
            rd40.m75320a(rd40Var3, sepVarM62656j.f208338a, pk31Var5, 1.0f, 2, 1.0f);
            sd40VarM75321b3 = rd40Var3.m75321b();
            krg1.f125648a = sd40VarM75321b3;
        }
        sd40 sd40VarM75321b4 = lrg1.f136313a;
        if (sd40VarM75321b4 == null) {
            float f4 = 24;
            rd40 rd40Var4 = new rd40("Encore.Vector.ExclamationCircleActive24", f4, f4, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = c5b1.f34134a;
            pk31 pk31Var6 = new pk31(n6f.f150862b);
            sep sepVarM62656j2 = mrx0.m62656j(1.0f, 12.0f);
            sepVarM62656j2.m77938l(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f);
            sepVarM62656j2.m77950x(11.0f, 4.925f, 11.0f, 11.0f);
            sepVarM62656j2.m77950x(-4.925f, 11.0f, -11.0f, 11.0f);
            sepVarM62656j2.m77949w(1.0f, 18.075f, 1.0f, 12.0f);
            sepVarM62656j2.m77946t(10.0f, 5.0f);
            sepVarM62656j2.m77927D(2.0f);
            sepVarM62656j2.m77942p(2.0f);
            sepVarM62656j2.m77927D(-2.0f);
            sepVarM62656j2.m77937k();
            sepVarM62656j2.m77945s(11.0f, 6.0f);
            sepVarM62656j2.m77927D(9.0f);
            sepVarM62656j2.m77942p(2.0f);
            sepVarM62656j2.m77943q(13.0f, 6.0f);
            sepVarM62656j2.m77937k();
            rd40.m75320a(rd40Var4, sepVarM62656j2.f208338a, pk31Var6, 1.0f, 2, 1.0f);
            sd40VarM75321b4 = rd40Var4.m75321b();
            lrg1.f136313a = sd40VarM75321b4;
        }
        f29881c = new bqu(suuVar, new suu(sd40VarM75321b3, sd40VarM75321b4));
        f29882d = 8;
        CREATOR = new opu(11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bqu);
    }

    public final int hashCode() {
        return 1307774184;
    }

    public final String toString() {
        return "ExclamationCircle";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
