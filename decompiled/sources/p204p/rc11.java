package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rc11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197688a;

    /* JADX INFO: renamed from: b */
    public int f197689b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f197690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc11(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f197690c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197688a = obj;
        this.f197689b |= Integer.MIN_VALUE;
        return this.f197690c.emit(null, this);
    }
}
