package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j6m implements uz60 {

    /* JADX INFO: renamed from: a */
    public final luk f109355a;

    /* JADX INFO: renamed from: b */
    public x5m f109356b;

    /* JADX INFO: renamed from: c */
    public final owz0 f109357c;

    /* JADX INFO: renamed from: d */
    public final t6x0 f109358d;

    public j6m(w5m w5mVar, h0p h0pVar, luk lukVar, String str, gh00 gh00Var) {
        this.f109355a = lukVar;
        t6x0 t6x0Var = t6x0.f217619L0;
        this.f109357c = bkg1.m29699q(lukVar, new pek(this, w5mVar, str, gh00Var), new r2m(this, (fbk) null, 1));
        this.f109358d = t6x0Var;
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: b */
    public final Map mo28093b(Set set) {
        return this.f109357c.mo28093b(set);
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: c */
    public final tz60 mo28094c(gh00 gh00Var) {
        return this.f109357c.mo28094c(gh00Var);
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: d */
    public final tn61 mo28095d() {
        return this.f109358d;
    }
}
