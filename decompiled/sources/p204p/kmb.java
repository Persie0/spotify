package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kmb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f124097a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f124098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f124099c;

    /* JADX INFO: renamed from: d */
    public int f124100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f124099c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124098b = obj;
        this.f124100d |= Integer.MIN_VALUE;
        return this.f124099c.m59327F(null, null, this);
    }
}
