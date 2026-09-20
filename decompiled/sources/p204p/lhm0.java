package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lhm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133601a;

    /* JADX INFO: renamed from: b */
    public int f133602b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f133603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f133603c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133601a = obj;
        this.f133602b |= Integer.MIN_VALUE;
        return this.f133603c.emit(null, this);
    }
}
