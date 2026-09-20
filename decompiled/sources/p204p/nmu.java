package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nmu extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f156268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f156269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmu(float f, kqi0 kqi0Var) {
        super(1);
        this.f156268a = f;
        this.f156269b = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        long j = ((g450) obj).f76347a;
        this.f156269b.setValue(Boolean.valueOf(((float) Math.min((int) (j >> 32), (int) (j & 4294967295L))) <= this.f156268a));
        return w2a1.f247311a;
    }
}
