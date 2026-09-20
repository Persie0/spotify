package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class a2g1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11672a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c3g1 f11673b;

    /* JADX INFO: renamed from: c */
    public int f11674c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2g1(c3g1 c3g1Var, ibk ibkVar) {
        super(ibkVar);
        this.f11673b = c3g1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11672a = obj;
        this.f11674c |= Integer.MIN_VALUE;
        return c3g1.m31384d(this.f11673b, this);
    }
}
