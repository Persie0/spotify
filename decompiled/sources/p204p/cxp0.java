package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cxp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f43076a;

    /* JADX INFO: renamed from: b */
    public int f43077b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f43078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f43078c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43076a = obj;
        this.f43077b |= Integer.MIN_VALUE;
        return this.f43078c.emit(null, this);
    }
}
