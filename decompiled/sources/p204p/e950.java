package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e950 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57367a;

    /* JADX INFO: renamed from: b */
    public int f57368b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f57369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e950(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f57369c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57367a = obj;
        this.f57368b |= Integer.MIN_VALUE;
        return this.f57369c.emit(null, this);
    }
}
