package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ugk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f230198a;

    /* JADX INFO: renamed from: b */
    public int f230199b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f230200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugk0(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f230200c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f230198a = obj;
        this.f230199b |= Integer.MIN_VALUE;
        return this.f230200c.emit(null, this);
    }
}
