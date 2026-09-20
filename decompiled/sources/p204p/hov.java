package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hov extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f93638a;

    /* JADX INFO: renamed from: b */
    public int f93639b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iov f93640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hov(iov iovVar, ibk ibkVar) {
        super(ibkVar);
        this.f93640c = iovVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93638a = obj;
        this.f93639b |= Integer.MIN_VALUE;
        return this.f93640c.mo15629a(null, null, this);
    }
}
