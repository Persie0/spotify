package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class spu extends wwu {
    public static final Parcelable.Creator<spu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final spu f212955c;

    /* JADX INFO: renamed from: d */
    public static final int f212956d;

    static {
        sd40 sd40VarM75321b = npg1.f156991a;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Download16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            long j = n6f.f150862b;
            pk31 pk31Var = new pk31(j);
            sep sepVarM62656j = mrx0.m62656j(4.995f, 8.745f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            sepVarM62656j.m77943q(7.25f, 9.939f);
            sepVarM62656j.m77926C(4.0f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            sepVarM62656j.m77927D(5.94f);
            sepVarM62656j.m77944r(1.195f, -1.195f);
            sepVarM62656j.m77933g(0.75f, 0.75f, true, true, 1.06f, 1.06f);
            sepVarM62656j.m77943q(8.0f, 12.811f);
            sepVarM62656j.m77944r(-0.528f, -0.528f);
            sepVarM62656j.m77944r(-0.005f, -0.005f);
            sepVarM62656j.m77944r(-2.472f, -2.473f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, 0.0f, -1.06f);
            rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
            pk31 pk31Var2 = new pk31(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new gcn0(0.0f, 8.0f));
            arrayList.add(new kcn0(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f));
            arrayList.add(new bcn0(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f));
            arrayList.add(new ocn0(8.0f, -6.5f));
            arrayList.add(new kcn0(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f));
            arrayList.add(new kcn0(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f));
            rd40.m75320a(rd40Var, arrayList, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            npg1.f156991a = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = ppg1.f180042a;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Download24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            long j2 = n6f.f150862b;
            pk31 pk31Var3 = new pk31(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new gcn0(12.0f, 3.0f));
            arrayList2.add(new kcn0(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f));
            arrayList2.add(new kcn0(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f));
            arrayList2.add(new gcn0(1.0f, 12.0f));
            arrayList2.add(new dcn0(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f));
            arrayList2.add(new qcn0(11.0f, 4.925f, 11.0f, 11.0f));
            arrayList2.add(new qcn0(-4.925f, 11.0f, -11.0f, 11.0f));
            arrayList2.add(new icn0(1.0f, 18.075f, 1.0f, 12.0f));
            rd40.m75320a(rd40Var2, arrayList2, pk31Var3, 1.0f, 2, 1.0f);
            pk31 pk31Var4 = new pk31(j2);
            sep sepVarM62656j2 = mrx0.m62656j(12.0f, 6.05f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            sepVarM62656j2.m77927D(7.486f);
            sepVarM62656j2.m77944r(1.793f, -1.793f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, true, true, 1.414f, 1.414f);
            sepVarM62656j2.m77943q(12.0f, 18.364f);
            sepVarM62656j2.m77944r(-4.207f, -4.207f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, true, true, 1.414f, -1.414f);
            sepVarM62656j2.m77943q(11.0f, 14.536f);
            sepVarM62656j2.m77926C(7.05f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            rd40.m75320a(rd40Var2, sepVarM62656j2.f208338a, pk31Var4, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            ppg1.f180042a = sd40VarM75321b2;
        }
        f212955c = new spu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f212956d = 8;
        CREATOR = new opu(2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof spu);
    }

    public final int hashCode() {
        return 526647517;
    }

    public final String toString() {
        return "Download";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
