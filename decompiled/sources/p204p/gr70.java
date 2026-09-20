package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gr70 implements j4t0 {

    /* JADX INFO: renamed from: c */
    public static final Object f83679c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile Object f83680a = f83679c;

    /* JADX INFO: renamed from: b */
    public volatile j4t0 f83681b;

    public gr70(j4t0 j4t0Var) {
        this.f83681b = j4t0Var;
    }

    @Override // p204p.j4t0
    public final Object get() {
        Object obj;
        Object obj2 = this.f83680a;
        Object obj3 = f83679c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f83680a;
                if (obj == obj3) {
                    obj = this.f83681b.get();
                    this.f83680a = obj;
                    this.f83681b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
