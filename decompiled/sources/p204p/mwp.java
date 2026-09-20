package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class mwp implements pol0 {

    /* JADX INFO: renamed from: a */
    public final Map f147838a;

    public mwp(xf40 xf40Var) {
        this.f147838a = xf40Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        pol0 pol0Var;
        fhe0 fhe0Var = (fhe0) obj;
        ehe0 ehe0Var = fhe0Var.f69640a;
        if (ehe0Var != ehe0.f59576t && (pol0Var = (pol0) this.f147838a.get(ehe0Var)) != null) {
            pol0Var.invoke(fhe0Var);
        }
        return w2a1.f247311a;
    }
}
