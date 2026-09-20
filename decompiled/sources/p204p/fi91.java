package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fi91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f69815a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hi91 f69816b;

    /* JADX INFO: renamed from: c */
    public int f69817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi91(hi91 hi91Var, ibk ibkVar) {
        super(ibkVar);
        this.f69816b = hi91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f69815a = obj;
        this.f69817c |= Integer.MIN_VALUE;
        return this.f69816b.m47629c(this);
    }
}
