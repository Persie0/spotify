package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hx21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ix21 f96122b;

    /* JADX INFO: renamed from: c */
    public int f96123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx21(ix21 ix21Var, ibk ibkVar) {
        super(ibkVar);
        this.f96122b = ix21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96121a = obj;
        this.f96123c |= Integer.MIN_VALUE;
        return this.f96122b.mo33214i(null, this);
    }
}
