package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i9e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q9e1 f99997b;

    /* JADX INFO: renamed from: c */
    public int f99998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9e1(q9e1 q9e1Var, ibk ibkVar) {
        super(ibkVar);
        this.f99997b = q9e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99996a = obj;
        this.f99998c |= Integer.MIN_VALUE;
        return this.f99997b.m72363c(this);
    }
}
