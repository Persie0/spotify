package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vlb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f242415a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f242416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f242417c;

    /* JADX INFO: renamed from: d */
    public int f242418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f242417c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242416b = obj;
        this.f242418d |= Integer.MIN_VALUE;
        return this.f242417c.m59336m(null, this, false);
    }
}
