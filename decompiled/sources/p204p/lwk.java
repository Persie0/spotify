package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lwk implements jwk {

    /* JADX INFO: renamed from: a */
    public final zbf0 f137591a;

    /* JADX INFO: renamed from: b */
    public final kcf0 f137592b;

    public lwk(zbf0 zbf0Var, kcf0 kcf0Var) {
        this.f137591a = zbf0Var;
        this.f137592b = kcf0Var;
    }

    @Override // p204p.jwk
    public final void increment(double d) {
        if (d <= 0.0d) {
            return;
        }
        kcf0 kcf0Var = this.f137592b;
        String str = this.f137591a.f281315a;
        long jLongValue = ((Number) kcf0Var.f121465a.invoke()).longValue();
        synchronized (kcf0Var.f121476l) {
            kcf0Var.m56048h(str, d, Long.valueOf(jLongValue));
        }
    }
}
