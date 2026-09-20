package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class sru extends wwu {
    public static final Parcelable.Creator<sru> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final sru f213379c;

    /* JADX INFO: renamed from: d */
    public static final int f213380d;

    static {
        sd40 sd40VarM75321b = p3h1.f173655a;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Microphone16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            sep sepVarM62656j = mrx0.m62656j(13.426f, 2.574f);
            sepVarM62656j.m77933g(2.83f, 2.83f, false, false, -4.797f, 1.55f);
            sepVarM62656j.m77944r(3.247f, 3.247f);
            sepVarM62656j.m77933g(2.831f, 2.831f, false, false, 1.55f, -4.797f);
            sepVarM62656j.m77945s(7.881f, 5.498f);
            sepVarM62656j.m77943q(2.065f, 12.12f);
            sepVarM62656j.m77933g(1.287f, 1.287f, false, false, 1.816f, 1.816f);
            sepVarM62656j.m77944r(6.62f, -5.817f);
            sepVarM62656j.m77937k();
            sepVarM62656j.m77945s(7.12f, 4.094f);
            sepVarM62656j.m77933g(4.331f, 4.331f, true, true, 4.786f, 4.786f);
            sepVarM62656j.m77944r(-7.034f, 6.182f);
            sepVarM62656j.m77933g(2.787f, 2.787f, false, true, -3.933f, -3.933f);
            sepVarM62656j.m77937k();
            rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            p3h1.f173655a = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = r3h1.f195510a;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Microphone24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            sep sepVarM62656j2 = mrx0.m62656j(19.61f, 4.391f);
            sepVarM62656j2.m77933g(4.0f, 4.0f, false, false, -6.782f, 2.214f);
            sepVarM62656j2.m77944r(4.568f, 4.568f);
            sepVarM62656j2.m77933g(4.0f, 4.0f, false, false, 2.214f, -6.781f);
            yds.m93490t(sepVarM62656j2, 15.562f, 12.167f, 11.834f, 8.439f);
            sepVarM62656j2.m77943q(3.679f, 17.719f);
            sepVarM62656j2.m77933g(1.844f, 1.844f, false, false, 2.602f, 2.602f);
            sepVarM62656j2.m77937k();
            sepVarM62656j2.m77945s(10.817f, 6.567f);
            sepVarM62656j2.m77933g(6.0f, 6.0f, true, true, 6.617f, 6.617f);
            sepVarM62656j2.m77944r(-9.832f, 8.64f);
            sepVarM62656j2.m77933g(3.844f, 3.844f, false, true, -5.425f, -5.425f);
            sepVarM62656j2.m77937k();
            rd40.m75320a(rd40Var2, sepVarM62656j2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            r3h1.f195510a = sd40VarM75321b2;
        }
        suu suuVar = new suu(sd40VarM75321b, sd40VarM75321b2);
        sd40 sd40VarM75321b3 = u3h1.f226384a;
        if (sd40VarM75321b3 == null) {
            float f3 = 16;
            rd40 rd40Var3 = new rd40("Encore.Vector.MicrophoneActive16", f3, f3, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = c5b1.f34134a;
            pk31 pk31Var3 = new pk31(n6f.f150862b);
            sep sepVarM62656j3 = mrx0.m62656j(9.44f, 0.891f);
            sepVarM62656j3.m77933g(4.26f, 4.26f, true, true, 3.171f, 7.895f);
            sepVarM62656j3.m77944r(-5.4f, -5.4f);
            sepVarM62656j3.m77932f(4.26f, 4.26f, false, true, 9.44f, 0.891f);
            sepVarM62656j3.m77945s(6.489f, 5.492f);
            sepVarM62656j3.m77944r(-5.412f, 6.157f);
            sepVarM62656j3.m77932f(2.318f, 2.318f, false, false, 4.35f, 14.92f);
            sepVarM62656j3.m77944r(6.156f, -5.412f);
            sepVarM62656j3.m77937k();
            rd40.m75320a(rd40Var3, sepVarM62656j3.f208338a, pk31Var3, 1.0f, 2, 1.0f);
            sd40VarM75321b3 = rd40Var3.m75321b();
            u3h1.f226384a = sd40VarM75321b3;
        }
        sd40 sd40VarM75321b4 = v3h1.f236890a;
        if (sd40VarM75321b4 == null) {
            float f4 = 24;
            rd40 rd40Var4 = new rd40("Encore.Vector.MicrophoneActive24", f4, f4, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = c5b1.f34134a;
            pk31 pk31Var4 = new pk31(n6f.f150862b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new ocn0(16.537f, 13.114f));
            arrayList.add(new ncn0(-5.65f, -5.65f));
            arrayList.add(new fcn0(2.0f, 17.577f));
            arrayList.add(new bcn0(3.134f, 3.134f, 0.0f, false, false, 6.423f, 22.0f));
            ccn0 ccn0Var = ccn0.f36584c;
            arrayList.add(ccn0Var);
            arrayList.add(new gcn0(11.87f, 5.62f));
            arrayList.add(new kcn0(5.511f, 5.511f, 0.0f, true, true, 6.51f, 6.51f));
            arrayList.add(ccn0Var);
            rd40.m75320a(rd40Var4, arrayList, pk31Var4, 1.0f, 2, 1.0f);
            sd40VarM75321b4 = rd40Var4.m75321b();
            v3h1.f236890a = sd40VarM75321b4;
        }
        f213379c = new sru(suuVar, new suu(sd40VarM75321b3, sd40VarM75321b4));
        f213380d = 8;
        CREATOR = new uqu(22);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sru);
    }

    public final int hashCode() {
        return -1366093761;
    }

    public final String toString() {
        return "Microphone";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
