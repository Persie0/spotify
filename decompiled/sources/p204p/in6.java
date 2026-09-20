package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class in6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103874a;

    /* JADX INFO: renamed from: b */
    public int f103875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f103876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in6(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f103876c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103874a = obj;
        this.f103875b |= Integer.MIN_VALUE;
        return this.f103876c.emit(null, this);
    }
}
