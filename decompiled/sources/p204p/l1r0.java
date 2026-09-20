package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l1r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f128775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n1r0 f128776b;

    /* JADX INFO: renamed from: c */
    public int f128777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1r0(n1r0 n1r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f128776b = n1r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128775a = obj;
        this.f128777c |= Integer.MIN_VALUE;
        Object objM63519k = n1r0.m63519k(this.f128776b, this);
        return objM63519k == yuk.f276404a ? objM63519k : new s6x0(objM63519k);
    }
}
