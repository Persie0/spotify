package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xuc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266078a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yuc1 f266079b;

    /* JADX INFO: renamed from: c */
    public int f266080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuc1(yuc1 yuc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f266079b = yuc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266078a = obj;
        this.f266080c |= Integer.MIN_VALUE;
        return yuc1.m94652h(this.f266079b, this);
    }
}
