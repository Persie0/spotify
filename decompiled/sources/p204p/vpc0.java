package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vpc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f243655a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f243656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lk20 f243657c;

    /* JADX INFO: renamed from: d */
    public int f243658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpc0(lk20 lk20Var, ibk ibkVar) {
        super(ibkVar);
        this.f243657c = lk20Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243656b = obj;
        this.f243658d |= Integer.MIN_VALUE;
        return this.f243657c.m59205e(null, null, null, null, this);
    }
}
