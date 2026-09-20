package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c9r extends ibk {

    /* JADX INFO: renamed from: a */
    public long f35617a;

    /* JADX INFO: renamed from: b */
    public long f35618b;

    /* JADX INFO: renamed from: c */
    public String f35619c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f35620d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ e9r f35621e;

    /* JADX INFO: renamed from: f */
    public int f35622f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9r(e9r e9rVar, ibk ibkVar) {
        super(ibkVar);
        this.f35621e = e9rVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35620d = obj;
        this.f35622f |= Integer.MIN_VALUE;
        return this.f35621e.m38259b(0L, null, this);
    }
}
