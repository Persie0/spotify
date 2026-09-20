package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a61 f226876b;

    /* JADX INFO: renamed from: c */
    public int f226877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u51(a61 a61Var, ibk ibkVar) {
        super(ibkVar);
        this.f226876b = a61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226875a = obj;
        this.f226877c |= Integer.MIN_VALUE;
        return this.f226876b.m24832d(null, null, null, null, this);
    }
}
