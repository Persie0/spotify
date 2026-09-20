package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class j3b extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f108344b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3b(int i, gh00 gh00Var) {
        super(1);
        this.f108343a = i;
        this.f108344b = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f108343a) {
            case 0:
                tgj tgjVar = (tgj) obj;
                this.f108344b.invoke(tgjVar);
                tgjVar.mo50174s1();
                return w2a1.f247311a;
            case 1:
                return new y350((((long) 0) << 32) | (4294967295L & ((long) ((Number) this.f108344b.invoke(Integer.valueOf((int) (((g450) obj).f76347a & 4294967295L)))).intValue())));
            default:
                ((Boolean) obj).booleanValue();
                this.f108344b.invoke(l3m.f129347a);
                return w2a1.f247311a;
        }
    }
}
