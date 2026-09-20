package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fv80 extends iv80 {
    @Override // p204p.iv80
    /* JADX INFO: renamed from: a */
    public final void mo37049a(long j, Object obj) {
        ((AbstractC1770d9) ((be50) c5a1.f34125d.m92806i(j, obj))).m35296d();
    }

    @Override // p204p.iv80
    /* JADX INFO: renamed from: b */
    public final void mo37050b(Object obj, long j, Object obj2) {
        y4a1 y4a1Var = c5a1.f34125d;
        be50 be50VarMo28906h = (be50) y4a1Var.m92806i(j, obj);
        be50 be50Var = (be50) y4a1Var.m92806i(j, obj2);
        int size = be50VarMo28906h.size();
        int size2 = be50Var.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1770d9) be50VarMo28906h).m35295b()) {
                be50VarMo28906h = be50VarMo28906h.mo28906h(size2 + size);
            }
            be50VarMo28906h.addAll(be50Var);
        }
        if (size > 0) {
            be50Var = be50VarMo28906h;
        }
        c5a1.m31479o(obj, j, be50Var);
    }

    @Override // p204p.iv80
    /* JADX INFO: renamed from: c */
    public final List mo37051c(long j, Object obj) {
        AbstractC1770d9 abstractC1770d9 = (AbstractC1770d9) ((be50) c5a1.f34125d.m92806i(j, obj));
        if (abstractC1770d9.m35295b()) {
            return abstractC1770d9;
        }
        int size = abstractC1770d9.size();
        be50 be50VarMo28906h = abstractC1770d9.mo28906h(size == 0 ? 10 : size * 2);
        c5a1.m31479o(obj, j, be50VarMo28906h);
        return be50VarMo28906h;
    }
}
