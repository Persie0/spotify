package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uha1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f230401a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yha1 f230402b;

    /* JADX INFO: renamed from: c */
    public int f230403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uha1(yha1 yha1Var, ibk ibkVar) {
        super(ibkVar);
        this.f230402b = yha1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f230401a = obj;
        this.f230403c |= Integer.MIN_VALUE;
        return this.f230402b.m93628c(this);
    }
}
