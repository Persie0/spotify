package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mod1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145653a;

    /* JADX INFO: renamed from: b */
    public int f145654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nod1 f145655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mod1(nod1 nod1Var, ibk ibkVar) {
        super(ibkVar);
        this.f145655c = nod1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145653a = obj;
        this.f145654b |= Integer.MIN_VALUE;
        return this.f145655c.mo15629a(null, null, this);
    }
}
