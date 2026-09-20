package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h851 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dl21 f88636b;

    /* JADX INFO: renamed from: c */
    public int f88637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h851(dl21 dl21Var, ibk ibkVar) {
        super(ibkVar);
        this.f88636b = dl21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88635a = obj;
        this.f88637c |= Integer.MIN_VALUE;
        return this.f88636b.mo34954d(null, null, this);
    }
}
