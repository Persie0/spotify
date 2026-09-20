package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sv41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uv41 f214323b;

    /* JADX INFO: renamed from: c */
    public int f214324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv41(uv41 uv41Var, ibk ibkVar) {
        super(ibkVar);
        this.f214323b = uv41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214322a = obj;
        this.f214324c |= Integer.MIN_VALUE;
        return this.f214323b.m84049a(null, this);
    }
}
