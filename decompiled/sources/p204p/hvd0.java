package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hvd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f95660a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ svd0 f95661b;

    /* JADX INFO: renamed from: c */
    public int f95662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvd0(svd0 svd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f95661b = svd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95660a = obj;
        this.f95662c |= Integer.MIN_VALUE;
        return this.f95661b.m79435m(null, null, this);
    }
}
