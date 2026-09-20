package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rw00 implements qw00 {

    /* JADX INFO: renamed from: a */
    public final zbf0 f203171a;

    /* JADX INFO: renamed from: b */
    public final kcf0 f203172b;

    public rw00(zbf0 zbf0Var, kcf0 kcf0Var) {
        this.f203171a = zbf0Var;
        this.f203172b = kcf0Var;
    }

    @Override // p204p.qw00
    public final void record(double d) {
        kcf0 kcf0Var = this.f203172b;
        String str = this.f203171a.f281315a;
        long jLongValue = ((Number) kcf0Var.f121465a.invoke()).longValue();
        synchronized (kcf0Var.f121476l) {
            kcf0Var.m56048h(str, d, Long.valueOf(jLongValue));
        }
    }
}
