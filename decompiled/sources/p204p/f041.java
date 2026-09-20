package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f041 extends ibk {

    /* JADX INFO: renamed from: a */
    public niz f64540a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f64541b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x041 f64542c;

    /* JADX INFO: renamed from: d */
    public int f64543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f041(x041 x041Var, ibk ibkVar) {
        super(ibkVar);
        this.f64542c = x041Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64541b = obj;
        this.f64543d |= Integer.MIN_VALUE;
        return this.f64542c.m89503h(null, null, this);
    }
}
