package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class ou40 extends cfe0 {

    /* JADX INFO: renamed from: b */
    public final bfe0 f170171b;

    public ou40(bfe0 bfe0Var) {
        this.f170171b = bfe0Var;
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: b */
    public final Set mo25810b() {
        return this.f170171b.mo25810b();
    }

    @Override // p204p.cfe0, p204p.oyw0
    /* JADX INFO: renamed from: d */
    public final Collection mo27570d(exq exqVar, gh00 gh00Var) {
        int i = exq.f63826l & exqVar.f63835b;
        exq exqVar2 = i == 0 ? null : new exq(i, exqVar.f63834a);
        if (exqVar2 == null) {
            return lau.f131415a;
        }
        Collection collectionMo27570d = this.f170171b.mo27570d(exqVar2, gh00Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo27570d) {
            if (obj instanceof rge) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: e */
    public final Set mo25811e() {
        return this.f170171b.mo25811e();
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: f */
    public final Set mo25812f() {
        return this.f170171b.mo25812f();
    }

    @Override // p204p.cfe0, p204p.oyw0
    /* JADX INFO: renamed from: g */
    public final qge mo27571g(qti0 qti0Var, pkj0 pkj0Var) {
        qge qgeVarMo27571g = this.f170171b.mo27571g(qti0Var, pkj0Var);
        if (qgeVarMo27571g != null) {
            nfe nfeVar = qgeVarMo27571g instanceof nfe ? (nfe) qgeVarMo27571g : null;
            if (nfeVar != null) {
                return nfeVar;
            }
            if (qgeVarMo27571g instanceof cn91) {
                return (cn91) qgeVarMo27571g;
            }
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.f170171b;
    }
}
