package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class brj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30101a;

    /* JADX INFO: renamed from: b */
    public int f30102b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ crj f30103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brj(crj crjVar, ibk ibkVar) {
        super(ibkVar);
        this.f30103c = crjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f30101a = obj;
        this.f30102b |= Integer.MIN_VALUE;
        return this.f30103c.mo15629a(null, null, this);
    }
}
