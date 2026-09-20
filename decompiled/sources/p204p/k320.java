package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k320 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f118750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l320 f118751b;

    /* JADX INFO: renamed from: c */
    public int f118752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k320(l320 l320Var, ibk ibkVar) {
        super(ibkVar);
        this.f118751b = l320Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118750a = obj;
        this.f118752c |= Integer.MIN_VALUE;
        return this.f118751b.m57982c(null, null, this);
    }
}
