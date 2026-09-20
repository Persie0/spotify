package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class y6j0 implements dj70 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f269863a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public ocm0 f269864b;

    @Override // p204p.dj70
    /* JADX INFO: renamed from: a */
    public final ocm0 mo32928a(aey0 aey0Var) {
        ocm0 ocm0Var;
        synchronized (this) {
            try {
                ocm0Var = aey0Var == null ? this.f269864b : (ocm0) this.f269863a.get(aey0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ocm0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m92957b(aey0 aey0Var, ocm0 ocm0Var) {
        synchronized (this) {
            this.f269863a.put(aey0Var, ocm0Var);
            this.f269864b = ocm0Var;
        }
    }
}
