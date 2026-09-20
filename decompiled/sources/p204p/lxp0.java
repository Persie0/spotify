package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lxp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137858a;

    /* JADX INFO: renamed from: b */
    public int f137859b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f137860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f137860c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137858a = obj;
        this.f137859b |= Integer.MIN_VALUE;
        return this.f137860c.emit(null, this);
    }
}
