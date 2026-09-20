package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xy6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f267227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yy6 f267228b;

    /* JADX INFO: renamed from: c */
    public int f267229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy6(yy6 yy6Var, ibk ibkVar) {
        super(ibkVar);
        this.f267228b = yy6Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f267227a = obj;
        this.f267229c |= Integer.MIN_VALUE;
        return yy6.m94864a(this.f267228b, this);
    }
}
