package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ywp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f277022a;

    /* JADX INFO: renamed from: b */
    public int f277023b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f277024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f277024c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f277022a = obj;
        this.f277023b |= Integer.MIN_VALUE;
        return this.f277024c.emit(null, this);
    }
}
