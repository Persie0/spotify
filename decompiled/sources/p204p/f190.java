package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class f190 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g190 f64821b;

    /* JADX INFO: renamed from: c */
    public int f64822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f190(g190 g190Var, ibk ibkVar) {
        super(ibkVar);
        this.f64821b = g190Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64820a = obj;
        this.f64822c |= Integer.MIN_VALUE;
        return this.f64821b.m43349c(null, null, this);
    }
}
