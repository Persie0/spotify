package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qq11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191428a;

    /* JADX INFO: renamed from: b */
    public int f191429b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f191430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq11(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f191430c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191428a = obj;
        this.f191429b |= Integer.MIN_VALUE;
        return this.f191430c.emit(null, this);
    }
}
