package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b8t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24656a;

    /* JADX INFO: renamed from: b */
    public int f24657b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f24658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8t0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f24658c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24656a = obj;
        this.f24657b |= Integer.MIN_VALUE;
        return this.f24658c.emit(null, this);
    }
}
