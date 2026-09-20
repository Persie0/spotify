package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uxe1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f234910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ la2 f234911b;

    /* JADX INFO: renamed from: c */
    public int f234912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxe1(la2 la2Var, ibk ibkVar) {
        super(ibkVar);
        this.f234911b = la2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234910a = obj;
        this.f234912c |= Integer.MIN_VALUE;
        return la2.m58530f(this.f234911b, this);
    }
}
