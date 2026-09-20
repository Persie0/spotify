package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ktg1 extends AbstractC1806e9 {

    /* JADX INFO: renamed from: c */
    public final c8g0 f126292c;

    public ktg1(c8g0 c8g0Var) {
        super(11);
        this.f126292c = c8g0Var;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: L0 */
    public final Object mo38153L0(Object obj) {
        ed71 ed71Var = (ed71) ((fd71) obj);
        x4h1 x4h1VarM63744t = n5h1.m63744t(ed71Var.m38518c());
        Context contextM31789b = this.f126292c.m31789b();
        vj10.f241854b.getClass();
        return new gd71(x4h1VarM63744t, (wo10.m88616b(contextM31789b) >= 204700000 || ed71Var.m38517b()) ? new prf1(contextM31789b, ed71Var, x4h1VarM63744t) : new s831(contextM31789b), ed71Var);
    }
}
