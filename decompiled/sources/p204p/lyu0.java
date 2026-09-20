package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lyu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f138116a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tyu0 f138117b;

    /* JADX INFO: renamed from: c */
    public int f138118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyu0(tyu0 tyu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f138117b = tyu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f138116a = obj;
        this.f138118c |= Integer.MIN_VALUE;
        return this.f138117b.m82007b(this);
    }
}
