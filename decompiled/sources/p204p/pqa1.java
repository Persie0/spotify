package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pqa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qqa1 f180247b;

    /* JADX INFO: renamed from: c */
    public int f180248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqa1(qqa1 qqa1Var, ibk ibkVar) {
        super(ibkVar);
        this.f180247b = qqa1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180246a = obj;
        this.f180248c |= Integer.MIN_VALUE;
        Object objM73513a = this.f180247b.m73513a(null, this);
        return objM73513a == yuk.f276404a ? objM73513a : new s6x0(objM73513a);
    }
}
