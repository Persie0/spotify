package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oqp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public qu80 f168332a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f168333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pqp0 f168334c;

    /* JADX INFO: renamed from: d */
    public int f168335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqp0(pqp0 pqp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f168334c = pqp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168333b = obj;
        this.f168335d |= Integer.MIN_VALUE;
        return pqp0.m70687b(this.f168334c, null, this);
    }
}
