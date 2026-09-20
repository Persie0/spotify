package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class swd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vwd0 f214647b;

    /* JADX INFO: renamed from: c */
    public int f214648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swd0(vwd0 vwd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f214647b = vwd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214646a = obj;
        this.f214648c |= Integer.MIN_VALUE;
        return vwd0.m86555a(this.f214647b, null, this);
    }
}
