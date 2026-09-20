package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xq10 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f264842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f264843b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f264844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xq10(float f, kqi0 kqi0Var, int i) {
        super(1);
        this.f264842a = i;
        this.f264843b = f;
        this.f264844c = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f264842a) {
            case 0:
                long j = ((g450) obj).f76347a;
                this.f264844c.setValue(Boolean.valueOf(((float) Math.min((int) (j >> 32), (int) (j & 4294967295L))) <= this.f264843b));
                break;
            default:
                ptl.m70999t(((db71) obj).f47231b.f279922f > 1 ? this.f264843b : 0, this.f264844c);
                break;
        }
        return w2a1.f247311a;
    }
}
