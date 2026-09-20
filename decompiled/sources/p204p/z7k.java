package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z7k extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280241a;

    /* JADX INFO: renamed from: b */
    public int f280242b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f280243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7k(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f280243c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280241a = obj;
        this.f280242b |= Integer.MIN_VALUE;
        return this.f280243c.emit(null, this);
    }
}
