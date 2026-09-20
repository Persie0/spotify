package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uhv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f230536a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vaj0 f230537b;

    /* JADX INFO: renamed from: c */
    public int f230538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhv0(vaj0 vaj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f230537b = vaj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f230536a = obj;
        this.f230538c |= Integer.MIN_VALUE;
        return this.f230537b.m85087e(null, this);
    }
}
