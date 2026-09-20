package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: p.dr */
/* JADX INFO: loaded from: classes4.dex */
public final class C1787dr {

    /* JADX INFO: renamed from: a */
    public final qf40 f52122a;

    /* JADX INFO: renamed from: b */
    public final boolean f52123b;

    public C1787dr(C1751cr c1751cr) {
        List<C1681av> list = c1751cr.f41128a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (C1681av c1681av : list) {
            String str = c1681av.f20054c;
            String str2 = str == null ? "" : str;
            String str3 = c1681av.f20052a;
            String str4 = c1681av.f20053b;
            String str5 = str4 == null ? "" : str4;
            Integer num = c1681av.f20055d;
            arrayList.add(new uku(num != null ? n6f.m63765b(rfg1.m75432b(num.intValue()), 1.0f, 0.0f, 0.0f, 0.0f, 14) : n6f.f150871k, str2, str3, str5));
        }
        qf40 qf40VarM67574x = opo.m67574x(arrayList);
        boolean z = !c1751cr.f41129b;
        this.f52122a = qf40VarM67574x;
        this.f52123b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1787dr)) {
            return false;
        }
        C1787dr c1787dr = (C1787dr) obj;
        return wj50.m88271j(this.f52122a, c1787dr.f52122a) && this.f52123b == c1787dr.f52123b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52123b) + (this.f52122a.hashCode() * 31);
    }
}
