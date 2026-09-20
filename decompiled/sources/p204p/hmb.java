package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hmb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f92878a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f92879b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f92880c;

    /* JADX INFO: renamed from: d */
    public int f92881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f92880c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92879b = obj;
        this.f92881d |= Integer.MIN_VALUE;
        return this.f92880c.m59348y(null, this);
    }
}
