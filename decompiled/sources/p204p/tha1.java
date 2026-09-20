package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tha1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f220382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yha1 f220383b;

    /* JADX INFO: renamed from: c */
    public int f220384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tha1(yha1 yha1Var, ibk ibkVar) {
        super(ibkVar);
        this.f220383b = yha1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220382a = obj;
        this.f220384c |= Integer.MIN_VALUE;
        return this.f220383b.m93627b(this);
    }
}
