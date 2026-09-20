package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jog1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f114428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ log1 f114429b;

    /* JADX INFO: renamed from: c */
    public int f114430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jog1(log1 log1Var, ibk ibkVar) {
        super(ibkVar);
        this.f114429b = log1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114428a = obj;
        this.f114430c |= Integer.MIN_VALUE;
        return this.f114429b.m59566b(null, this);
    }
}
