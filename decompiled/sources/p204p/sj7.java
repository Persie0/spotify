package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sj7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f209765a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vj7 f209766b;

    /* JADX INFO: renamed from: c */
    public int f209767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj7(vj7 vj7Var, ibk ibkVar) {
        super(ibkVar);
        this.f209766b = vj7Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209765a = obj;
        this.f209767c |= Integer.MIN_VALUE;
        return vj7.m85745h1(this.f209766b, this);
    }
}
