package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class brg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public lsi0 f30091a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30092b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g7d1 f30093c;

    /* JADX INFO: renamed from: d */
    public int f30094d;

    /* JADX INFO: renamed from: e */
    public String f30095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brg1(g7d1 g7d1Var, ibk ibkVar) {
        super(ibkVar);
        this.f30093c = g7d1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f30092b = obj;
        this.f30094d |= Integer.MIN_VALUE;
        return this.f30093c.m43810i(null, this);
    }
}
