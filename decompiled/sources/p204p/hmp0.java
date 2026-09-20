package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hmp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f93016a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f93017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmp0 f93018c;

    /* JADX INFO: renamed from: d */
    public int f93019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmp0(lmp0 lmp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f93018c = lmp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93017b = obj;
        this.f93019d |= Integer.MIN_VALUE;
        return this.f93018c.mo25626e(null, null, null, this);
    }
}
