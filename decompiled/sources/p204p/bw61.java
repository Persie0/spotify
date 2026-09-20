package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bw61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31566a;

    /* JADX INFO: renamed from: b */
    public int f31567b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cw61 f31568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw61(cw61 cw61Var, ibk ibkVar) {
        super(ibkVar);
        this.f31568c = cw61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31566a = obj;
        this.f31567b |= Integer.MIN_VALUE;
        return this.f31568c.mo15629a(null, null, this);
    }
}
