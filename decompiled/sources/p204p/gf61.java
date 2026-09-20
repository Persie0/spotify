package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gf61 implements bq6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hf61 f79287a;

    public gf61(hf61 hf61Var) {
        this.f79287a = hf61Var;
    }

    @Override // p204p.bq6
    /* JADX INFO: renamed from: a */
    public final void mo30183a(aq6 aq6Var) {
        hf61 hf61Var = this.f79287a;
        if (hf61Var.m47330l()) {
            Iterator it = hf61Var.f90608b.iterator();
            while (it.hasNext()) {
                ((bq6) it.next()).mo30183a(aq6Var);
            }
        }
        hf61Var.f90609c = null;
    }

    @Override // p204p.bq6
    /* JADX INFO: renamed from: b */
    public final void mo30184b(aq6 aq6Var) {
        hf61 hf61Var = this.f79287a;
        hf61Var.f90609c = aq6Var;
        if (hf61Var.m47330l()) {
            Iterator it = hf61Var.f90608b.iterator();
            while (it.hasNext()) {
                ((bq6) it.next()).mo30184b(aq6Var);
            }
        }
    }
}
