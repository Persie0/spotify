package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tv41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uv41 f224053b;

    /* JADX INFO: renamed from: c */
    public int f224054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv41(uv41 uv41Var, ibk ibkVar) {
        super(ibkVar);
        this.f224053b = uv41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224052a = obj;
        this.f224054c |= Integer.MIN_VALUE;
        return this.f224053b.m84050b(null, this);
    }
}
