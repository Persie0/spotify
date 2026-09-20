package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f7d extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66652a;

    /* JADX INFO: renamed from: b */
    public int f66653b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g7d f66654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7d(g7d g7dVar, ibk ibkVar) {
        super(ibkVar);
        this.f66654c = g7dVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66652a = obj;
        this.f66653b |= Integer.MIN_VALUE;
        return this.f66654c.mo15629a(null, null, this);
    }
}
