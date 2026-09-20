package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xuc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266075a;

    /* JADX INFO: renamed from: b */
    public int f266076b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yuc0 f266077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuc0(yuc0 yuc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f266077c = yuc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266075a = obj;
        this.f266076b |= Integer.MIN_VALUE;
        return this.f266077c.mo15629a(null, null, this);
    }
}
