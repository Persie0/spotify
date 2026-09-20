package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rq2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vq2 f201720b;

    /* JADX INFO: renamed from: c */
    public int f201721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq2(vq2 vq2Var, ibk ibkVar) {
        super(ibkVar);
        this.f201720b = vq2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201719a = obj;
        this.f201721c |= Integer.MIN_VALUE;
        return this.f201720b.m86183c(this);
    }
}
