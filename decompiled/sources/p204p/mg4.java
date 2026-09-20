package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mg4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f143304a;

    /* JADX INFO: renamed from: b */
    public int f143305b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f143306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg4(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f143306c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143304a = obj;
        this.f143305b |= Integer.MIN_VALUE;
        return this.f143306c.emit(null, this);
    }
}
