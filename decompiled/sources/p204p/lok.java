package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f135447a;

    /* JADX INFO: renamed from: b */
    public String f135448b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f135449c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bpk f135450d;

    /* JADX INFO: renamed from: e */
    public int f135451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f135450d = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f135449c = obj;
        this.f135451e |= Integer.MIN_VALUE;
        return this.f135450d.m30155u(null, this);
    }
}
