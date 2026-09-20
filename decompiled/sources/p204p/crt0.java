package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class crt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f41408a;

    /* JADX INFO: renamed from: b */
    public int f41409b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f41410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crt0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f41410c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41408a = obj;
        this.f41409b |= Integer.MIN_VALUE;
        return this.f41410c.emit(null, this);
    }
}
