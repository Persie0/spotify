package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tba0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vba0 f218807b;

    /* JADX INFO: renamed from: c */
    public int f218808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tba0(vba0 vba0Var, ibk ibkVar) {
        super(ibkVar);
        this.f218807b = vba0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218806a = obj;
        this.f218808c |= Integer.MIN_VALUE;
        return vba0.m85126d(this.f218807b, null, this);
    }
}
