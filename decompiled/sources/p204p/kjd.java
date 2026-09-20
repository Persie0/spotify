package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class kjd implements Parcelable {
    public static final Parcelable.Creator<kjd> CREATOR = new qvc(22);

    /* JADX INFO: renamed from: L0 */
    public final boolean f123309L0;

    /* JADX INFO: renamed from: M0 */
    public final String f123310M0;

    /* JADX INFO: renamed from: N0 */
    public final boolean f123311N0;

    /* JADX INFO: renamed from: O0 */
    public final int f123312O0;

    /* JADX INFO: renamed from: P0 */
    public final int f123313P0;

    /* JADX INFO: renamed from: Q0 */
    public final xcl0 f123314Q0;

    /* JADX INFO: renamed from: R0 */
    public final boolean f123315R0;

    /* JADX INFO: renamed from: S0 */
    public final boolean f123316S0;

    /* JADX INFO: renamed from: T0 */
    public final boolean f123317T0;

    /* JADX INFO: renamed from: U0 */
    public final Map f123318U0;

    /* JADX INFO: renamed from: V0 */
    public final boolean f123319V0;

    /* JADX INFO: renamed from: W0 */
    public final boolean f123320W0;

    /* JADX INFO: renamed from: X */
    public final String f123321X;

    /* JADX INFO: renamed from: X0 */
    public final Map f123322X0;

    /* JADX INFO: renamed from: Y */
    public final boolean f123323Y;

    /* JADX INFO: renamed from: Y0 */
    public final String f123324Y0;

    /* JADX INFO: renamed from: Z */
    public final boolean f123325Z;

    /* JADX INFO: renamed from: Z0 */
    public final boolean f123326Z0;

    /* JADX INFO: renamed from: a */
    public final rvc f123327a;

    /* JADX INFO: renamed from: a1 */
    public final boolean f123328a1;

    /* JADX INFO: renamed from: b */
    public final pla1 f123329b;

    /* JADX INFO: renamed from: b1 */
    public final whn0 f123330b1;

    /* JADX INFO: renamed from: c */
    public final boolean f123331c;

    /* JADX INFO: renamed from: c1 */
    public final boolean f123332c1;

    /* JADX INFO: renamed from: d */
    public final boolean f123333d;

    /* JADX INFO: renamed from: d1 */
    public final bo2 f123334d1;

    /* JADX INFO: renamed from: e */
    public final wid f123335e;

    /* JADX INFO: renamed from: e1 */
    public final boolean f123336e1;

    /* JADX INFO: renamed from: f */
    public final jqs f123337f;

    /* JADX INFO: renamed from: f1 */
    public final gcd f123338f1;

    /* JADX INFO: renamed from: g */
    public final jjd f123339g;

    /* JADX INFO: renamed from: g1 */
    public final List f123340g1;

    /* JADX INFO: renamed from: h */
    public final boolean f123341h;

    /* JADX INFO: renamed from: h1 */
    public final boolean f123342h1;

    /* JADX INFO: renamed from: i */
    public final int f123343i;

    /* JADX INFO: renamed from: t */
    public final boolean f123344t;

    public kjd(rvc rvcVar, pla1 pla1Var, boolean z, boolean z2, wid widVar, jqs jqsVar, jjd jjdVar, boolean z3, int i, boolean z4, String str, boolean z5, boolean z6, boolean z7, String str2, boolean z8, int i2, int i3, xcl0 xcl0Var, boolean z9, boolean z10, boolean z11, Map map, boolean z12, boolean z13, Map map2, String str3, boolean z14, boolean z15, whn0 whn0Var, boolean z16, bo2 bo2Var, boolean z17, gcd gcdVar, List list) {
        this.f123327a = rvcVar;
        this.f123329b = pla1Var;
        this.f123331c = z;
        this.f123333d = z2;
        this.f123335e = widVar;
        this.f123337f = jqsVar;
        this.f123339g = jjdVar;
        this.f123341h = z3;
        this.f123343i = i;
        this.f123344t = z4;
        this.f123321X = str;
        this.f123323Y = z5;
        this.f123325Z = z6;
        this.f123309L0 = z7;
        this.f123310M0 = str2;
        this.f123311N0 = z8;
        this.f123312O0 = i2;
        this.f123313P0 = i3;
        this.f123314Q0 = xcl0Var;
        this.f123315R0 = z9;
        this.f123316S0 = z10;
        this.f123317T0 = z11;
        this.f123318U0 = map;
        this.f123319V0 = z12;
        this.f123320W0 = z13;
        this.f123322X0 = map2;
        this.f123324Y0 = str3;
        this.f123326Z0 = z14;
        this.f123328a1 = z15;
        this.f123330b1 = whn0Var;
        this.f123332c1 = z16;
        this.f123334d1 = bo2Var;
        this.f123336e1 = z17;
        this.f123338f1 = gcdVar;
        this.f123340g1 = list;
        this.f123342h1 = z2h1.m95216w(rvcVar);
    }

    /* JADX INFO: renamed from: c */
    public static kjd m56563c(kjd kjdVar, rvc rvcVar, wid widVar, jqs jqsVar, jjd jjdVar, boolean z, int i, boolean z2, boolean z3, boolean z4, String str, int i2, xcl0 xcl0Var, boolean z5, Map map, boolean z6, Map map2, String str2, whn0 whn0Var, bo2 bo2Var, boolean z7, gcd gcdVar, List list, int i3, int i4) {
        rvc rvcVar2 = (i3 & 1) != 0 ? kjdVar.f123327a : rvcVar;
        pla1 pla1Var = kjdVar.f123329b;
        boolean z8 = kjdVar.f123331c;
        boolean z9 = (i3 & 8) != 0 ? kjdVar.f123333d : true;
        wid widVar2 = (i3 & 16) != 0 ? kjdVar.f123335e : widVar;
        jqs jqsVar2 = (i3 & 32) != 0 ? kjdVar.f123337f : jqsVar;
        jjd jjdVar2 = (i3 & 64) != 0 ? kjdVar.f123339g : jjdVar;
        boolean z10 = (i3 & 128) != 0 ? kjdVar.f123341h : z;
        int i5 = (i3 & 256) != 0 ? kjdVar.f123343i : i;
        boolean z11 = kjdVar.f123344t;
        String str3 = (i3 & 1024) != 0 ? kjdVar.f123321X : null;
        boolean z12 = (i3 & 2048) != 0 ? kjdVar.f123323Y : z2;
        boolean z13 = (i3 & 4096) != 0 ? kjdVar.f123325Z : z3;
        boolean z14 = (i3 & 8192) != 0 ? kjdVar.f123309L0 : z4;
        String str4 = (i3 & 16384) != 0 ? kjdVar.f123310M0 : str;
        boolean z15 = (32768 & i3) != 0 ? kjdVar.f123311N0 : true;
        int i6 = (65536 & i3) != 0 ? kjdVar.f123312O0 : i2;
        int i7 = kjdVar.f123313P0;
        xcl0 xcl0Var2 = (262144 & i3) != 0 ? kjdVar.f123314Q0 : xcl0Var;
        boolean z16 = kjdVar.f123315R0;
        boolean z17 = kjdVar.f123316S0;
        boolean z18 = (i3 & 2097152) != 0 ? kjdVar.f123317T0 : z5;
        Map map3 = (i3 & 4194304) != 0 ? kjdVar.f123318U0 : map;
        boolean z19 = kjdVar.f123319V0;
        boolean z20 = (i3 & 16777216) != 0 ? kjdVar.f123320W0 : z6;
        Map map4 = (i3 & 33554432) != 0 ? kjdVar.f123322X0 : map2;
        String str5 = (i3 & 67108864) != 0 ? kjdVar.f123324Y0 : str2;
        boolean z21 = kjdVar.f123326Z0;
        boolean z22 = kjdVar.f123328a1;
        whn0 whn0Var2 = (i3 & 536870912) != 0 ? kjdVar.f123330b1 : whn0Var;
        boolean z23 = kjdVar.f123332c1;
        bo2 bo2Var2 = (i3 & Integer.MIN_VALUE) != 0 ? kjdVar.f123334d1 : bo2Var;
        boolean z24 = (i4 & 1) != 0 ? kjdVar.f123336e1 : z7;
        gcd gcdVar2 = (i4 & 2) != 0 ? kjdVar.f123338f1 : gcdVar;
        List list2 = (i4 & 4) != 0 ? kjdVar.f123340g1 : list;
        kjdVar.getClass();
        return new kjd(rvcVar2, pla1Var, z8, z9, widVar2, jqsVar2, jjdVar2, z10, i5, z11, str3, z12, z13, z14, str4, z15, i6, i7, xcl0Var2, z16, z17, z18, map3, z19, z20, map4, str5, z21, z22, whn0Var2, z23, bo2Var2, z24, gcdVar2, list2);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m56564A() {
        return this.f123331c;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m56565C() {
        return this.f123336e1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjd)) {
            return false;
        }
        kjd kjdVar = (kjd) obj;
        return wj50.m88271j(this.f123327a, kjdVar.f123327a) && wj50.m88271j(this.f123329b, kjdVar.f123329b) && this.f123331c == kjdVar.f123331c && this.f123333d == kjdVar.f123333d && wj50.m88271j(this.f123335e, kjdVar.f123335e) && wj50.m88271j(this.f123337f, kjdVar.f123337f) && wj50.m88271j(this.f123339g, kjdVar.f123339g) && this.f123341h == kjdVar.f123341h && this.f123343i == kjdVar.f123343i && this.f123344t == kjdVar.f123344t && wj50.m88271j(this.f123321X, kjdVar.f123321X) && this.f123323Y == kjdVar.f123323Y && this.f123325Z == kjdVar.f123325Z && this.f123309L0 == kjdVar.f123309L0 && wj50.m88271j(this.f123310M0, kjdVar.f123310M0) && this.f123311N0 == kjdVar.f123311N0 && this.f123312O0 == kjdVar.f123312O0 && this.f123313P0 == kjdVar.f123313P0 && wj50.m88271j(this.f123314Q0, kjdVar.f123314Q0) && this.f123315R0 == kjdVar.f123315R0 && this.f123316S0 == kjdVar.f123316S0 && this.f123317T0 == kjdVar.f123317T0 && wj50.m88271j(this.f123318U0, kjdVar.f123318U0) && this.f123319V0 == kjdVar.f123319V0 && this.f123320W0 == kjdVar.f123320W0 && wj50.m88271j(this.f123322X0, kjdVar.f123322X0) && wj50.m88271j(this.f123324Y0, kjdVar.f123324Y0) && this.f123326Z0 == kjdVar.f123326Z0 && this.f123328a1 == kjdVar.f123328a1 && wj50.m88271j(this.f123330b1, kjdVar.f123330b1) && this.f123332c1 == kjdVar.f123332c1 && wj50.m88271j(this.f123334d1, kjdVar.f123334d1) && this.f123336e1 == kjdVar.f123336e1 && this.f123338f1 == kjdVar.f123338f1 && wj50.m88271j(this.f123340g1, kjdVar.f123340g1);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m56566g() {
        rvc rvcVar = this.f123327a;
        if (rvcVar.f203051c.m65144c()) {
            return this.f123335e.f251605a.isEmpty() || !wj50.m88271j(rvcVar.f203050b, qxd.f193619a);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m56567h() {
        return this.f123311N0;
    }

    public final int hashCode() {
        int i;
        int iHashCode = (this.f123335e.hashCode() + s571.m77245d(s571.m77245d(ydj.m93448g(this.f123329b, this.f123327a.hashCode() * 31, 31), 31, this.f123331c), 31, this.f123333d)) * 31;
        jqs jqsVar = this.f123337f;
        if (jqsVar == null) {
            i = 0;
        } else {
            jqsVar.getClass();
            i = 2020616790;
        }
        int iM77245d = s571.m77245d(mt60.m62800g(this.f123343i, s571.m77245d((this.f123339g.hashCode() + ((iHashCode + i) * 31)) * 31, 31, this.f123341h), 31), 31, this.f123344t);
        String str = this.f123321X;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f123323Y), 31, this.f123325Z), 31, this.f123309L0);
        String str2 = this.f123310M0;
        int iM62800g = mt60.m62800g(this.f123313P0, mt60.m62800g(this.f123312O0, s571.m77245d((iM77245d2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f123311N0), 31), 31);
        xcl0 xcl0Var = this.f123314Q0;
        int iM38557f = edb.m38557f(s571.m77245d(s571.m77245d(edb.m38557f(s571.m77245d(s571.m77245d(s571.m77245d((iM62800g + (xcl0Var == null ? 0 : xcl0Var.hashCode())) * 31, 31, this.f123315R0), 31, this.f123316S0), 31, this.f123317T0), 31, this.f123318U0), 31, this.f123319V0), 31, this.f123320W0), 31, this.f123322X0);
        String str3 = this.f123324Y0;
        int iM77245d3 = s571.m77245d(s571.m77245d((iM38557f + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f123326Z0), 31, this.f123328a1);
        whn0 whn0Var = this.f123330b1;
        return this.f123340g1.hashCode() + ((this.f123338f1.hashCode() + s571.m77245d((this.f123334d1.hashCode() + s571.m77245d((iM77245d3 + (whn0Var != null ? whn0Var.hashCode() : 0)) * 31, 31, this.f123332c1)) * 31, 31, this.f123336e1)) * 31);
    }

    /* JADX INFO: renamed from: j */
    public final rvc m56568j() {
        return this.f123327a;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m56569k() {
        return this.f123309L0;
    }

    /* JADX INFO: renamed from: l */
    public final Map m56570l() {
        return this.f123318U0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m56571m() {
        return this.f123328a1;
    }

    /* JADX INFO: renamed from: q */
    public final ArrayList m56572q() {
        List list = this.f123335e.f251605a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((pla1) it.next()).f178681a);
        }
        Set setM43736n1 = g6f.m43736n1(arrayList);
        List list2 = this.f123327a.f203053e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!wj50.m88271j(((akk) obj).f16560a.f178681a, this.f123329b.f178681a)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!setM43736n1.contains(((akk) obj2).f16560a.f178681a)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((akk) it2.next()).f16560a);
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: u */
    public final String m56573u() {
        gcl gclVar;
        jjd jjdVar = this.f123339g;
        if (jjdVar instanceof djd) {
            gclVar = ((djd) jjdVar).f49660c;
        } else {
            gclVar = jjdVar instanceof ejd ? ((ejd) jjdVar).f60196a : null;
        }
        if (gclVar instanceof ecl) {
            String str = ((ecl) gclVar).f58352a;
            return str == null ? "" : str;
        }
        if (gclVar instanceof fcl) {
            String str2 = ((fcl) gclVar).f68137a;
            return str2 == null ? "" : str2;
        }
        if (gclVar == null) {
            return this.f123327a.f203049a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m56574v() {
        return this.f123319V0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m56575w() {
        return this.f123323Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f123327a, i);
        parcel.writeParcelable(this.f123329b, i);
        parcel.writeInt(this.f123331c ? 1 : 0);
        parcel.writeInt(this.f123333d ? 1 : 0);
        this.f123335e.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f123337f, i);
        parcel.writeParcelable(this.f123339g, i);
        parcel.writeInt(this.f123341h ? 1 : 0);
        parcel.writeInt(this.f123343i);
        parcel.writeInt(this.f123344t ? 1 : 0);
        parcel.writeString(this.f123321X);
        parcel.writeInt(this.f123323Y ? 1 : 0);
        parcel.writeInt(this.f123325Z ? 1 : 0);
        parcel.writeInt(this.f123309L0 ? 1 : 0);
        parcel.writeString(this.f123310M0);
        parcel.writeInt(this.f123311N0 ? 1 : 0);
        parcel.writeInt(this.f123312O0);
        parcel.writeInt(this.f123313P0);
        parcel.writeParcelable(this.f123314Q0, i);
        parcel.writeInt(this.f123315R0 ? 1 : 0);
        parcel.writeInt(this.f123316S0 ? 1 : 0);
        parcel.writeInt(this.f123317T0 ? 1 : 0);
        Iterator itM91403l = xl81.m91403l(parcel, this.f123318U0);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeString((String) entry.getKey());
            Iterator itM42468l = fr0.m42468l(parcel, (List) entry.getValue());
            while (itM42468l.hasNext()) {
                parcel.writeParcelable((Parcelable) itM42468l.next(), i);
            }
        }
        parcel.writeInt(this.f123319V0 ? 1 : 0);
        parcel.writeInt(this.f123320W0 ? 1 : 0);
        Iterator itM91403l2 = xl81.m91403l(parcel, this.f123322X0);
        while (itM91403l2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itM91403l2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeStringList((List) entry2.getValue());
        }
        parcel.writeString(this.f123324Y0);
        parcel.writeInt(this.f123326Z0 ? 1 : 0);
        parcel.writeInt(this.f123328a1 ? 1 : 0);
        parcel.writeParcelable(this.f123330b1, i);
        parcel.writeInt(this.f123332c1 ? 1 : 0);
        parcel.writeParcelable(this.f123334d1, i);
        parcel.writeInt(this.f123336e1 ? 1 : 0);
        parcel.writeString(this.f123338f1.name());
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f123340g1);
        while (itM42468l2.hasNext()) {
            parcel.writeString(((gcd) itM42468l2.next()).name());
        }
    }
}
