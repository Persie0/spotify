package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s4m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f205615a;

    /* JADX INFO: renamed from: b */
    public int f205616b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f205617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4m(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f205617c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205615a = obj;
        this.f205616b |= Integer.MIN_VALUE;
        return this.f205617c.emit(null, this);
    }
}
