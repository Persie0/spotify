package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f5t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66168a;

    /* JADX INFO: renamed from: b */
    public int f66169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cvx f66170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5t0(cvx cvxVar, fbk fbkVar) {
        super(fbkVar);
        this.f66170c = cvxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66168a = obj;
        this.f66169b |= Integer.MIN_VALUE;
        return this.f66170c.emit(null, this);
    }
}
