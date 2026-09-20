package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class tx70 implements bfe0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f224588b = 1;

    /* JADX INFO: renamed from: c */
    public final Object f224589c;

    public tx70(bfe0 bfe0Var) {
        this.f224589c = bfe0Var;
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: a */
    public Collection mo27568a(qti0 qti0Var, pkj0 pkj0Var) {
        switch (this.f224588b) {
            case 1:
                return seg1.m77916h(m81884k(qti0Var, pkj0Var), sn91.f210858b);
            default:
                return m81884k(qti0Var, pkj0Var);
        }
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: b */
    public final Set mo25810b() {
        return m81885l().mo25810b();
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: c */
    public Collection mo27569c(qti0 qti0Var, pkj0 pkj0Var) {
        switch (this.f224588b) {
            case 1:
                return seg1.m77916h(m81883j(qti0Var, pkj0Var), hrl0.f94474c1);
            default:
                return m81883j(qti0Var, pkj0Var);
        }
    }

    @Override // p204p.oyw0
    /* JADX INFO: renamed from: d */
    public Collection mo27570d(exq exqVar, gh00 gh00Var) {
        switch (this.f224588b) {
            case 1:
                Collection collectionM81882i = m81882i(exqVar, gh00Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionM81882i) {
                    if (((oqo) obj) instanceof cab) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return g6f.m43700N0(arrayList2, seg1.m77916h(arrayList, sn91.f210859c));
            default:
                return m81882i(exqVar, gh00Var);
        }
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: e */
    public final Set mo25811e() {
        return m81885l().mo25811e();
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: f */
    public final Set mo25812f() {
        return m81885l().mo25812f();
    }

    @Override // p204p.oyw0
    /* JADX INFO: renamed from: g */
    public final qge mo27571g(qti0 qti0Var, pkj0 pkj0Var) {
        return m81885l().mo27571g(qti0Var, pkj0Var);
    }

    /* JADX INFO: renamed from: h */
    public final bfe0 m81881h() {
        return m81885l() instanceof tx70 ? ((tx70) m81885l()).m81881h() : m81885l();
    }

    /* JADX INFO: renamed from: i */
    public final Collection m81882i(exq exqVar, gh00 gh00Var) {
        return m81885l().mo27570d(exqVar, gh00Var);
    }

    /* JADX INFO: renamed from: j */
    public final Collection m81883j(qti0 qti0Var, pkj0 pkj0Var) {
        return m81885l().mo27569c(qti0Var, pkj0Var);
    }

    /* JADX INFO: renamed from: k */
    public final Collection m81884k(qti0 qti0Var, pkj0 pkj0Var) {
        return m81885l().mo27568a(qti0Var, pkj0Var);
    }

    /* JADX INFO: renamed from: l */
    public final bfe0 m81885l() {
        switch (this.f224588b) {
            case 0:
                return (bfe0) ((yma0) this.f224589c).invoke();
            default:
                return (bfe0) this.f224589c;
        }
    }

    public tx70(y751 y751Var, eh00 eh00Var) {
        kyq kyqVar = new kyq(1, eh00Var);
        bna0 bna0Var = (bna0) y751Var;
        bna0Var.getClass();
        this.f224589c = new yma0(bna0Var, kyqVar);
    }
}
