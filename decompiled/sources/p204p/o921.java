package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o921 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r921 f162920b;

    /* JADX INFO: renamed from: c */
    public int f162921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o921(r921 r921Var, ibk ibkVar) {
        super(ibkVar);
        this.f162920b = r921Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162919a = obj;
        this.f162921c |= Integer.MIN_VALUE;
        return this.f162920b.m75007b(null, null, null, null, this);
    }
}
