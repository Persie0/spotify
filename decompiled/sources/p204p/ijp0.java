package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ijp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f102861a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kjp0 f102862b;

    /* JADX INFO: renamed from: c */
    public int f102863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijp0(kjp0 kjp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f102862b = kjp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102861a = obj;
        this.f102863c |= Integer.MIN_VALUE;
        return kjp0.m56614d(this.f102862b, null, this);
    }
}
