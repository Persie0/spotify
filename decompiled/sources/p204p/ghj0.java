package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ghj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public npa f79937a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f79938b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jhj0 f79939c;

    /* JADX INFO: renamed from: d */
    public int f79940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghj0(jhj0 jhj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f79939c = jhj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f79938b = obj;
        this.f79940d |= Integer.MIN_VALUE;
        return jhj0.m53399b(this.f79939c, null, this);
    }
}
