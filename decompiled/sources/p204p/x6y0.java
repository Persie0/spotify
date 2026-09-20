package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x6y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f258772a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f258773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z6y0 f258774c;

    /* JADX INFO: renamed from: d */
    public int f258775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6y0(z6y0 z6y0Var, ibk ibkVar) {
        super(ibkVar);
        this.f258774c = z6y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f258773b = obj;
        this.f258775d |= Integer.MIN_VALUE;
        return z6y0.m95518e(this.f258774c, null, this);
    }
}
