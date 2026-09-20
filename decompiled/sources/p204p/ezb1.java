package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ezb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xn2 f64329b;

    /* JADX INFO: renamed from: c */
    public int f64330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb1(xn2 xn2Var, ibk ibkVar) {
        super(ibkVar);
        this.f64329b = xn2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64328a = obj;
        this.f64330c |= Integer.MIN_VALUE;
        return xn2.m91488e(this.f64329b, null, this);
    }
}
