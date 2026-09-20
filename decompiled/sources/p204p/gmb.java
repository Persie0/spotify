package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gmb extends ibk {

    /* JADX INFO: renamed from: a */
    public String f81352a;

    /* JADX INFO: renamed from: b */
    public lmb f81353b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f81354c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lmb f81355d;

    /* JADX INFO: renamed from: e */
    public int f81356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f81355d = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81354c = obj;
        this.f81356e |= Integer.MIN_VALUE;
        return this.f81355d.m59347x(0, null, null, this);
    }
}
