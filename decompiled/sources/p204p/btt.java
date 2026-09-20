package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class btt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ctt f30933b;

    /* JADX INFO: renamed from: c */
    public int f30934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(ctt cttVar, ibk ibkVar) {
        super(ibkVar);
        this.f30933b = cttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f30932a = obj;
        this.f30934c |= Integer.MIN_VALUE;
        return this.f30933b.m33847a(null, this);
    }
}
