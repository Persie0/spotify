package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class le31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f132442a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ue31 f132443b;

    /* JADX INFO: renamed from: c */
    public int f132444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le31(ue31 ue31Var, ibk ibkVar) {
        super(ibkVar);
        this.f132443b = ue31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f132442a = obj;
        this.f132444c |= Integer.MIN_VALUE;
        return this.f132443b.m82878b(null, null, this);
    }
}
