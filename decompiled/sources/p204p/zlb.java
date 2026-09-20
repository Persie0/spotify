package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zlb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f283967a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f283968b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f283969c;

    /* JADX INFO: renamed from: d */
    public int f283970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f283969c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f283968b = obj;
        this.f283970d |= Integer.MIN_VALUE;
        return this.f283969c.m59340q(null, this, false);
    }
}
