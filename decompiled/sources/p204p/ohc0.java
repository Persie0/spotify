package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ohc0 implements khc0 {
    @Override // p204p.khc0
    /* JADX INFO: renamed from: d */
    public final Object mo56426d(Object obj, Object obj2) {
        ihc0 ihc0VarM50613h = (ihc0) obj;
        ihc0 ihc0Var = (ihc0) obj2;
        if (!ihc0Var.isEmpty()) {
            if (!ihc0VarM50613h.f102236a) {
                ihc0VarM50613h = ihc0VarM50613h.m50613h();
            }
            ihc0VarM50613h.m50612e();
            if (!ihc0Var.isEmpty()) {
                ihc0VarM50613h.putAll(ihc0Var);
            }
        }
        return ihc0VarM50613h;
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: e */
    public final d5a0 mo56427e(Object obj) {
        return ((vgc0) obj).f241215a;
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: f */
    public final Map mo56428f(Object obj) {
        return (ihc0) obj;
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: g */
    public final Object mo56429g(Object obj) {
        return ihc0.f102235b.m50613h();
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: h */
    public final Map mo56430h(Object obj) {
        return (ihc0) obj;
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: i */
    public final Object mo56431i(Object obj) {
        ((ihc0) obj).f102236a = false;
        return obj;
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: j */
    public final int mo56432j(int i, Object obj, Object obj2) {
        ihc0 ihc0Var = (ihc0) obj;
        vgc0 vgc0Var = (vgc0) obj2;
        int iM84099N = 0;
        if (ihc0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : ihc0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            vgc0Var.getClass();
            int iM84098M = uwe.m84098M(i);
            int iM85428a = vgc0.m85428a(vgc0Var.f241215a, key, value);
            iM84099N += uwe.m84099N(iM85428a) + iM85428a + iM84098M;
        }
        return iM84099N;
    }

    @Override // p204p.khc0
    /* JADX INFO: renamed from: k */
    public final boolean mo56433k(Object obj) {
        return !((ihc0) obj).f102236a;
    }
}
