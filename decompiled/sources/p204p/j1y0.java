package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j1y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107885a;

    /* JADX INFO: renamed from: b */
    public int f107886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k1y0 f107887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1y0(k1y0 k1y0Var, fbk fbkVar) {
        super(fbkVar);
        this.f107887c = k1y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107885a = obj;
        this.f107886b |= Integer.MIN_VALUE;
        return this.f107887c.emit(null, this);
    }
}
