package p204p;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ffx implements p450 {

    /* JADX INFO: renamed from: a */
    public final jqz f69111a;

    /* JADX INFO: renamed from: b */
    public final boolean f69112b;

    /* JADX INFO: renamed from: c */
    public final wg61 f69113c;

    /* JADX INFO: renamed from: d */
    public final wg61 f69114d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f69115e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f69116f = new AtomicReference(null);

    /* JADX INFO: renamed from: g */
    public final c9k f69117g;

    public ffx(eh00 eh00Var, z42 z42Var, jqz jqzVar, luk lukVar, boolean z) {
        this.f69111a = jqzVar;
        this.f69112b = z;
        this.f69113c = new wg61(new t2w(15, eh00Var));
        this.f69114d = new wg61(new zyv(z42Var, 12));
        this.f69117g = kk40.m56661c(lukVar);
    }

    /* JADX INFO: renamed from: a */
    public final t9p0 m41556a() {
        t9p0 t9p0Var;
        boolean z = this.f69112b;
        wg61 wg61Var = this.f69114d;
        if (z) {
            return (t9p0) wg61Var.getValue();
        }
        r7i0 r7i0Var = (r7i0) this.f69113c.getValue();
        if (r7i0Var == null || (t9p0Var = (t9p0) wg61Var.getValue()) == null) {
            return null;
        }
        return new cfx(this, r7i0Var, t9p0Var);
    }

    @Override // p204p.p450
    public final void dispose() {
        kk40.m56680v(this.f69117g, null);
        this.f69115e.clear();
    }

    @Override // p204p.p450
    public final void start() {
        r7i0 r7i0Var = (r7i0) this.f69113c.getValue();
        if (r7i0Var == null || this.f69112b) {
            return;
        }
        x0h1.m89578u(this.f69117g, null, 0, new lzr(this, r7i0Var, (fbk) null, 29), 3);
    }
}
