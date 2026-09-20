package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fk41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f70472a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fni0 f70473b;

    /* JADX INFO: renamed from: c */
    public int f70474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk41(fni0 fni0Var, ibk ibkVar) {
        super(ibkVar);
        this.f70473b = fni0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70472a = obj;
        this.f70474c |= Integer.MIN_VALUE;
        return this.f70473b.m42226c(this);
    }
}
