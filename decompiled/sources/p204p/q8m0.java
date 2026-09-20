package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186340a;

    /* JADX INFO: renamed from: b */
    public int f186341b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kre0 f186342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8m0(kre0 kre0Var, fbk fbkVar) {
        super(fbkVar);
        this.f186342c = kre0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186340a = obj;
        this.f186341b |= Integer.MIN_VALUE;
        return this.f186342c.emit(null, this);
    }
}
