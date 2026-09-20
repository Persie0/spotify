package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f253486a;

    /* JADX INFO: renamed from: b */
    public String f253487b;

    /* JADX INFO: renamed from: c */
    public hv31 f253488c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f253489d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bpk f253490e;

    /* JADX INFO: renamed from: f */
    public int f253491f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f253490e = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f253489d = obj;
        this.f253491f |= Integer.MIN_VALUE;
        return this.f253490e.m30131F(null, null, this);
    }
}
