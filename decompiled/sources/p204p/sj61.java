package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sj61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f209762a;

    /* JADX INFO: renamed from: b */
    public int f209763b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tj61 f209764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj61(tj61 tj61Var, ibk ibkVar) {
        super(ibkVar);
        this.f209764c = tj61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209762a = obj;
        this.f209763b |= Integer.MIN_VALUE;
        return this.f209764c.mo15629a(null, null, this);
    }
}
