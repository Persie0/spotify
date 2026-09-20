package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class mi3 implements b7z0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143926a;

    /* JADX INFO: renamed from: b */
    public final x6z0 f143927b;

    /* JADX INFO: renamed from: c */
    public final btv0 f143928c;

    public /* synthetic */ mi3(x6z0 x6z0Var, btv0 btv0Var, int i) {
        this.f143926a = i;
        this.f143927b = x6z0Var;
        this.f143928c = btv0Var;
    }

    @Override // p204p.b7z0
    /* JADX INFO: renamed from: a */
    public final List mo28407a(ph3 ph3Var) {
        switch (this.f143926a) {
            case 0:
                List listM90107a = this.f143927b.m90107a(ph3Var);
                ArrayList arrayList = new ArrayList();
                Iterator it = listM90107a.iterator();
                while (it.hasNext()) {
                    u6z0 u6z0Var = (u6z0) this.f143928c.get((w6z0) it.next());
                    List list = u6z0Var != null ? (List) u6z0Var.invoke(ph3Var) : null;
                    if (list == null) {
                        list = lau.f131415a;
                    }
                    j6f.m52564V(list, arrayList);
                }
                return arrayList;
            default:
                List listM90107a2 = this.f143927b.m90107a(ph3Var);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listM90107a2.iterator();
                while (it2.hasNext()) {
                    u6z0 u6z0Var2 = (u6z0) this.f143928c.get((w6z0) it2.next());
                    List list2 = u6z0Var2 != null ? (List) u6z0Var2.invoke(ph3Var) : null;
                    if (list2 == null) {
                        list2 = lau.f131415a;
                    }
                    j6f.m52564V(list2, arrayList2);
                }
                return arrayList2;
        }
    }
}
