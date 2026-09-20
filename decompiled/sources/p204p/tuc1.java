package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tuc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yuc1 f223828b;

    /* JADX INFO: renamed from: c */
    public int f223829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tuc1(yuc1 yuc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f223828b = yuc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223827a = obj;
        this.f223829c |= Integer.MIN_VALUE;
        return yuc1.m94650f(this.f223828b, this);
    }
}
