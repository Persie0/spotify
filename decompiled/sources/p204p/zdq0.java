package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zdq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f281779a;

    /* JADX INFO: renamed from: b */
    public int f281780b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ceq0 f281781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdq0(ceq0 ceq0Var, ibk ibkVar) {
        super(ibkVar);
        this.f281781c = ceq0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281779a = obj;
        this.f281780b |= Integer.MIN_VALUE;
        return this.f281781c.mo15629a(null, null, this);
    }
}
