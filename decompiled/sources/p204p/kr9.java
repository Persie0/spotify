package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kr9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125583a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lr9 f125584b;

    /* JADX INFO: renamed from: c */
    public int f125585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr9(lr9 lr9Var, ibk ibkVar) {
        super(ibkVar);
        this.f125584b = lr9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125583a = obj;
        this.f125585c |= Integer.MIN_VALUE;
        return this.f125584b.m59788b(null, this);
    }
}
