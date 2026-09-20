package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class kpu extends wwu {
    public static final Parcelable.Creator<kpu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final kpu f125126c;

    /* JADX INFO: renamed from: d */
    public static final int f125127d;

    static {
        sd40 sd40VarM75321b = lmg1.f134968a;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.DeviceSpeaker16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            long j = n6f.f150862b;
            pk31 pk31Var = new pk31(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new gcn0(8.0f, 6.438f));
            arrayList.add(new lcn0(0.552f, 0.0f, 1.0f, -0.434f, 1.0f, -0.969f));
            arrayList.add(new icn0(8.552f, 4.5f, 8.0f, 4.5f));
            arrayList.add(new qcn0(-1.0f, 0.434f, -1.0f, 0.969f));
            arrayList.add(new qcn0(0.448f, 0.969f, 1.0f, 0.969f));
            arrayList.add(new ocn0(0.0f, 6.312f));
            arrayList.add(new kcn0(2.25f, 2.25f, 0.0f, true, false, 0.0f, -4.5f));
            arrayList.add(new kcn0(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.5f));
            rd40.m75320a(rd40Var, arrayList, pk31Var, 1.0f, 2, 1.0f);
            pk31 pk31Var2 = new pk31(j);
            sep sepVarM62656j = mrx0.m62656j(2.002f, 2.75f);
            sepVarM62656j.m77939m(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f);
            sepVarM62656j.m77942p(8.5f);
            sepVarM62656j.m77939m(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f);
            sepVarM62656j.m77927D(11.5f);
            sepVarM62656j.m77933g(1.75f, 1.75f, false, true, -1.75f, 1.75f);
            sepVarM62656j.m77942p(-8.5f);
            sepVarM62656j.m77933g(1.75f, 1.75f, false, true, -1.75f, -1.75f);
            sepVarM62656j.m77937k();
            sepVarM62656j.m77945s(3.752f, 2.5f);
            sepVarM62656j.m77933g(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            sepVarM62656j.m77927D(11.5f);
            sepVarM62656j.m77939m(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            sepVarM62656j.m77942p(8.5f);
            sepVarM62656j.m77933g(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            sepVarM62656j.m77943q(12.502f, 2.75f);
            sepVarM62656j.m77933g(0.25f, 0.25f, false, false, -0.25f, -0.25f);
            sepVarM62656j.m77937k();
            rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            lmg1.f134968a = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = pmg1.f179068a;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.DeviceSpeaker24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            long j2 = n6f.f150862b;
            pk31 pk31Var3 = new pk31(j2);
            sep sepVarM62656j2 = mrx0.m62656j(5.0f, 19.0f);
            sepVarM62656j2.m77933g(3.0f, 3.0f, false, false, 3.0f, 3.0f);
            sepVarM62656j2.m77942p(8.0f);
            sepVarM62656j2.m77933g(3.0f, 3.0f, false, false, 3.0f, -3.0f);
            sepVarM62656j2.m77943q(19.0f, 5.0f);
            sepVarM62656j2.m77933g(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            sepVarM62656j2.m77943q(8.0f, 2.0f);
            sepVarM62656j2.m77933g(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            sepVarM62656j2.m77937k();
            sepVarM62656j2.m77945s(8.0f, 20.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            sepVarM62656j2.m77943q(7.0f, 5.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            sepVarM62656j2.m77942p(8.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            sepVarM62656j2.m77927D(14.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            sepVarM62656j2.m77937k();
            rd40.m75320a(rd40Var2, sepVarM62656j2.f208338a, pk31Var3, 1.0f, 2, 1.0f);
            pk31 pk31Var4 = new pk31(j2);
            sep sepVarM62656j3 = mrx0.m62656j(13.25f, 7.25f);
            sepVarM62656j3.m77933g(1.25f, 1.25f, true, false, -2.5f, 0.0f);
            sepVarM62656j3.m77933g(1.25f, 1.25f, false, false, 2.5f, 0.0f);
            sepVarM62656j3.m77945s(12.0f, 16.0f);
            sepVarM62656j3.m77933g(1.5f, 1.5f, true, true, 0.0f, -3.0f);
            sepVarM62656j3.m77933g(1.5f, 1.5f, false, true, 0.0f, 3.0f);
            sepVarM62656j3.m77946t(-3.5f, -1.5f);
            sepVarM62656j3.m77933g(3.5f, 3.5f, true, false, 7.0f, 0.0f);
            sepVarM62656j3.m77933g(3.5f, 3.5f, false, false, -7.0f, 0.0f);
            rd40.m75320a(rd40Var2, sepVarM62656j3.f208338a, pk31Var4, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            pmg1.f179068a = sd40VarM75321b2;
        }
        f125126c = new kpu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f125127d = 8;
        CREATOR = new jou(26);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kpu);
    }

    public final int hashCode() {
        return -1587355244;
    }

    public final String toString() {
        return "DeviceSpeaker";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
