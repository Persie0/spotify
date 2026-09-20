package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zqd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285363a;

    /* JADX INFO: renamed from: b */
    public int f285364b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cvx f285365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqd0(cvx cvxVar, fbk fbkVar) {
        super(fbkVar);
        this.f285365c = cvxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285363a = obj;
        this.f285364b |= Integer.MIN_VALUE;
        return this.f285365c.emit(null, this);
    }
}
