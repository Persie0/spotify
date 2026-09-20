package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a61 f217192b;

    /* JADX INFO: renamed from: c */
    public int f217193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(a61 a61Var, ibk ibkVar) {
        super(ibkVar);
        this.f217192b = a61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217191a = obj;
        this.f217193c |= Integer.MIN_VALUE;
        return this.f217192b.m24831c(null, null, null, null, this);
    }
}
