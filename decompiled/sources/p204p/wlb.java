package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wlb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f252501a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f252502b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f252503c;

    /* JADX INFO: renamed from: d */
    public int f252504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f252503c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252502b = obj;
        this.f252504d |= Integer.MIN_VALUE;
        return this.f252503c.m59337n(null, this);
    }
}
