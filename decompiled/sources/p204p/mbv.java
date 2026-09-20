package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mbv extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t5o0 f141972a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f141973b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f141974c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ m56 f141975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbv(t5o0 t5o0Var, long j, long j2, m56 m56Var) {
        super(1);
        this.f141972a = t5o0Var;
        this.f141973b = j;
        this.f141974c = j2;
        this.f141975d = m56Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        long j = this.f141973b;
        long j2 = this.f141974c;
        ((s5o0) obj).m77295p(this.f141972a, ((int) (j >> 32)) + ((int) (j2 >> 32)), ((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)), 0.0f, this.f141975d);
        return w2a1.f247311a;
    }
}
