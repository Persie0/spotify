package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ag5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15283a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dg5 f15284b;

    /* JADX INFO: renamed from: c */
    public int f15285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag5(dg5 dg5Var, ibk ibkVar) {
        super(ibkVar);
        this.f15284b = dg5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f15283a = obj;
        this.f15285c |= Integer.MIN_VALUE;
        return this.f15284b.m35917b(this);
    }
}
