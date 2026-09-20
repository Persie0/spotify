package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class be21 implements h4t0 {

    /* JADX INFO: renamed from: c */
    public static final Object f26263c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile h4t0 f26264a;

    /* JADX INFO: renamed from: b */
    public volatile Object f26265b;

    /* JADX INFO: renamed from: a */
    public static h4t0 m28868a(h4t0 h4t0Var) {
        if ((h4t0Var instanceof be21) || (h4t0Var instanceof b2s)) {
            return h4t0Var;
        }
        be21 be21Var = new be21();
        be21Var.f26265b = f26263c;
        be21Var.f26264a = h4t0Var;
        return be21Var;
    }

    @Override // p204p.i4t0
    public final Object get() {
        Object obj = this.f26265b;
        if (obj != f26263c) {
            return obj;
        }
        h4t0 h4t0Var = this.f26264a;
        if (h4t0Var == null) {
            return this.f26265b;
        }
        Object obj2 = h4t0Var.get();
        this.f26265b = obj2;
        this.f26264a = null;
        return obj2;
    }
}
