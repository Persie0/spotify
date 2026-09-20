package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class b3p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d3p0 f23093b;

    /* JADX INFO: renamed from: c */
    public int f23094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3p0(d3p0 d3p0Var, ibk ibkVar) {
        super(ibkVar);
        this.f23093b = d3p0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23092a = obj;
        this.f23094c |= Integer.MIN_VALUE;
        return this.f23093b.m34888a(this);
    }
}
