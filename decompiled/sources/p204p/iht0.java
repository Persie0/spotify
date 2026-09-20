package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class iht0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f102363a;

    /* JADX INFO: renamed from: b */
    public int f102364b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f102365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iht0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f102365c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102363a = obj;
        this.f102364b |= Integer.MIN_VALUE;
        return this.f102365c.emit(null, this);
    }
}
