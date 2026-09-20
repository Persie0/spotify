package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f257808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z3g0 f257809b;

    /* JADX INFO: renamed from: c */
    public int f257810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3g0(z3g0 z3g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f257809b = z3g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257808a = obj;
        this.f257810c |= Integer.MIN_VALUE;
        Object objM95280e = this.f257809b.m95280e(null, this, false);
        return objM95280e == yuk.f276404a ? objM95280e : new s6x0(objM95280e);
    }
}
