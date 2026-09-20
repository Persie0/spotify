package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class emp extends ibk {

    /* JADX INFO: renamed from: a */
    public String f60956a;

    /* JADX INFO: renamed from: b */
    public cze1 f60957b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f60958c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fmp f60959d;

    /* JADX INFO: renamed from: e */
    public int f60960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emp(fmp fmpVar, ibk ibkVar) {
        super(ibkVar);
        this.f60959d = fmpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60958c = obj;
        this.f60960e |= Integer.MIN_VALUE;
        return this.f60959d.m42166b(null, null, this);
    }
}
