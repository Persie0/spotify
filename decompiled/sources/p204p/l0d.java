package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l0d extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f128361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m0d f128362b;

    /* JADX INFO: renamed from: c */
    public int f128363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0d(m0d m0dVar, ibk ibkVar) {
        super(ibkVar);
        this.f128362b = m0dVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128361a = obj;
        this.f128363c |= Integer.MIN_VALUE;
        return this.f128362b.m60464a(null, null, this);
    }
}
