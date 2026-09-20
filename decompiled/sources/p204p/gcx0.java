package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gcx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78664a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hcx0 f78665b;

    /* JADX INFO: renamed from: c */
    public int f78666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcx0(hcx0 hcx0Var, ibk ibkVar) {
        super(ibkVar);
        this.f78665b = hcx0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78664a = obj;
        this.f78666c |= Integer.MIN_VALUE;
        return this.f78665b.m47141a(this);
    }
}
