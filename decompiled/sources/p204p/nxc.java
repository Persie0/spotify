package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nxc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f159435a;

    /* JADX INFO: renamed from: b */
    public int f159436b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oxc f159437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxc(oxc oxcVar, ibk ibkVar) {
        super(ibkVar);
        this.f159437c = oxcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f159435a = obj;
        this.f159436b |= Integer.MIN_VALUE;
        return this.f159437c.mo15629a(null, null, this);
    }
}
