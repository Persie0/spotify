package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oxp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f171484a;

    /* JADX INFO: renamed from: b */
    public int f171485b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f171486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f171486c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f171484a = obj;
        this.f171485b |= Integer.MIN_VALUE;
        return this.f171486c.emit(null, this);
    }
}
