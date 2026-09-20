package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class co61 implements uz60 {

    /* JADX INFO: renamed from: a */
    public final tn61 f40191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ luk f40192b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f40193c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ th00 f40194d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ th00 f40195e;

    /* JADX WARN: Multi-variable type inference failed */
    public co61(tn61 tn61Var, luk lukVar, gh00 gh00Var, th00 th00Var, th00 th00Var2) {
        this.f40192b = lukVar;
        this.f40193c = (qe70) gh00Var;
        this.f40194d = th00Var;
        this.f40195e = th00Var2;
        this.f40191a = tn61Var;
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: b */
    public final Map mo28093b(Set set) {
        return nau.f152117a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [p.gh00, p.qe70] */
    @Override // p204p.uz60
    /* JADX INFO: renamed from: c */
    public final tz60 mo28094c(gh00 gh00Var) {
        return new bo61(this.f40192b, this.f40193c, this.f40194d, gh00Var, this.f40195e);
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: d */
    public final tn61 mo28095d() {
        return this.f40191a;
    }
}
