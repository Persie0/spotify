package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lg51 extends ibk {

    /* JADX INFO: renamed from: a */
    public e2r f133092a;

    /* JADX INFO: renamed from: b */
    public String f133093b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f133094c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vr11 f133095d;

    /* JADX INFO: renamed from: e */
    public int f133096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg51(vr11 vr11Var, ibk ibkVar) {
        super(ibkVar);
        this.f133095d = vr11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133094c = obj;
        this.f133096e |= Integer.MIN_VALUE;
        return this.f133095d.mo28227l(null, this);
    }
}
