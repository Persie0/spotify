package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q691 {

    /* JADX INFO: renamed from: a */
    public final tm91 f185709a;

    /* JADX INFO: renamed from: b */
    public final yum0 f185710b = sam.m77645B(null);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c791 f185711c;

    public q691(c791 c791Var, tm91 tm91Var, String str) {
        this.f185711c = c791Var;
        this.f185709a = tm91Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final p691 m72224a(gh00 gh00Var, gh00 gh00Var2) {
        p691 p691VarM72225b = m72225b();
        c791 c791Var = this.f185711c;
        if (p691VarM72225b == null) {
            Object objInvoke = gh00Var2.invoke(c791Var.f34827a.mo38160Z0());
            Object objInvoke2 = gh00Var2.invoke(c791Var.f34827a.mo38160Z0());
            tm91 tm91Var = this.f185709a;
            w691 w691Var = new w691(c791Var, objInvoke, el51.m39342l(tm91Var, objInvoke2), tm91Var);
            p691VarM72225b = new p691(this, w691Var, gh00Var, gh00Var2);
            this.f185710b.setValue(p691VarM72225b);
            c791Var.f34835i.add(w691Var);
        }
        p691VarM72225b.f174329c = (qe70) gh00Var2;
        p691VarM72225b.f174328b = gh00Var;
        p691VarM72225b.m69194a(c791Var.m31692f());
        return p691VarM72225b;
    }

    /* JADX INFO: renamed from: b */
    public final p691 m72225b() {
        return (p691) this.f185710b.getValue();
    }
}
