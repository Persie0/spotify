package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k2p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f118681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n2p0 f118682b;

    /* JADX INFO: renamed from: c */
    public int f118683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2p0(n2p0 n2p0Var, ibk ibkVar) {
        super(ibkVar);
        this.f118682b = n2p0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118681a = obj;
        this.f118683c |= Integer.MIN_VALUE;
        return this.f118682b.m63566a(null, this);
    }
}
