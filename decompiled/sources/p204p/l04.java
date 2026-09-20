package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class l04 extends ibk {

    /* JADX INFO: renamed from: a */
    public upa f128290a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f128291b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m04 f128292c;

    /* JADX INFO: renamed from: d */
    public int f128293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l04(m04 m04Var, ibk ibkVar) {
        super(ibkVar);
        this.f128292c = m04Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128291b = obj;
        this.f128293d |= Integer.MIN_VALUE;
        return this.f128292c.m60399a(this);
    }
}
