package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class msu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146861a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nsu0 f146862b;

    /* JADX INFO: renamed from: c */
    public int f146863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msu0(nsu0 nsu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f146862b = nsu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146861a = obj;
        this.f146863c |= Integer.MIN_VALUE;
        return this.f146862b.m65590c(null, this);
    }
}
