package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class owj extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f170720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lwj f170721b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f170722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ owj(lwj lwjVar, kqi0 kqi0Var, int i) {
        super(1);
        this.f170720a = i;
        this.f170721b = lwjVar;
        this.f170722c = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f170720a) {
            case 0:
                lwj lwjVar = this.f170721b;
                lwjVar.f137583e.invoke(new jwj(((exj) obj).f63783a));
                eh00 eh00Var = lwjVar.f137584f;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                this.f170722c.setValue(Boolean.TRUE);
                break;
            default:
                lwj lwjVar2 = this.f170721b;
                lwjVar2.f137583e.invoke(new jwj(((exj) obj).f63783a));
                eh00 eh00Var2 = lwjVar2.f137584f;
                if (eh00Var2 != null) {
                    eh00Var2.invoke();
                }
                this.f170722c.setValue(Boolean.TRUE);
                break;
        }
        return w2a1.f247311a;
    }
}
