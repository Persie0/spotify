package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import p000.AbstractC0000a;

/* JADX INFO: renamed from: p.kc */
/* JADX INFO: loaded from: classes8.dex */
public final class C2047kc implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121320a;

    public /* synthetic */ C2047kc(int i) {
        this.f121320a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        switch (this.f121320a) {
            case 0:
                return new C2085lc(parcel.readInt() != 0);
            case 1:
                parcel.readInt();
                return C2122mc.f141996a;
            case 2:
                return new C2159nc(parcel.readInt() != 0);
            case 3:
                return new C1893gd(parcel);
            case 4:
                return new C1856fd(parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
            case 5:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iM75732f = 0;
                while (iM75732f != i) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new C2125mf(string, string2, linkedHashMap);
            case 6:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                d0n0 d0n0Var = (d0n0) parcel.readParcelable(C2130mk.class.getClassLoader());
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                agr0 agr0Var = (agr0) parcel.readParcelable(C2130mk.class.getClassLoader());
                a370 a370Var = (a370) parcel.readParcelable(C2130mk.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM9h = 0;
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(C2130mk.class, parcel, arrayList, iM9h, 1);
                }
                return new C2130mk(string3, string4, string5, d0n0Var, string6, string7, agr0Var, a370Var, arrayList, (dlx) parcel.readParcelable(C2130mk.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), xxm0.valueOf(parcel.readString()));
            case 7:
                parcel.readInt();
                return C2167nk.f154711b;
            case 8:
                parcel.readInt();
                return C2217ok.f166194b;
            case 9:
                parcel.readInt();
                return C2259pk.f178330b;
            case 10:
                parcel.readInt();
                return C2296qk.f189394b;
            case 11:
                parcel.readInt();
                return C2341rk.f199931b;
            case 12:
                parcel.readInt();
                return C2379sk.f209961b;
            case 13:
                parcel.readInt();
                return C2418tk.f221040b;
            case 14:
                return new C2461uk((h891) parcel.readParcelable(C2461uk.class.getClassLoader()));
            case 15:
                parcel.readInt();
                return C2499vk.f242097b;
            case 16:
                parcel.readInt();
                return C2538wk.f252074b;
            case 17:
                parcel.readInt();
                return C2575xk.f262251b;
            case 18:
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                Boolean boolValueOf5 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new C2131ml(z, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5);
            case 19:
                return new C2168nl(parcel.readString(), parcel.readString());
            case 20:
                return new C2218ol(parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                return new C2462ul(parcel.readString(), (AbstractC2419tl) parcel.readParcelable(C2462ul.class.getClassLoader()));
            case 22:
                return new C2260pl(parcel.readString());
            case 23:
                return new C2297ql(parcel.readString());
            case 24:
                return new C2342rl(parcel.readString());
            case 25:
                return new C2380sl(parcel.readString());
            case 26:
                return new C2654zl(parcel.readString(), parcel.readString());
            case 27:
                return new C1712bo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 28:
                return new C1748co(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            default:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM9h2 = 0;
                while (iM9h2 != i3) {
                    iM9h2 = AbstractC0000a.m9h(C1785dp.class, parcel, arrayList2, iM9h2, 1);
                }
                return new C1785dp(arrayList2, (Intent) parcel.readParcelable(C1785dp.class.getClassLoader()), (f5j0) parcel.readParcelable(C1785dp.class.getClassLoader()), (qta0) parcel.readParcelable(C1785dp.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f121320a) {
            case 0:
                return new C2085lc[i];
            case 1:
                return new C2122mc[i];
            case 2:
                return new C2159nc[i];
            case 3:
                return new C1893gd[i];
            case 4:
                return new C1856fd[i];
            case 5:
                return new C2125mf[i];
            case 6:
                return new C2130mk[i];
            case 7:
                return new C2167nk[i];
            case 8:
                return new C2217ok[i];
            case 9:
                return new C2259pk[i];
            case 10:
                return new C2296qk[i];
            case 11:
                return new C2341rk[i];
            case 12:
                return new C2379sk[i];
            case 13:
                return new C2418tk[i];
            case 14:
                return new C2461uk[i];
            case 15:
                return new C2499vk[i];
            case 16:
                return new C2538wk[i];
            case 17:
                return new C2575xk[i];
            case 18:
                return new C2131ml[i];
            case 19:
                return new C2168nl[i];
            case 20:
                return new C2218ol[i];
            case 21:
                return new C2462ul[i];
            case 22:
                return new C2260pl[i];
            case 23:
                return new C2297ql[i];
            case 24:
                return new C2342rl[i];
            case 25:
                return new C2380sl[i];
            case 26:
                return new C2654zl[i];
            case 27:
                return new C1712bo[i];
            case 28:
                return new C1748co[i];
            default:
                return new C1785dp[i];
        }
    }
}
