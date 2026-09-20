package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class yy1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f277375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zy1 f277376b;

    /* JADX INFO: renamed from: c */
    public int f277377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy1(zy1 zy1Var, ibk ibkVar) {
        super(ibkVar);
        this.f277376b = zy1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f277375a = obj;
        this.f277377c |= Integer.MIN_VALUE;
        return this.f277376b.m97218a(null, this);
    }
}
