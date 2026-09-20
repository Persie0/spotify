package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class b2s implements h4t0, er70 {

    /* JADX INFO: renamed from: c */
    public static final Object f22684c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile h4t0 f22685a;

    /* JADX INFO: renamed from: b */
    public volatile Object f22686b = f22684c;

    public b2s(h4t0 h4t0Var) {
        this.f22685a = h4t0Var;
    }

    /* JADX INFO: renamed from: a */
    public static er70 m27971a(h4t0 h4t0Var) {
        if (h4t0Var instanceof er70) {
            return (er70) h4t0Var;
        }
        jg31.m53268f(h4t0Var);
        return new b2s(h4t0Var);
    }

    /* JADX INFO: renamed from: b */
    public static h4t0 m27972b(h4t0 h4t0Var) {
        jg31.m53268f(h4t0Var);
        return h4t0Var instanceof b2s ? h4t0Var : new b2s(h4t0Var);
    }

    @Override // p204p.i4t0
    public final Object get() {
        Object obj;
        Object obj2 = this.f22686b;
        Object obj3 = f22684c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f22686b;
            if (obj == obj3) {
                obj = this.f22685a.get();
                Object obj4 = this.f22686b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f22686b = obj;
                this.f22685a = null;
            }
        }
        return obj;
    }
}
