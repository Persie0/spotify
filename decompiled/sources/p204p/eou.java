package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class eou extends wwu {
    public static final Parcelable.Creator<eou> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final eou f61476c;

    /* JADX INFO: renamed from: d */
    public static final int f61477d;

    static {
        sd40 sd40VarM75321b = ndg1.f152775b;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.ChartDown16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new ocn0(14.0f, 6.0f));
            arrayList.add(new ncn0(-6.0f, 6.0f));
            arrayList.add(new ncn0(-6.0f, -6.0f));
            arrayList.add(ccn0.f36584c);
            rd40.m75320a(rd40Var, arrayList, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            ndg1.f152775b = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = wdg1.f250283b;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.ChartDown24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new ocn0(19.0f, 9.0f));
            arrayList2.add(new ncn0(-7.0f, 7.0f));
            arrayList2.add(new ncn0(-7.0f, -7.0f));
            arrayList2.add(ccn0.f36584c);
            rd40.m75320a(rd40Var2, arrayList2, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            wdg1.f250283b = sd40VarM75321b2;
        }
        f61476c = new eou(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f61477d = 8;
        CREATOR = new enu(25);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eou);
    }

    public final int hashCode() {
        return -585686037;
    }

    public final String toString() {
        return "ChartDown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
