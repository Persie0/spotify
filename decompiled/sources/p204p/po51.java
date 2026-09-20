package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class po51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f179606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ so51 f179607b;

    /* JADX INFO: renamed from: c */
    public int f179608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po51(so51 so51Var, ibk ibkVar) {
        super(ibkVar);
        this.f179607b = so51Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f179606a = obj;
        this.f179608c |= Integer.MIN_VALUE;
        this.f179607b.m78622f(this);
        throw null;
    }
}
