package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bsw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dsw0 f30412b;

    /* JADX INFO: renamed from: c */
    public int f30413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsw0(dsw0 dsw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f30412b = dsw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f30411a = obj;
        this.f30413c |= Integer.MIN_VALUE;
        return dsw0.m36783a(this.f30412b, this);
    }
}
