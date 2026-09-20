package p204p;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public abstract class cfe0 implements bfe0 {
    @Override // p204p.bfe0
    /* JADX INFO: renamed from: a */
    public Collection mo27568a(qti0 qti0Var, pkj0 pkj0Var) {
        return lau.f131415a;
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: b */
    public Set mo25810b() {
        Collection collectionMo27570d = mo27570d(exq.f63830p, mxq.f148146X);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo27570d) {
            if (obj instanceof qc21) {
                linkedHashSet.add(((qc21) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: c */
    public Collection mo27569c(qti0 qti0Var, pkj0 pkj0Var) {
        return lau.f131415a;
    }

    @Override // p204p.oyw0
    /* JADX INFO: renamed from: d */
    public Collection mo27570d(exq exqVar, gh00 gh00Var) {
        return lau.f131415a;
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: e */
    public Set mo25811e() {
        return null;
    }

    @Override // p204p.bfe0
    /* JADX INFO: renamed from: f */
    public Set mo25812f() {
        Collection collectionMo27570d = mo27570d(exq.f63831q, mxq.f148146X);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo27570d) {
            if (obj instanceof qc21) {
                linkedHashSet.add(((qc21) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // p204p.oyw0
    /* JADX INFO: renamed from: g */
    public qge mo27571g(qti0 qti0Var, pkj0 pkj0Var) {
        return null;
    }
}
