package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y8x0 extends ibk {

    /* JADX INFO: renamed from: a */
    public z8x0 f270406a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f270407b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z8x0 f270408c;

    /* JADX INFO: renamed from: d */
    public int f270409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8x0(z8x0 z8x0Var, ibk ibkVar) {
        super(ibkVar);
        this.f270408c = z8x0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f270407b = obj;
        this.f270409d |= Integer.MIN_VALUE;
        return this.f270408c.m95612e(this);
    }
}
