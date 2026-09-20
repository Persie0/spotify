package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fwn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f74105a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gwn0 f74106b;

    /* JADX INFO: renamed from: c */
    public int f74107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwn0(gwn0 gwn0Var, ibk ibkVar) {
        super(ibkVar);
        this.f74106b = gwn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f74105a = obj;
        this.f74107c |= Integer.MIN_VALUE;
        Object objM45972a = this.f74106b.m45972a(this);
        return objM45972a == yuk.f276404a ? objM45972a : new s6x0(objM45972a);
    }
}
