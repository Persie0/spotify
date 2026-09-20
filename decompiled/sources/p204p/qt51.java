package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qt51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f192299a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dz31 f192300b;

    /* JADX INFO: renamed from: c */
    public int f192301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt51(dz31 dz31Var, ibk ibkVar) {
        super(ibkVar);
        this.f192300b = dz31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192299a = obj;
        this.f192301c |= Integer.MIN_VALUE;
        Object objM37399d = this.f192300b.m37399d(this);
        return objM37399d == yuk.f276404a ? objM37399d : new s6x0(objM37399d);
    }
}
