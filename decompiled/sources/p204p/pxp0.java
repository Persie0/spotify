package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pxp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f183152a;

    /* JADX INFO: renamed from: b */
    public int f183153b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f183154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f183154c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f183152a = obj;
        this.f183153b |= Integer.MIN_VALUE;
        return this.f183154c.emit(null, this);
    }
}
