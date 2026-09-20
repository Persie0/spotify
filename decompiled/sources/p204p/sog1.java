package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sog1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f211191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sqe1 f211192b;

    /* JADX INFO: renamed from: c */
    public int f211193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sog1(sqe1 sqe1Var, ibk ibkVar) {
        super(ibkVar);
        this.f211192b = sqe1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f211191a = obj;
        this.f211193c |= Integer.MIN_VALUE;
        return this.f211192b.m78951f(null, this);
    }
}
