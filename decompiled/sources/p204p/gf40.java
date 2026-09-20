package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gf40 implements pgo {

    /* JADX INFO: renamed from: a */
    public final Map f79261a;

    public gf40(Map map) {
        this.f79261a = map;
    }

    @Override // p204p.pgo
    /* JADX INFO: renamed from: b */
    public final qho mo25866b(lho lhoVar) {
        return lhoVar.mo25349a(this.f79261a);
    }

    @Override // p204p.pgo
    /* JADX INFO: renamed from: c */
    public final ogo mo25867c(lho lhoVar) {
        return new ff40(lhoVar.mo25349a(this.f79261a));
    }

    @Override // p204p.pgo
    /* JADX INFO: renamed from: e */
    public final Object mo25869e(tn61 tn61Var, Object obj, Object obj2, fbk fbkVar) {
        throw new IllegalStateException("execute not supported on immutable data pools");
    }
}
