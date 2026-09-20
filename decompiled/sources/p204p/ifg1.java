package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ifg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f101763a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ egg1 f101764b;

    /* JADX INFO: renamed from: c */
    public int f101765c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifg1(egg1 egg1Var, ibk ibkVar) {
        super(ibkVar);
        this.f101764b = egg1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f101763a = obj;
        this.f101765c |= Integer.MIN_VALUE;
        Object objM38870a = this.f101764b.m38870a(null, 0L, this);
        return objM38870a == yuk.f276404a ? objM38870a : new s6x0(objM38870a);
    }
}
