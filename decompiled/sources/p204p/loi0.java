package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class loi0 implements onp {

    /* JADX INFO: renamed from: a */
    public boolean f135434a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f135435b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f135436c = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m59569a(boolean z) {
        cxt cxtVar;
        this.f135434a = z;
        for (Map.Entry entry : this.f135436c.entrySet()) {
            up60 up60Var = (up60) entry.getKey();
            for (dxt dxtVar : (List) entry.getValue()) {
                dxtVar.mo37274b(z);
                if (z && (cxtVar = (cxt) this.f135435b.get(up60Var)) != null) {
                    dxtVar.mo37273a(cxtVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m59570b(up60 up60Var, cxt cxtVar) {
        List list;
        this.f135435b.put(up60Var, cxtVar);
        if (!this.f135434a || (list = (List) this.f135436c.get(up60Var)) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((dxt) it.next()).mo37273a(cxtVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m59571c(up60 up60Var, dxt dxtVar) {
        dxtVar.mo37274b(this.f135434a);
        cxt cxtVar = (cxt) this.f135435b.get(up60Var);
        if (cxtVar != null) {
            dxtVar.mo37273a(cxtVar);
        }
        LinkedHashMap linkedHashMap = this.f135436c;
        List list = (List) linkedHashMap.get(up60Var);
        if (list != null) {
            list.add(dxtVar);
        } else {
            linkedHashMap.put(up60Var, h6f.m46717N(dxtVar));
        }
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        hc80Var.getLifecycle().mo31988d(this);
        LinkedHashMap linkedHashMap = this.f135436c;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((dxt) it2.next()).mo37274b(false);
            }
        }
        linkedHashMap.clear();
    }
}
