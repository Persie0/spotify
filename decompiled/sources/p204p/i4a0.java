package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i4a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f98467a;

    /* JADX INFO: renamed from: b */
    public vy81 f98468b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f98469c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ j4a0 f98470d;

    /* JADX INFO: renamed from: e */
    public int f98471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4a0(j4a0 j4a0Var, ibk ibkVar) {
        super(ibkVar);
        this.f98470d = j4a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f98469c = obj;
        this.f98471e |= Integer.MIN_VALUE;
        return this.f98470d.m52333b(null, this);
    }
}
