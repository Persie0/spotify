package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fmz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f71134a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jmz0 f71135b;

    /* JADX INFO: renamed from: c */
    public int f71136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmz0(jmz0 jmz0Var, ibk ibkVar) {
        super(ibkVar);
        this.f71135b = jmz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71134a = obj;
        this.f71136c |= Integer.MIN_VALUE;
        return jmz0.m53803k(this.f71135b, this);
    }
}
