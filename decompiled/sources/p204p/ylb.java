package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ylb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f273970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lmb f273971b;

    /* JADX INFO: renamed from: c */
    public int f273972c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f273971b = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273970a = obj;
        this.f273972c |= Integer.MIN_VALUE;
        return this.f273971b.m59339p(0, null, this);
    }
}
