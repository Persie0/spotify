package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i8s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public gh00 f99834a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f99835b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pnq0 f99836c;

    /* JADX INFO: renamed from: d */
    public int f99837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8s0(pnq0 pnq0Var, ibk ibkVar) {
        super(ibkVar);
        this.f99836c = pnq0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99835b = obj;
        this.f99837d |= Integer.MIN_VALUE;
        return this.f99836c.m70450c(null, this);
    }
}
