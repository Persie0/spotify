package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h5t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87898a;

    /* JADX INFO: renamed from: b */
    public int f87899b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f87900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5t0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f87900c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87898a = obj;
        this.f87899b |= Integer.MIN_VALUE;
        return this.f87900c.emit(null, this);
    }
}
