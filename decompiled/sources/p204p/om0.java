package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class om0 implements dv0 {

    /* JADX INFO: renamed from: a */
    public final l3a1 f166950a;

    /* JADX INFO: renamed from: b */
    public final wm0 f166951b;

    /* JADX INFO: renamed from: c */
    public final c9k f166952c;

    public om0(l3a1 l3a1Var, wm0 wm0Var, luk lukVar) {
        this.f166950a = l3a1Var;
        this.f166951b = wm0Var;
        this.f166952c = edb.m38577z(lukVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m67310a(om0 om0Var, qm0 qm0Var, String str, Long l, String str2, String str3, int i) {
        om0Var.m67312b(qm0Var, str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, null, null, (i & 64) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m67311c(om0 om0Var, qm0 qm0Var, String str, Long l, String str2, String str3, String str4, String str5, int i) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        om0Var.m67312b(qm0Var, str, l, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: b */
    public final void m67312b(qm0 qm0Var, String str, Long l, String str2, String str3, String str4, String str5) {
        fh0 fh0Var = (fh0) this.f166950a.f129253a.get(str);
        c9k c9kVar = this.f166952c;
        if (fh0Var == null) {
            x0h1.m89578u(c9kVar, null, 0, new mm0(this, qm0Var, str, l, str2, str3, str4, str5, (fbk) null), 3);
        } else if (!fh0.f69487b1.contains(qm0Var) || fh0Var.f69503Y0.remove(qm0Var)) {
            x0h1.m89578u(c9kVar, null, 0, new nm0(this, str, str2, l, fh0Var, qm0Var, str5, (fbk) null), 3);
        }
    }

    @Override // p204p.dv0
    public final void stop() {
        qlg1.m73215t(this.f166952c.f35578a);
    }

    @Override // p204p.dv0
    public final void start() {
    }
}
