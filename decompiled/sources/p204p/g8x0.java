package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g8x0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h8x0 f77621b;

    /* JADX INFO: renamed from: c */
    public int f77622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8x0(h8x0 h8x0Var, ibk ibkVar) {
        super(ibkVar);
        this.f77621b = h8x0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77620a = obj;
        this.f77622c |= Integer.MIN_VALUE;
        return this.f77621b.m46857c(null, this);
    }
}
