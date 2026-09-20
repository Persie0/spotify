package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pud1 extends ibk {

    /* JADX INFO: renamed from: a */
    public sr4 f181425a;

    /* JADX INFO: renamed from: b */
    public int f181426b;

    /* JADX INFO: renamed from: c */
    public boolean f181427c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f181428d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rud1 f181429e;

    /* JADX INFO: renamed from: f */
    public int f181430f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pud1(rud1 rud1Var, ibk ibkVar) {
        super(ibkVar);
        this.f181429e = rud1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f181428d = obj;
        this.f181430f |= Integer.MIN_VALUE;
        return this.f181429e.m76449a(null, 0, this);
    }
}
