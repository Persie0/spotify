package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jqa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f114863a;

    /* JADX INFO: renamed from: b */
    public double f114864b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f114865c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ g2a1 f114866d;

    /* JADX INFO: renamed from: e */
    public int f114867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqa1(g2a1 g2a1Var, ibk ibkVar) {
        super(ibkVar);
        this.f114866d = g2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114865c = obj;
        this.f114867e |= Integer.MIN_VALUE;
        return this.f114866d.m43383o(null, null, this);
    }
}
