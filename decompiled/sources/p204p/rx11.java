package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rx11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203463a;

    /* JADX INFO: renamed from: b */
    public int f203464b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjy0 f203465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx11(vjy0 vjy0Var, fbk fbkVar) {
        super(fbkVar);
        this.f203465c = vjy0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203463a = obj;
        this.f203464b |= Integer.MIN_VALUE;
        return this.f203465c.emit(null, this);
    }
}
