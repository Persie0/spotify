package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class q5e0 implements cq6 {

    /* JADX INFO: renamed from: a */
    public int f185513a;

    /* JADX INFO: renamed from: b */
    public boolean f185514b;

    /* JADX INFO: renamed from: c */
    public aq6 f185515c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f185516d = new LinkedHashSet();

    @Override // p204p.cq6
    /* JADX INFO: renamed from: a */
    public final void mo33595a(bq6 bq6Var) {
        this.f185516d.remove(bq6Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m72194b(String str) {
        if (this.f185514b) {
            aq6 aq6Var = this.f185515c;
            if (wj50.m88271j(aq6Var != null ? aq6Var.f18090a : null, str)) {
                return;
            }
            aq6 aq6Var2 = new aq6(str);
            aq6 aq6Var3 = this.f185515c;
            LinkedHashSet linkedHashSet = this.f185516d;
            if (aq6Var3 != null) {
                dzg1.m37461o(linkedHashSet, aq6Var3);
            }
            this.f185515c = aq6Var2;
            dzg1.m37460n(linkedHashSet, aq6Var2);
        }
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: d */
    public final void mo33597d(bq6 bq6Var) {
        aq6 aq6Var;
        LinkedHashSet linkedHashSet = this.f185516d;
        if (linkedHashSet.contains(bq6Var)) {
            return;
        }
        linkedHashSet.add(bq6Var);
        if (!this.f185514b || (aq6Var = this.f185515c) == null) {
            return;
        }
        bq6Var.mo30184b(aq6Var);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: c */
    public final void mo33596c(aq6 aq6Var) {
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: e */
    public final void mo33598e(aq6 aq6Var) {
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: j */
    public final void mo33602j(aq6 aq6Var, xpi0 xpi0Var) {
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: g */
    public final void mo33599g(int i, Float f, Float f2, float f3) {
    }
}
