package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gb60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ib60 f78210b;

    /* JADX INFO: renamed from: c */
    public int f78211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb60(ib60 ib60Var, ibk ibkVar) {
        super(ibkVar);
        this.f78210b = ib60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78209a = obj;
        this.f78211c |= Integer.MIN_VALUE;
        return this.f78210b.m50123a(this);
    }
}
