package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b611 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23799a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c611 f23800b;

    /* JADX INFO: renamed from: c */
    public int f23801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b611(c611 c611Var, ibk ibkVar) {
        super(ibkVar);
        this.f23800b = c611Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23799a = obj;
        this.f23801c |= Integer.MIN_VALUE;
        return this.f23800b.mo31502a(null, this);
    }
}
