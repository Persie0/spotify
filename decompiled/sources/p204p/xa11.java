package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xa11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259508a;

    /* JADX INFO: renamed from: b */
    public int f259509b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cvx f259510c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa11(cvx cvxVar, fbk fbkVar) {
        super(fbkVar);
        this.f259510c = cvxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259508a = obj;
        this.f259509b |= Integer.MIN_VALUE;
        return this.f259510c.emit(null, this);
    }
}
