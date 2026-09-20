package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gj20 extends ibk {

    /* JADX INFO: renamed from: a */
    public xuk f80336a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f80337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jj20 f80338c;

    /* JADX INFO: renamed from: d */
    public int f80339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj20(jj20 jj20Var, ibk ibkVar) {
        super(ibkVar);
        this.f80338c = jj20Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80337b = obj;
        this.f80339d |= Integer.MIN_VALUE;
        return this.f80338c.m53492a(null, this);
    }
}
