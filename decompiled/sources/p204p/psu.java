package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class psu extends wwu {
    public static final Parcelable.Creator<psu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final psu f180961c;

    /* JADX INFO: renamed from: d */
    public static final int f180962d;

    static {
        sd40 sd40VarM75321b = opo.f167973b;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Play16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new gcn0(3.0f, 1.713f));
            arrayList.add(new kcn0(0.7f, 0.7f, 0.0f, false, true, 1.05f, -0.607f));
            arrayList.add(new ncn0(10.89f, 6.288f));
            arrayList.add(new kcn0(0.7f, 0.7f, 0.0f, false, true, 0.0f, 1.212f));
            arrayList.add(new fcn0(4.05f, 14.894f));
            arrayList.add(new bcn0(0.7f, 0.7f, 0.0f, false, true, 3.0f, 14.288f));
            arrayList.add(ccn0.f36584c);
            rd40.m75320a(rd40Var, arrayList, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            opo.f167973b = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = cct.f36614b;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Play24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new ocn0(7.05f, 3.606f));
            arrayList2.add(new ncn0(13.49f, 7.788f));
            arrayList2.add(new kcn0(0.7f, 0.7f, 0.0f, false, true, 0.0f, 1.212f));
            arrayList2.add(new fcn0(7.05f, 20.394f));
            arrayList2.add(new bcn0(0.7f, 0.7f, 0.0f, false, true, 6.0f, 19.788f));
            arrayList2.add(new tcn0(4.212f));
            arrayList2.add(new kcn0(0.7f, 0.7f, 0.0f, false, true, 1.05f, -0.606f));
            rd40.m75320a(rd40Var2, arrayList2, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            cct.f36614b = sd40VarM75321b2;
        }
        f180961c = new psu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f180962d = 8;
        CREATOR = new asu(14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof psu);
    }

    public final int hashCode() {
        return -47630839;
    }

    public final String toString() {
        return "Play";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
