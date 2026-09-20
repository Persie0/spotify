package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class e5t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56465a;

    /* JADX INFO: renamed from: b */
    public int f56466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f56467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5t0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f56467c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56465a = obj;
        this.f56466b |= Integer.MIN_VALUE;
        return this.f56467c.emit(null, this);
    }
}
