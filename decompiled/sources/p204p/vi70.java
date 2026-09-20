package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vi70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f241636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xi70 f241637b;

    /* JADX INFO: renamed from: c */
    public int f241638c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi70(xi70 xi70Var, ibk ibkVar) {
        super(ibkVar);
        this.f241637b = xi70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241636a = obj;
        this.f241638c |= Integer.MIN_VALUE;
        return this.f241637b.m91088b(this);
    }
}
