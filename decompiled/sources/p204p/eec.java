package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class eec {

    /* JADX INFO: renamed from: a */
    public final String f58740a;

    /* JADX INFO: renamed from: b */
    public final cec f58741b;

    /* JADX INFO: renamed from: c */
    public final int f58742c;

    /* JADX INFO: renamed from: d */
    public final int f58743d;

    /* JADX INFO: renamed from: e */
    public final Integer f58744e;

    /* JADX INFO: renamed from: f */
    public final udc f58745f;

    /* JADX INFO: renamed from: g */
    public final List f58746g;

    /* JADX INFO: renamed from: h */
    public final List f58747h;

    public eec(String str, cec cecVar, int i, int i2, Integer num, udc udcVar, List list, List list2) {
        this.f58740a = str;
        this.f58741b = cecVar;
        this.f58742c = i;
        this.f58743d = i2;
        this.f58744e = num;
        this.f58745f = udcVar;
        this.f58746g = list;
        this.f58747h = list2;
    }

    /* JADX INFO: renamed from: a */
    public static eec m38652a(eec eecVar, String str, cec cecVar, udc udcVar, ArrayList arrayList, List list, int i) {
        if ((i & 1) != 0) {
            str = eecVar.f58740a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            cecVar = eecVar.f58741b;
        }
        cec cecVar2 = cecVar;
        int i2 = (i & 4) != 0 ? eecVar.f58742c : 1;
        int i3 = (i & 8) != 0 ? eecVar.f58743d : 2;
        Integer num = (i & 16) != 0 ? eecVar.f58744e : 3;
        if ((i & 32) != 0) {
            udcVar = eecVar.f58745f;
        }
        udc udcVar2 = udcVar;
        List list2 = (i & 64) != 0 ? eecVar.f58746g : arrayList;
        List list3 = (i & 128) != 0 ? eecVar.f58747h : list;
        eecVar.getClass();
        return new eec(str2, cecVar2, i2, i3, num, udcVar2, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eec)) {
            return false;
        }
        eec eecVar = (eec) obj;
        return wj50.m88271j(this.f58740a, eecVar.f58740a) && wj50.m88271j(this.f58741b, eecVar.f58741b) && this.f58742c == eecVar.f58742c && this.f58743d == eecVar.f58743d && wj50.m88271j(this.f58744e, eecVar.f58744e) && wj50.m88271j(this.f58745f, eecVar.f58745f) && wj50.m88271j(this.f58746g, eecVar.f58746g) && wj50.m88271j(this.f58747h, eecVar.f58747h);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f58743d, f710.m40938f(this.f58742c, (this.f58741b.hashCode() + (this.f58740a.hashCode() * 31)) * 31, 31), 31);
        Integer num = this.f58744e;
        int iHashCode = (iM40938f + (num == null ? 0 : num.hashCode())) * 31;
        udc udcVar = this.f58745f;
        return this.f58747h.hashCode() + s571.m77244c((iHashCode + (udcVar != null ? udcVar.f229224a.hashCode() : 0)) * 31, 31, this.f58746g);
    }
}
