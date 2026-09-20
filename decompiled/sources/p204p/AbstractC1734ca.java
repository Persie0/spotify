package p204p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: p.ca */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC1734ca implements jn91 {

    /* JADX INFO: renamed from: a */
    public int f35681a;

    /* JADX INFO: renamed from: b */
    public final uma0 f35682b;

    public AbstractC1734ca(y751 y751Var) {
        this.f35682b = new uma0((bna0) y751Var, new C2642z9(this, 1), new C2483v5(this, 5));
    }

    /* JADX INFO: renamed from: a */
    public abstract Collection mo31978a();

    /* JADX INFO: renamed from: b */
    public abstract gd70 mo31979b();

    /* JADX INFO: renamed from: c */
    public abstract hkr0 mo31980c();

    @Override // p204p.jn91
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final List mo25172f() {
        return ((C1697ba) this.f35682b.invoke()).f25054b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jn91) && obj.hashCode() == hashCode()) {
            jn91 jn91Var = (jn91) obj;
            if (jn91Var.mo25171e().size() == mo25171e().size()) {
                qge qgeVarMo25169G = mo25169G();
                qge qgeVarMo25169G2 = jn91Var.mo25169G();
                if (qgeVarMo25169G2 == null || ehw.m39009e(qgeVarMo25169G) || rxq.m76675m(qgeVarMo25169G) || ehw.m39009e(qgeVarMo25169G2) || rxq.m76675m(qgeVarMo25169G2)) {
                    return false;
                }
                return mo31982h(qgeVarMo25169G2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo31982h(qge qgeVar);

    public final int hashCode() {
        int i = this.f35681a;
        if (i != 0) {
            return i;
        }
        qge qgeVarMo25169G = mo25169G();
        int iIdentityHashCode = (ehw.m39009e(qgeVarMo25169G) || rxq.m76675m(qgeVarMo25169G)) ? System.identityHashCode(this) : rxq.m76668f(qgeVarMo25169G).f279080a.hashCode();
        this.f35681a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    /* JADX INFO: renamed from: i */
    public List mo31983i(List list) {
        return list;
    }
}
