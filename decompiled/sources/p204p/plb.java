package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class plb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lmb f178687b;

    /* JADX INFO: renamed from: c */
    public int f178688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f178687b = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178686a = obj;
        this.f178688c |= Integer.MIN_VALUE;
        return this.f178687b.m59330g(null, this);
    }
}
