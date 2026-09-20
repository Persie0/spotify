package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uko0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tpn0 f231335b;

    /* JADX INFO: renamed from: c */
    public int f231336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uko0(tpn0 tpn0Var, ibk ibkVar) {
        super(ibkVar);
        this.f231335b = tpn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231334a = obj;
        this.f231336c |= Integer.MIN_VALUE;
        return this.f231335b.m81267d(null, this);
    }
}
