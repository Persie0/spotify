package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class avx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20289a;

    /* JADX INFO: renamed from: b */
    public int f20290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cvx f20291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avx(cvx cvxVar, fbk fbkVar) {
        super(fbkVar);
        this.f20291c = cvxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20289a = obj;
        this.f20290b |= Integer.MIN_VALUE;
        return this.f20291c.emit(null, this);
    }
}
