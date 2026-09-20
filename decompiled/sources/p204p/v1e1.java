package p204p;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class v1e1 {

    /* JADX INFO: renamed from: a */
    public final d9p f236352a;

    /* JADX INFO: renamed from: b */
    public final HashMap f236353b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f236354c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Object f236355d = new Object();

    static {
        gaz.m44194g("WorkTimer");
    }

    public v1e1(d9p d9pVar) {
        this.f236352a = d9pVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m84462a(f0e1 f0e1Var) {
        synchronized (this.f236355d) {
            try {
                if (((u1e1) this.f236353b.remove(f0e1Var)) != null) {
                    gaz gazVarM44190b = gaz.m44190b();
                    Objects.toString(f0e1Var);
                    gazVarM44190b.getClass();
                    this.f236354c.remove(f0e1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
