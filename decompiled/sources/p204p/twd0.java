package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class twd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vwd0 f224421b;

    /* JADX INFO: renamed from: c */
    public int f224422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twd0(vwd0 vwd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f224421b = vwd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224420a = obj;
        this.f224422c |= Integer.MIN_VALUE;
        return vwd0.m86556b(this.f224421b, null, this);
    }
}
