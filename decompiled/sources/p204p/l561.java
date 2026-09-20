package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class l561 implements j561 {

    /* JADX INFO: renamed from: d */
    public static final j77 f129838d = new j77(9);

    /* JADX INFO: renamed from: a */
    public final Object f129839a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile j561 f129840b;

    /* JADX INFO: renamed from: c */
    public Object f129841c;

    public l561(j561 j561Var) {
        this.f129840b = j561Var;
    }

    @Override // p204p.j561
    public final Object get() {
        j561 j561Var = this.f129840b;
        j77 j77Var = f129838d;
        if (j561Var != j77Var) {
            synchronized (this.f129839a) {
                try {
                    if (this.f129840b != j77Var) {
                        Object obj = this.f129840b.get();
                        this.f129841c = obj;
                        this.f129840b = j77Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f129841c;
    }

    public final String toString() {
        Object objM38568q = this.f129840b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (objM38568q == f129838d) {
            objM38568q = edb.m38568q(new StringBuilder("<supplier that returned "), this.f129841c, ">");
        }
        return edb.m38568q(sb, objM38568q, ")");
    }
}
