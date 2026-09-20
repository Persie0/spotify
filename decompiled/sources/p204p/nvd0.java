package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nvd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f158867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ svd0 f158868b;

    /* JADX INFO: renamed from: c */
    public int f158869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvd0(svd0 svd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f158868b = svd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f158867a = obj;
        this.f158869c |= Integer.MIN_VALUE;
        return this.f158868b.m79437o(null, this);
    }
}
