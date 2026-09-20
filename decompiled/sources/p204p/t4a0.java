package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t4a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u4a0 f216956b;

    /* JADX INFO: renamed from: c */
    public int f216957c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4a0(u4a0 u4a0Var, ibk ibkVar) {
        super(ibkVar);
        this.f216956b = u4a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216955a = obj;
        this.f216957c |= Integer.MIN_VALUE;
        Object objM82320c = u4a0.m82320c(this.f216956b, null, this);
        return objM82320c == yuk.f276404a ? objM82320c : new s6x0(objM82320c);
    }
}
