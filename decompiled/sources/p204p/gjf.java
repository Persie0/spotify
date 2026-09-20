package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gjf extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hjf f80445b;

    /* JADX INFO: renamed from: c */
    public int f80446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjf(hjf hjfVar, ibk ibkVar) {
        super(ibkVar);
        this.f80445b = hjfVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80444a = obj;
        this.f80446c |= Integer.MIN_VALUE;
        return this.f80445b.mo25628g(null, this);
    }
}
