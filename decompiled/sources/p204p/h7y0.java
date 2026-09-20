package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h7y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j7y0 f88566b;

    /* JADX INFO: renamed from: c */
    public int f88567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7y0(j7y0 j7y0Var, ibk ibkVar) {
        super(ibkVar);
        this.f88566b = j7y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88565a = obj;
        this.f88567c |= Integer.MIN_VALUE;
        Object objM52666a = this.f88566b.m52666a(null, null, this);
        return objM52666a == yuk.f276404a ? objM52666a : new s6x0(objM52666a);
    }
}
