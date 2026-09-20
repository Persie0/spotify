package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ubx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228899a;

    /* JADX INFO: renamed from: b */
    public int f228900b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vbx0 f228901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubx0(vbx0 vbx0Var, ibk ibkVar) {
        super(ibkVar);
        this.f228901c = vbx0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228899a = obj;
        this.f228900b |= Integer.MIN_VALUE;
        return this.f228901c.mo15629a(null, null, this);
    }
}
