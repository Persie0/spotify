package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g770 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77198a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h770 f77199b;

    /* JADX INFO: renamed from: c */
    public int f77200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g770(h770 h770Var, ibk ibkVar) {
        super(ibkVar);
        this.f77199b = h770Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77198a = obj;
        this.f77200c |= Integer.MIN_VALUE;
        return this.f77199b.m46763e(null, null, null, false, false, null, this);
    }
}
