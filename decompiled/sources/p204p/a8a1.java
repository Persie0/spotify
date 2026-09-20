package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a8a1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13236a;

    /* JADX INFO: renamed from: b */
    public int f13237b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b8a1 f13238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8a1(b8a1 b8a1Var, ibk ibkVar) {
        super(ibkVar);
        this.f13238c = b8a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13236a = obj;
        this.f13237b |= Integer.MIN_VALUE;
        return this.f13238c.mo15629a(null, null, this);
    }
}
