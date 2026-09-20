package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ujy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231177a;

    /* JADX INFO: renamed from: b */
    public int f231178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjy0 f231179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujy0(vjy0 vjy0Var, fbk fbkVar) {
        super(fbkVar);
        this.f231179c = vjy0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231177a = obj;
        this.f231178b |= Integer.MIN_VALUE;
        return this.f231179c.emit(null, this);
    }
}
