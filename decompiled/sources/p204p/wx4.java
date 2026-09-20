package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wx4 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f255928a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f255929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yx4 f255930c;

    /* JADX INFO: renamed from: d */
    public int f255931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx4(yx4 yx4Var, ibk ibkVar) {
        super(ibkVar);
        this.f255930c = yx4Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255929b = obj;
        this.f255931d |= Integer.MIN_VALUE;
        return this.f255930c.m94807c(null, this);
    }
}
