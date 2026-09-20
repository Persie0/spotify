package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class df90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ef90 f48530b;

    /* JADX INFO: renamed from: c */
    public int f48531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df90(ef90 ef90Var, ibk ibkVar) {
        super(ibkVar);
        this.f48530b = ef90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f48529a = obj;
        this.f48531c |= Integer.MIN_VALUE;
        return this.f48530b.mo25628g(null, this);
    }
}
