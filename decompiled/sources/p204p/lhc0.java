package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class lhc0 implements khc0 {
    @Override // p204p.khc0
    /* JADX INFO: renamed from: d */
    public final Object mo56426d(Object obj, Object obj2) {
        fhc0 fhc0Var = (fhc0) obj;
        fhc0 fhc0Var2 = (fhc0) obj2;
        if (!fhc0Var.m41659f()) {
            fhc0Var.m41655b();
        }
        fhc0Var.m41661h(fhc0Var2);
        return fhc0Var;
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: e */
    public final d5a0 mo56427e(Object obj) {
        ikc0.m50942n(obj);
        throw null;
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: f */
    public final Map mo56428f(Object obj) {
        return ((fhc0) obj).m41658e();
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: g */
    public final Object mo56429g(Object obj) {
        ikc0.m50942n(obj);
        return fhc0.m41653i();
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: h */
    public final Map mo56430h(Object obj) {
        return ((fhc0) obj).m41657d();
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: i */
    public final Object mo56431i(Object obj) {
        ((fhc0) obj).m41660g();
        return obj;
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: j */
    public final int mo56432j(int i, Object obj, Object obj2) {
        if (obj == null) {
            return 0;
        }
        Map mapM41657d = ((fhc0) obj).m41657d();
        ikc0.m50942n(obj2);
        if (mapM41657d.isEmpty()) {
            return 0;
        }
        Iterator it = mapM41657d.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        uwe.m84098M(i);
        throw null;
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: k */
    public final boolean mo56433k(Object obj) {
        return !((fhc0) obj).m41659f();
    }
}
