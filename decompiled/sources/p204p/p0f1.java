package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class p0f1 implements x0f1 {

    /* JADX INFO: renamed from: c */
    public static final Object f172668c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile r0f1 f172669a;

    /* JADX INFO: renamed from: b */
    public volatile Object f172670b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static p0f1 m68696b(r0f1 r0f1Var) {
        if (r0f1Var instanceof p0f1) {
            return (p0f1) r0f1Var;
        }
        p0f1 p0f1Var = new p0f1();
        p0f1Var.f172670b = f172668c;
        p0f1Var.f172669a = r0f1Var;
        return p0f1Var;
    }

    @Override // p204p.x0f1
    /* JADX INFO: renamed from: a */
    public final Object mo49415a() {
        Object objMo49415a;
        Object obj = this.f172670b;
        Object obj2 = f172668c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objMo49415a = this.f172670b;
                if (objMo49415a == obj2) {
                    objMo49415a = this.f172669a.mo49415a();
                    Object obj3 = this.f172670b;
                    if (obj3 != obj2 && obj3 != objMo49415a) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo49415a + ". This is likely due to a circular dependency.");
                    }
                    this.f172670b = objMo49415a;
                    this.f172669a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objMo49415a;
    }
}
