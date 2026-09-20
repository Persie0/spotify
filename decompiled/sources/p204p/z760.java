package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z760 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280103a;

    /* JADX INFO: renamed from: b */
    public int f280104b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a860 f280105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z760(a860 a860Var, ibk ibkVar) {
        super(ibkVar);
        this.f280105c = a860Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280103a = obj;
        this.f280104b |= Integer.MIN_VALUE;
        return this.f280105c.mo15629a(null, null, this);
    }
}
