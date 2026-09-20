package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l6t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f130475a;

    /* JADX INFO: renamed from: b */
    public int f130476b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f130477c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6t0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f130477c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f130475a = obj;
        this.f130476b |= Integer.MIN_VALUE;
        return this.f130477c.emit(null, this);
    }
}
