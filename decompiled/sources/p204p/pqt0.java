package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pqt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180422a;

    /* JADX INFO: renamed from: b */
    public int f180423b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f180424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqt0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f180424c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180422a = obj;
        this.f180423b |= Integer.MIN_VALUE;
        return this.f180424c.emit(null, this);
    }
}
