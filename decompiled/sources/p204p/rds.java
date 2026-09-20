package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rds extends ibk {

    /* JADX INFO: renamed from: a */
    public vcs f198197a;

    /* JADX INFO: renamed from: b */
    public wds f198198b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f198199c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uds f198200d;

    /* JADX INFO: renamed from: e */
    public int f198201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rds(uds udsVar, ibk ibkVar) {
        super(ibkVar);
        this.f198200d = udsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198199c = obj;
        this.f198201e |= Integer.MIN_VALUE;
        return uds.m82852L1(this.f198200d, null, this);
    }
}
