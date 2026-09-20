package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class slb extends ibk {

    /* JADX INFO: renamed from: a */
    public String f210348a;

    /* JADX INFO: renamed from: b */
    public lmb f210349b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f210350c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lmb f210351d;

    /* JADX INFO: renamed from: e */
    public int f210352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f210351d = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210350c = obj;
        this.f210352e |= Integer.MIN_VALUE;
        return this.f210351d.m59333j(null, null, this);
    }
}
