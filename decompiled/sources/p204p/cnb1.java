package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cnb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public lt0 f39936a;

    /* JADX INFO: renamed from: b */
    public pa9 f39937b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f39938c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dnb1 f39939d;

    /* JADX INFO: renamed from: e */
    public int f39940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnb1(dnb1 dnb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f39939d = dnb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f39938c = obj;
        this.f39940e |= Integer.MIN_VALUE;
        return this.f39939d.m36466c(null, this);
    }
}
