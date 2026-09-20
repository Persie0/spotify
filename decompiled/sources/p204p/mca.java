package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mca extends ibk {

    /* JADX INFO: renamed from: a */
    public long f142111a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f142112b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nca f142113c;

    /* JADX INFO: renamed from: d */
    public int f142114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mca(nca ncaVar, ibk ibkVar) {
        super(ibkVar);
        this.f142113c = ncaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142112b = obj;
        this.f142114d |= Integer.MIN_VALUE;
        return this.f142113c.mo25864m0(0L, this);
    }
}
