package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yhq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f272950a;

    /* JADX INFO: renamed from: b */
    public int f272951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f272952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhq0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f272952c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272950a = obj;
        this.f272951b |= Integer.MIN_VALUE;
        return this.f272952c.emit(null, this);
    }
}
