package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ip41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u4l0 f104383b;

    /* JADX INFO: renamed from: c */
    public int f104384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip41(u4l0 u4l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f104383b = u4l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104382a = obj;
        this.f104384c |= Integer.MIN_VALUE;
        return this.f104383b.m82354c(null, this);
    }
}
