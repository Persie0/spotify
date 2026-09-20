package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pnq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f179479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n90 f179480b;

    /* JADX INFO: renamed from: c */
    public int f179481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnq(n90 n90Var, ibk ibkVar) {
        super(ibkVar);
        this.f179480b = n90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f179479a = obj;
        this.f179481c |= Integer.MIN_VALUE;
        return this.f179480b.m63871e(null, this);
    }
}
