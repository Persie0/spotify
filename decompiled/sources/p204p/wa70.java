package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wa70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f249409a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ya70 f249410b;

    /* JADX INFO: renamed from: c */
    public int f249411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa70(ya70 ya70Var, ibk ibkVar) {
        super(ibkVar);
        this.f249410b = ya70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f249409a = obj;
        this.f249411c |= Integer.MIN_VALUE;
        ya70.m93206h(this.f249410b, 0, null, this);
        return yuk.f276404a;
    }
}
