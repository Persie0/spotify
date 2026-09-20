package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wfa0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f250773a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yfa0 f250774b;

    /* JADX INFO: renamed from: c */
    public int f250775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfa0(yfa0 yfa0Var, ibk ibkVar) {
        super(ibkVar);
        this.f250774b = yfa0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250773a = obj;
        this.f250775c |= Integer.MIN_VALUE;
        Object objM93550a = this.f250774b.m93550a(this);
        return objM93550a == yuk.f276404a ? objM93550a : new s6x0(objM93550a);
    }
}
