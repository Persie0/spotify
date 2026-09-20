package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cn10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fn10 f39866b;

    /* JADX INFO: renamed from: c */
    public int f39867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn10(fn10 fn10Var, ibk ibkVar) {
        super(ibkVar);
        this.f39866b = fn10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f39865a = obj;
        this.f39867c |= Integer.MIN_VALUE;
        fn10.m42195c(this.f39866b, this);
        return yuk.f276404a;
    }
}
