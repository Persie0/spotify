package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fk60 implements fl51 {

    /* JADX INFO: renamed from: d */
    public static final ek60 f70476d;

    /* JADX INFO: renamed from: a */
    public final qk60 f70477a;

    /* JADX INFO: renamed from: b */
    public final i82 f70478b;

    /* JADX INFO: renamed from: c */
    public final pxq f70479c = new pxq(0);

    static {
        qk60 qk60Var = new qk60(false, false, false, false, false, true, "    ", false, "type", false, true, 3, true);
        ujg1.m83266g();
        f70476d = new ek60(qk60Var, muz0.f147459a);
    }

    public fk60(qk60 qk60Var, i82 i82Var) {
        this.f70477a = qk60Var;
        this.f70478b = i82Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m41880a(String str, rr60 rr60Var) {
        il51 il51VarM85145k = vbg1.m85145k(str, this);
        Object objMo42504Y = new hk51(this, lfe1.OBJ, il51VarM85145k, rr60Var.getDescriptor(), null).mo42504Y(rr60Var);
        il51VarM85145k.m40928u();
        return objMo42504Y;
    }

    /* JADX INFO: renamed from: b */
    public final String m41881b(rr60 rr60Var, Object obj) {
        cl8 cl8Var = new cl8(21);
        try {
            jpg1.m53934p(this, cl8Var, rr60Var, obj);
            return cl8Var.toString();
        } finally {
            cl8Var.m33232C();
        }
    }

    /* JADX INFO: renamed from: c */
    public final yk60 m41882c(String str) {
        return (yk60) m41880a(str, bl60.f28100a);
    }
}
