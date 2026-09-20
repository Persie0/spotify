package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xe41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ye41 f260633b;

    /* JADX INFO: renamed from: c */
    public int f260634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe41(ye41 ye41Var, ibk ibkVar) {
        super(ibkVar);
        this.f260633b = ye41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260632a = obj;
        this.f260634c |= Integer.MIN_VALUE;
        Object objM93525a = this.f260633b.m93525a(null, this);
        return objM93525a == yuk.f276404a ? objM93525a : new s6x0(objM93525a);
    }
}
