package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f109189a;

    /* JADX INFO: renamed from: b */
    public int f109190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k61 f109191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j61(k61 k61Var, ibk ibkVar) {
        super(ibkVar);
        this.f109191c = k61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109189a = obj;
        this.f109190b |= Integer.MIN_VALUE;
        return this.f109191c.mo15629a(null, null, this);
    }
}
