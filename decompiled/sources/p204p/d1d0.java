package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d1d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f44237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h1d0 f44238b;

    /* JADX INFO: renamed from: c */
    public int f44239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1d0(h1d0 h1d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f44238b = h1d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f44237a = obj;
        this.f44239c |= Integer.MIN_VALUE;
        Object objM46424h = this.f44238b.m46424h(this);
        return objM46424h == yuk.f276404a ? objM46424h : new s6x0(objM46424h);
    }
}
