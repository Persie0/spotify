package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ytu extends wwu {
    public static final Parcelable.Creator<ytu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final ytu f276219c;

    /* JADX INFO: renamed from: d */
    public static final int f276220d;

    static {
        sd40 sd40VarM75321b = jjf1.f113038c;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Playlist16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            sep sepVar = new sep(3, false);
            sepVar.m77945s(4.0f, 1.0f);
            sepVar.m77942p(11.0f);
            sepVar.m77927D(11.75f);
            sepVar.m77932f(2.75f, 2.75f, true, true, 12.25f, 10.0f);
            yds.m93493w(sepVar, 1.25f, 13.5f, 2.5f, -8.0f);
            sepVar.m77927D(10.25f);
            sepVar.m77932f(2.75f, 2.75f, true, true, 2.75f, 10.0f);
            yds.m93494x(sepVar, 4.0f, 10.0f, 4.0f, 11.5f);
            sepVar.m77943q(2.75f, 11.5f);
            sepVar.m77932f(1.25f, 1.25f, true, false, 4.0f, 12.75f);
            sepVar.m77937k();
            sepVar.m77945s(13.5f, 11.5f);
            sepVar.m77942p(-1.25f);
            sepVar.m77933g(1.25f, 1.25f, true, false, 1.25f, 1.25f);
            sepVar.m77937k();
            rd40.m75320a(rd40Var, sepVar.f208338a, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            jjf1.f113038c = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = ljf1.f134083c;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Playlist24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            sep sepVar2 = new sep(3, false);
            sepVar2.m77945s(6.0f, 3.0f);
            sepVar2.m77942p(15.0f);
            sepVar2.m77927D(15.167f);
            sepVar2.m77933g(3.5f, 3.5f, true, true, -3.5f, -3.5f);
            sepVar2.m77943q(19.0f, 14.667f);
            sepVar2.m77943q(19.0f, 5.0f);
            sepVar2.m77943q(8.0f, 5.0f);
            sepVar2.m77927D(13.167f);
            sepVar2.m77933g(3.5f, 3.5f, true, true, -3.5f, -3.5f);
            yds.m93494x(sepVar2, 6.0f, 14.667f, 6.0f, 16.667f);
            sepVar2.m77943q(4.5f, 16.667f);
            sepVar2.m77933g(1.5f, 1.5f, true, false, 1.5f, 1.5f);
            sepVar2.m77937k();
            sepVar2.m77945s(19.0f, 16.667f);
            sepVar2.m77942p(-1.5f);
            sepVar2.m77933g(1.5f, 1.5f, true, false, 1.5f, 1.5f);
            sepVar2.m77937k();
            rd40.m75320a(rd40Var2, sepVar2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            ljf1.f134083c = sd40VarM75321b2;
        }
        f276219c = new ytu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f276220d = 8;
        CREATOR = new ftu(18);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ytu);
    }

    public final int hashCode() {
        return 978303527;
    }

    public final String toString() {
        return "Playlist";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
