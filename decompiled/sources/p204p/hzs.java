package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hzs extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f97002a;

    /* JADX INFO: renamed from: b */
    public int f97003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ izs f97004c;

    /* JADX INFO: renamed from: d */
    public bqz0 f97005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzs(izs izsVar, ibk ibkVar) {
        super(ibkVar);
        this.f97004c = izsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97002a = obj;
        this.f97003b |= Integer.MIN_VALUE;
        return this.f97004c.mo15629a(null, null, this);
    }
}
