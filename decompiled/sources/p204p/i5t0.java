package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i5t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99020a;

    /* JADX INFO: renamed from: b */
    public int f99021b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f99022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5t0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f99022c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99020a = obj;
        this.f99021b |= Integer.MIN_VALUE;
        return this.f99022c.emit(null, this);
    }
}
