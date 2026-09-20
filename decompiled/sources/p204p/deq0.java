package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class deq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48156a;

    /* JADX INFO: renamed from: b */
    public int f48157b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f48158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deq0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f48158c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f48156a = obj;
        this.f48157b |= Integer.MIN_VALUE;
        return this.f48158c.emit(null, this);
    }
}
