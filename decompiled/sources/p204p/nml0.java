package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nml0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f155489a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uml0 f155490b;

    /* JADX INFO: renamed from: c */
    public int f155491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nml0(uml0 uml0Var, ibk ibkVar) {
        super(ibkVar);
        this.f155490b = uml0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f155489a = obj;
        this.f155491c |= Integer.MIN_VALUE;
        return this.f155490b.m83457d(this);
    }
}
