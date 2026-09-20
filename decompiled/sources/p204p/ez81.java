package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ez81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fz81 f64304b;

    /* JADX INFO: renamed from: c */
    public int f64305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez81(fz81 fz81Var, ibk ibkVar) {
        super(ibkVar);
        this.f64304b = fz81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64303a = obj;
        this.f64305c |= Integer.MIN_VALUE;
        return fz81.m43176a(this.f64304b, null, this);
    }
}
