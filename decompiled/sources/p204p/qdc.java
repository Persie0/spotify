package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qdc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f187532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rdc f187533b;

    /* JADX INFO: renamed from: c */
    public int f187534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdc(rdc rdcVar, ibk ibkVar) {
        super(ibkVar);
        this.f187533b = rdcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f187532a = obj;
        this.f187534c |= Integer.MIN_VALUE;
        return rdc.m75326a(this.f187533b, null, this);
    }
}
