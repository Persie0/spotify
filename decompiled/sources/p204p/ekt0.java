package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ekt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60534a;

    /* JADX INFO: renamed from: b */
    public int f60535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fkt0 f60536c;

    /* JADX INFO: renamed from: d */
    public bqz0 f60537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekt0(fkt0 fkt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f60536c = fkt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60534a = obj;
        this.f60535b |= Integer.MIN_VALUE;
        return this.f60536c.mo15629a(null, null, this);
    }
}
