package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class s301 {

    /* JADX INFO: renamed from: a */
    public final szb0 f205149a;

    /* JADX INFO: renamed from: b */
    public final Object f205150b = new Object();

    /* JADX INFO: renamed from: c */
    public r301 f205151c;

    public s301(szb0 szb0Var) {
        this.f205149a = szb0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m77113a(r301 r301Var, Exception exc, String str) {
        synchronized (this.f205150b) {
            try {
                r301 r301Var2 = this.f205151c;
                if ((r301Var2 != null ? r301Var2.f195398a : null) == r301Var.f195398a) {
                    r301Var.f195400c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (exc == null) {
            na6.m63971s(str);
        } else {
            na6.m63972t(str, exc);
        }
        try {
            vg0 vg0Var = r301Var.f195399b;
            vg0Var.f241076a.mo39318D();
            vg0Var.m85388a();
        } catch (Exception e) {
            na6.m63972t("Session UI recovery failed", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final b5y0 m77114b(vg0 vg0Var) {
        Object obj = new Object();
        synchronized (this.f205150b) {
            this.f205151c = new r301(obj, vg0Var);
        }
        return new b5y0(7, this, obj);
    }
}
