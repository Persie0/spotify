package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kv80 implements hv80 {
    @Override // p204p.hv80
    /* JADX INFO: renamed from: a */
    public final void mo48724a(Object obj, long j, Object obj2) {
        x4a1 x4a1Var = b5a1.f23536c;
        ae50 ae50VarMo25687h = (ae50) x4a1Var.m89844k(j, obj);
        ae50 ae50Var = (ae50) x4a1Var.m89844k(j, obj2);
        int size = ae50VarMo25687h.size();
        int size2 = ae50Var.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1733c9) ae50VarMo25687h).f35342a) {
                ae50VarMo25687h = ae50VarMo25687h.mo25687h(size2 + size);
            }
            ae50VarMo25687h.addAll(ae50Var);
        }
        if (size > 0) {
            ae50Var = ae50VarMo25687h;
        }
        b5a1.m28169p(obj, j, ae50Var);
    }

    @Override // p204p.hv80
    /* JADX INFO: renamed from: b */
    public final List mo48725b(long j, Object obj) {
        ae50 ae50Var = (ae50) b5a1.f23536c.m89844k(j, obj);
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return ae50Var;
        }
        int size = ae50Var.size();
        ae50 ae50VarMo25687h = ae50Var.mo25687h(size == 0 ? 10 : size * 2);
        b5a1.m28169p(obj, j, ae50VarMo25687h);
        return ae50VarMo25687h;
    }

    @Override // p204p.hv80
    /* JADX INFO: renamed from: c */
    public final void mo48726c(long j, Object obj) {
        AbstractC1733c9 abstractC1733c9 = (AbstractC1733c9) ((ae50) b5a1.f23536c.m89844k(j, obj));
        if (abstractC1733c9.f35342a) {
            abstractC1733c9.f35342a = false;
        }
    }
}
