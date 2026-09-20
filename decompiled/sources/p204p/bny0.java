package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bny0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28943a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cny0 f28944b;

    /* JADX INFO: renamed from: c */
    public int f28945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bny0(cny0 cny0Var, ibk ibkVar) {
        super(ibkVar);
        this.f28944b = cny0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f28943a = obj;
        this.f28945c |= Integer.MIN_VALUE;
        return this.f28944b.m33475c(this);
    }
}
