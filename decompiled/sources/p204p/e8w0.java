package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e8w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57298a;

    /* JADX INFO: renamed from: b */
    public int f57299b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f57300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8w0(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f57300c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57298a = obj;
        this.f57299b |= Integer.MIN_VALUE;
        return this.f57300c.emit(null, this);
    }
}
