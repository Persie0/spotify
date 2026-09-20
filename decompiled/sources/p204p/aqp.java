package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class aqp {

    /* JADX INFO: renamed from: a */
    public final er70 f18747a;

    /* JADX INFO: renamed from: b */
    public final er70 f18748b;

    /* JADX INFO: renamed from: c */
    public final xuk f18749c;

    /* JADX INFO: renamed from: f */
    public final String f18752f;

    /* JADX INFO: renamed from: d */
    public final wg61 f18750d = new wg61(new b8b(this, 23));

    /* JADX INFO: renamed from: e */
    public final wg61 f18751e = new wg61(new wep(this, 9));

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f18753g = new LinkedHashMap();

    public aqp(er70 er70Var, er70 er70Var2, fke fkeVar, xuk xukVar) {
        this.f18747a = er70Var;
        this.f18748b = er70Var2;
        this.f18749c = xukVar;
        this.f18752f = ((edi0) fkeVar).f58523a;
    }

    /* JADX INFO: renamed from: g */
    public static void m26881g(aqp aqpVar) {
        x0h1.m89578u(aqpVar.f18749c, null, 0, new yse(aqpVar, null, 21), 3);
    }

    /* JADX INFO: renamed from: a */
    public final void m26882a(pmd0 pmd0Var, nps npsVar, int i) {
        x0h1.m89578u(this.f18749c, null, 0, new jil(this, pmd0Var, npsVar, i, (fbk) null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final qmd0 m26883b(nps npsVar, boolean z) {
        LinkedHashMap linkedHashMap = this.f18753g;
        qmd0 qmd0VarM65781q = (qmd0) linkedHashMap.get(npsVar);
        if (qmd0VarM65781q == null) {
            Objects.toString(npsVar);
            qmd0VarM65781q = nwg1.m65781q(npsVar, this, this.f18752f);
            linkedHashMap.put(npsVar, qmd0VarM65781q);
        }
        if (z) {
            Objects.toString(npsVar);
            linkedHashMap.remove(npsVar);
        }
        return qmd0VarM65781q;
    }

    /* JADX INFO: renamed from: c */
    public final zmd0 m26884c() {
        return (zmd0) this.f18750d.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m26885d() {
        m26884c();
        zmd0.m96426b();
        return q191.m71889G(this.f18752f, zmd0.m96427c().f143267i);
    }

    /* JADX INFO: renamed from: e */
    public final void m26886e(nps npsVar) {
        x0h1.m89578u(this.f18749c, null, 0, new cv0(this, npsVar, null, 3), 3);
    }

    /* JADX INFO: renamed from: f */
    public final void m26887f(ood0 ood0Var) {
        x0h1.m89578u(this.f18749c, null, 0, new qhk(this, ood0Var, null, 20), 3);
    }
}
