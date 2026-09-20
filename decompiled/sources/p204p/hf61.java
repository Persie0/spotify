package p204p;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class hf61 implements cq6 {

    /* JADX INFO: renamed from: a */
    public final rxo f90607a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f90608b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public aq6 f90609c;

    /* JADX INFO: renamed from: d */
    public boolean f90610d;

    public hf61(rxo rxoVar) {
        this.f90607a = rxoVar;
        rxoVar.mo33597d(new gf61(this));
        this.f90610d = true;
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: a */
    public final void mo33595a(bq6 bq6Var) {
        aq6 aq6Var;
        this.f90608b.remove(bq6Var);
        if (!this.f90610d || (aq6Var = this.f90609c) == null) {
            return;
        }
        bq6Var.mo30183a(aq6Var);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: c */
    public final void mo33596c(aq6 aq6Var) {
        this.f90607a.mo33596c(aq6Var);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: d */
    public final void mo33597d(bq6 bq6Var) {
        aq6 aq6Var;
        this.f90608b.add(bq6Var);
        if (!this.f90610d || (aq6Var = this.f90609c) == null) {
            return;
        }
        bq6Var.mo30184b(aq6Var);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: e */
    public final void mo33598e(aq6 aq6Var) {
        this.f90607a.mo33598e(aq6Var);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: g */
    public final void mo33599g(int i, Float f, Float f2, float f3) {
        this.f90607a.mo33599g(i, f, f2, f3);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: h */
    public final void mo33600h(xpi0 xpi0Var) {
        this.f90607a.f203649f = xpi0Var;
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: i */
    public final void mo33601i(Float f, Float f2, float f3) {
        this.f90607a.mo33601i(f, f2, f3);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: j */
    public final void mo33602j(aq6 aq6Var, xpi0 xpi0Var) {
        this.f90607a.mo33602j(aq6Var, xpi0Var);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m47330l() {
        return this.f90610d;
    }

    /* JADX INFO: renamed from: m */
    public final void m47331m(boolean z) {
        aq6 aq6Var;
        aq6 aq6Var2;
        boolean z2 = this.f90610d;
        this.f90610d = z;
        LinkedHashSet linkedHashSet = this.f90608b;
        if (z2 && !z && (aq6Var2 = this.f90609c) != null) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((bq6) it.next()).mo30183a(aq6Var2);
            }
        }
        if (z2 || !z || (aq6Var = this.f90609c) == null) {
            return;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            ((bq6) it2.next()).mo30184b(aq6Var);
        }
    }
}
