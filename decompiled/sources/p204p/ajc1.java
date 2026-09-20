package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ajc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public sr4 f16240a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16241b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fjc1 f16242c;

    /* JADX INFO: renamed from: d */
    public int f16243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajc1(fjc1 fjc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f16242c = fjc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16241b = obj;
        this.f16243d |= Integer.MIN_VALUE;
        return fjc1.m41799a(this.f16242c, null, null, this);
    }
}
