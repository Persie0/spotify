package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qe31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f187840a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ue31 f187841b;

    /* JADX INFO: renamed from: c */
    public int f187842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe31(ue31 ue31Var, ibk ibkVar) {
        super(ibkVar);
        this.f187841b = ue31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f187840a = obj;
        this.f187842c |= Integer.MIN_VALUE;
        return this.f187841b.m82884h(null, null, this);
    }
}
