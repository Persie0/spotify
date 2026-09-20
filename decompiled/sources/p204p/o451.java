package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o451 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f161561a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t451 f161562b;

    /* JADX INFO: renamed from: c */
    public int f161563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o451(t451 t451Var, ibk ibkVar) {
        super(ibkVar);
        this.f161562b = t451Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161561a = obj;
        this.f161563c |= Integer.MIN_VALUE;
        return this.f161562b.m80036f(null, null, 0, null, this);
    }
}
