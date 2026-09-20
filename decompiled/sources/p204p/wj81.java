package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wj81 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f251905a;

    /* JADX INFO: renamed from: b */
    public boolean f251906b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f251907c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xj81 f251908d;

    /* JADX INFO: renamed from: e */
    public int f251909e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj81(xj81 xj81Var, ibk ibkVar) {
        super(ibkVar);
        this.f251908d = xj81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f251907c = obj;
        this.f251909e |= Integer.MIN_VALUE;
        return this.f251908d.m91209a(null, null, this, false);
    }
}
