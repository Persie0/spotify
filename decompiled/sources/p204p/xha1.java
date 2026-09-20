package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xha1 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f261501a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f261502b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yha1 f261503c;

    /* JADX INFO: renamed from: d */
    public int f261504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xha1(yha1 yha1Var, ibk ibkVar) {
        super(ibkVar);
        this.f261503c = yha1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f261502b = obj;
        this.f261504d |= Integer.MIN_VALUE;
        return this.f261503c.m93631f(0L, this);
    }
}
