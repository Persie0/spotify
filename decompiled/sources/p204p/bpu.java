package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class bpu extends wwu {
    public static final Parcelable.Creator<bpu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final bpu f29605c;

    /* JADX INFO: renamed from: d */
    public static final int f29606d;

    static {
        sd40 sd40VarM75321b = ekg1.f60447a;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Delete16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            sep sepVarM93486p = yds.m93486p(5.25f, 3.0f, -0.917f);
            sepVarM93486p.m77938l(5.25f, 0.933f, 6.183f, 0.0f, 7.333f, 0.0f);
            sepVarM93486p.m77942p(1.334f);
            sepVarM93486p.m77939m(1.15f, 0.0f, 2.083f, 0.933f, 2.083f, 2.083f);
            yds.m93466C(sepVarM93486p, 10.75f, 3.0f, 4.75f, 1.5f);
            sepVarM93486p.m77942p(-0.972f);
            sepVarM93486p.m77944r(-1.257f, 9.544f);
            sepVarM93486p.m77932f(2.25f, 2.25f, false, true, 11.041f, 16.0f);
            sepVarM93486p.m77943q(4.96f, 16.0f);
            sepVarM93486p.m77933g(2.25f, 2.25f, false, true, -2.23f, -1.956f);
            sepVarM93486p.m77943q(1.472f, 4.5f);
            tfe.m80658p(sepVarM93486p, 0.5f, 4.5f, 0.5f, 3.0f);
            sepVarM93486p.m77945s(6.75f, 2.083f);
            yds.m93466C(sepVarM93486p, 6.75f, 3.0f, 2.5f, -0.917f);
            sepVarM93486p.m77933g(0.583f, 0.583f, false, false, -0.583f, -0.583f);
            sepVarM93486p.m77943q(7.333f, 1.5f);
            sepVarM93486p.m77933g(0.583f, 0.583f, false, false, -0.583f, 0.583f);
            sepVarM93486p.m77945s(2.986f, 4.5f);
            sepVarM93486p.m77944r(1.23f, 9.348f);
            sepVarM93486p.m77933g(0.75f, 0.75f, false, false, 0.744f, 0.652f);
            sepVarM93486p.m77942p(6.08f);
            sepVarM93486p.m77933g(0.75f, 0.75f, false, false, 0.744f, -0.652f);
            tfe.m80658p(sepVarM93486p, 13.015f, 4.5f, 2.985f, 4.5f);
            rd40.m75320a(rd40Var, sepVarM93486p.f208338a, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            ekg1.f60447a = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = hkg1.f92440a;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Delete24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            sep sepVarM80654l = tfe.m80654l(8.0f, 4.0f, 8.0f, 3.0f);
            sepVarM80654l.m77933g(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            sepVarM80654l.m77942p(2.0f);
            sepVarM80654l.m77933g(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            sepVarM80654l.m77927D(1.0f);
            sepVarM80654l.m77942p(6.0f);
            sepVarM80654l.m77927D(2.0f);
            sepVarM80654l.m77942p(-0.956f);
            sepVarM80654l.m77944r(-1.878f, 14.261f);
            sepVarM80654l.m77932f(2.0f, 2.0f, false, true, 17.183f, 22.0f);
            sepVarM80654l.m77943q(6.817f, 22.0f);
            sepVarM80654l.m77933g(2.0f, 2.0f, false, true, -1.983f, -1.739f);
            sepVarM80654l.m77943q(2.956f, 6.0f);
            tfe.m80658p(sepVarM80654l, 2.0f, 6.0f, 2.0f, 4.0f);
            sepVarM80654l.m77945s(10.0f, 3.0f);
            sepVarM80654l.m77927D(1.0f);
            sepVarM80654l.m77942p(4.0f);
            sepVarM80654l.m77943q(14.0f, 3.0f);
            sepVarM80654l.m77933g(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            sepVarM80654l.m77942p(-2.0f);
            sepVarM80654l.m77933g(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            sepVarM80654l.m77945s(4.974f, 6.0f);
            sepVarM80654l.m77944r(1.843f, 14.0f);
            sepVarM80654l.m77942p(10.366f);
            sepVarM80654l.m77944r(1.843f, -14.0f);
            sepVarM80654l.m77937k();
            rd40.m75320a(rd40Var2, sepVarM80654l.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            hkg1.f92440a = sd40VarM75321b2;
        }
        f29605c = new bpu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f29606d = 8;
        CREATOR = new jou(17);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bpu);
    }

    public final int hashCode() {
        return 1121701696;
    }

    public final String toString() {
        return "Delete";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
