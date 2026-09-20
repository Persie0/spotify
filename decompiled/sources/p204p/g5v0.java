package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g5v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public a8v0 f76773a;

    /* JADX INFO: renamed from: b */
    public j5v0 f76774b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f76775c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ j5v0 f76776d;

    /* JADX INFO: renamed from: e */
    public int f76777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5v0(j5v0 j5v0Var, ibk ibkVar) {
        super(ibkVar);
        this.f76776d = j5v0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76775c = obj;
        this.f76777e |= Integer.MIN_VALUE;
        return j5v0.m52477b(this.f76776d, null, null, this);
    }
}
