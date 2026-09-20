package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class emb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lmb f60864b;

    /* JADX INFO: renamed from: c */
    public int f60865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f60864b = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60863a = obj;
        this.f60865c |= Integer.MIN_VALUE;
        return this.f60864b.m59345v(null, this);
    }
}
