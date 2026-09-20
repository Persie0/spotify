package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class syw0 extends AbstractC2156n9 {
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX INFO: renamed from: n */
    public final boolean m79717n(u790 u790Var) {
        C1929h9 c1929h9;
        Object obj = this.f151670a;
        if (obj != null) {
            if (obj instanceof C1852f9) {
                u790Var.cancel(((C1852f9) obj).f67131a);
            }
        } else if (u790Var.isDone()) {
            if (AbstractC2156n9.f151668f.mo52721o(this, null, AbstractC2156n9.m63864h(u790Var))) {
                AbstractC2156n9.m63861e(this);
                return true;
            }
        } else {
            RunnableC2044k9 runnableC2044k9 = new RunnableC2044k9(this, u790Var);
            if (AbstractC2156n9.f151668f.mo52721o(this, null, runnableC2044k9)) {
                try {
                    u790Var.mo28322a(runnableC2044k9, akr.f16626a);
                    return true;
                } catch (Throwable th) {
                    try {
                        c1929h9 = new C1929h9(th);
                    } catch (Throwable unused) {
                        c1929h9 = C1929h9.f88841b;
                    }
                    AbstractC2156n9.f151668f.mo52721o(this, runnableC2044k9, c1929h9);
                    return true;
                }
            }
            obj = this.f151670a;
            if (obj instanceof C1852f9) {
                u790Var.cancel(((C1852f9) obj).f67131a);
            }
        }
        return false;
    }
}
