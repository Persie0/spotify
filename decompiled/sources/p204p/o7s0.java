package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o7s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p7s0 f162611b;

    /* JADX INFO: renamed from: c */
    public int f162612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7s0(p7s0 p7s0Var, ibk ibkVar) {
        super(ibkVar);
        this.f162611b = p7s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162610a = obj;
        this.f162612c |= Integer.MIN_VALUE;
        return p7s0.m69296g(this.f162611b, null, this);
    }
}
