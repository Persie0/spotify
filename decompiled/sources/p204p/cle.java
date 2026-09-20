package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cle extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39264a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dle f39265b;

    /* JADX INFO: renamed from: c */
    public int f39266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cle(dle dleVar, ibk ibkVar) {
        super(ibkVar);
        this.f39265b = dleVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f39264a = obj;
        this.f39266c |= Integer.MIN_VALUE;
        return this.f39265b.mo36356b(null, this);
    }
}
