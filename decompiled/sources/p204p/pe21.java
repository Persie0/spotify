package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pe21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f176614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ue21 f176615b;

    /* JADX INFO: renamed from: c */
    public int f176616c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe21(ue21 ue21Var, ibk ibkVar) {
        super(ibkVar);
        this.f176615b = ue21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f176614a = obj;
        this.f176616c |= Integer.MIN_VALUE;
        return this.f176615b.m82874a(null, 0, this);
    }
}
