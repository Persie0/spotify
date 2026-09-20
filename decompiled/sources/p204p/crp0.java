package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class crp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f41339a;

    /* JADX INFO: renamed from: b */
    public int f41340b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f41341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f41341c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41339a = obj;
        this.f41340b |= Integer.MIN_VALUE;
        return this.f41341c.emit(null, this);
    }
}
