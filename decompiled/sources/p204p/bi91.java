package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bi91 extends ibk {

    /* JADX INFO: renamed from: a */
    public fv31 f27368a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f27369b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hi91 f27370c;

    /* JADX INFO: renamed from: d */
    public int f27371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi91(hi91 hi91Var, ibk ibkVar) {
        super(ibkVar);
        this.f27370c = hi91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27369b = obj;
        this.f27371d |= Integer.MIN_VALUE;
        return this.f27370c.m47628a(null, this);
    }
}
