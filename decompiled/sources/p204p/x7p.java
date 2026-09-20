package p204p;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class x7p implements ssi {

    /* JADX INFO: renamed from: a */
    public final er70 f258956a;

    /* JADX INFO: renamed from: b */
    public final er70 f258957b;

    /* JADX INFO: renamed from: c */
    public final gfz f258958c;

    /* JADX INFO: renamed from: d */
    public final luk f258959d;

    /* JADX INFO: renamed from: e */
    public xuk f258960e;

    /* JADX INFO: renamed from: f */
    public final zv41 f258961f;

    /* JADX INFO: renamed from: g */
    public final zv41 f258962g;

    /* JADX INFO: renamed from: h */
    public final nuu0 f258963h;

    /* JADX INFO: renamed from: i */
    public final nuu0 f258964i;

    public x7p(er70 er70Var, er70 er70Var2, gfz gfzVar, luk lukVar) {
        this.f258956a = er70Var;
        this.f258957b = er70Var2;
        this.f258958c = gfzVar;
        this.f258959d = lukVar;
        this.f258960e = dq60.m36621u(lukVar);
        zv41 zv41VarM52819d = jag1.m52819d(Boolean.FALSE);
        this.f258961f = zv41VarM52819d;
        zv41 zv41VarM52819d2 = jag1.m52819d(lau.f131415a);
        this.f258962g = zv41VarM52819d2;
        this.f258963h = bzf1.m31021m(zv41VarM52819d);
        this.f258964i = bzf1.m31021m(zv41VarM52819d2);
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        if (this.f258958c.isEnabled()) {
            kk40.m56680v(this.f258960e, null);
        }
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        if (this.f258958c.isEnabled()) {
            xuk xukVarM37073v = dv9.m37073v(this.f258960e, new b8b(this, 22));
            this.f258960e = xukVarM37073v;
            x0h1.m89578u(xukVarM37073v, null, 0, new xuo(this, null, 9), 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m90159c(boolean z, axi axiVar) {
        axiVar.toString();
        zv41 zv41Var = this.f258962g;
        ArrayList arrayList = new ArrayList((Collection) zv41Var.getValue());
        if (z) {
            arrayList.remove(axiVar);
            arrayList.add(0, axiVar);
        } else {
            arrayList.remove(axiVar);
        }
        zv41Var.getClass();
        zv41Var.m97091m(null, arrayList);
    }
}
