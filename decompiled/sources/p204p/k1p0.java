package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class k1p0 {

    /* JADX INFO: renamed from: a */
    public final zv41 f118405a;

    /* JADX INFO: renamed from: b */
    public final zv41 f118406b;

    public k1p0(xre xreVar) {
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f118405a = zv41VarM52819d;
        this.f118406b = zv41VarM52819d;
    }

    /* JADX INFO: renamed from: a */
    public final Long m55119a() {
        i1p0 i1p0Var = (i1p0) this.f118406b.getValue();
        if (i1p0Var == null) {
            return null;
        }
        long jCurrentTimeMillis = i1p0Var.f97561b;
        if (i1p0Var.f97560a) {
            jCurrentTimeMillis = (long) (((System.currentTimeMillis() - i1p0Var.f97564e) * i1p0Var.f97565f) + jCurrentTimeMillis);
        }
        return Long.valueOf(jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: b */
    public final void m55120b(i1p0 i1p0Var) {
        this.f118405a.m97090l(i1p0Var);
    }
}
