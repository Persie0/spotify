package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class crg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public lsi0 f41294a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f41295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g7d1 f41296c;

    /* JADX INFO: renamed from: d */
    public int f41297d;

    /* JADX INFO: renamed from: e */
    public String f41298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crg1(g7d1 g7d1Var, ibk ibkVar) {
        super(ibkVar);
        this.f41296c = g7d1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41295b = obj;
        this.f41297d |= Integer.MIN_VALUE;
        return this.f41296c.mo31436c(null, this);
    }
}
