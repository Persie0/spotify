package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gi91 extends ibk {

    /* JADX INFO: renamed from: a */
    public ji91 f80103a;

    /* JADX INFO: renamed from: b */
    public fv31 f80104b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f80105c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hi91 f80106d;

    /* JADX INFO: renamed from: e */
    public int f80107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi91(hi91 hi91Var, ibk ibkVar) {
        super(ibkVar);
        this.f80106d = hi91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80105c = obj;
        this.f80107e |= Integer.MIN_VALUE;
        return this.f80106d.m47630d(null, this);
    }
}
