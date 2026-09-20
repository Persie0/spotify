package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u8e0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f227940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v8e0 f227941b;

    /* JADX INFO: renamed from: c */
    public int f227942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8e0(v8e0 v8e0Var, ibk ibkVar) {
        super(ibkVar);
        this.f227941b = v8e0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227940a = obj;
        this.f227942c |= Integer.MIN_VALUE;
        Object objM84914b = this.f227941b.m84914b(null, this, false);
        return objM84914b == yuk.f276404a ? objM84914b : new s6x0(objM84914b);
    }
}
