package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class za70 {

    /* JADX INFO: renamed from: a */
    public final as5 f280996a;

    /* JADX INFO: renamed from: b */
    public final gbc0 f280997b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f280998c = new LinkedHashMap();

    public za70(pln plnVar, pgo pgoVar) {
        this.f280996a = plnVar.m70264a(pgoVar, new ww0(3, 11, null));
        this.f280997b = new gbc0(pgoVar, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m95765a(String str, List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((tjo) this.f280996a.f19300c).mo28634a(new fsf0((String) it.next())));
        }
        Set setM43736n1 = g6f.m43736n1(arrayList);
        LinkedHashMap linkedHashMap = this.f280998c;
        linkedHashMap.put(str, setM43736n1);
        this.f280997b.m44213a(g6f.m43736n1(i6f.m49805U(linkedHashMap.values())));
    }
}
