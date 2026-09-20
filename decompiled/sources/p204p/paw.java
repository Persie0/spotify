package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class paw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qaw f175636b;

    /* JADX INFO: renamed from: c */
    public int f175637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public paw(qaw qawVar, ibk ibkVar) {
        super(ibkVar);
        this.f175636b = qawVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175635a = obj;
        this.f175637c |= Integer.MIN_VALUE;
        return this.f175636b.m72476a(null, this);
    }
}
