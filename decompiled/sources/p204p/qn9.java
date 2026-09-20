package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qn9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f190534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un9 f190535b;

    /* JADX INFO: renamed from: c */
    public int f190536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn9(un9 un9Var, ibk ibkVar) {
        super(ibkVar);
        this.f190535b = un9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f190534a = obj;
        this.f190536c |= Integer.MIN_VALUE;
        return un9.m83536f(this.f190535b, this);
    }
}
