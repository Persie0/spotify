package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yux0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276500a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cvx0 f276501b;

    /* JADX INFO: renamed from: c */
    public int f276502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yux0(cvx0 cvx0Var, ibk ibkVar) {
        super(ibkVar);
        this.f276501b = cvx0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276500a = obj;
        this.f276502c |= Integer.MIN_VALUE;
        return this.f276501b.m34071b(null, this);
    }
}
