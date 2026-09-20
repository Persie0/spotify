package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rwd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203323a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vwd0 f203324b;

    /* JADX INFO: renamed from: c */
    public int f203325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwd0(vwd0 vwd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f203324b = vwd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203323a = obj;
        this.f203325c |= Integer.MIN_VALUE;
        return this.f203324b.m86557c(null, null, this);
    }
}
