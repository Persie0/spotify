package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z9u0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280887a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bau0 f280888b;

    /* JADX INFO: renamed from: c */
    public int f280889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9u0(bau0 bau0Var, ibk ibkVar) {
        super(ibkVar);
        this.f280888b = bau0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280887a = obj;
        this.f280889c |= Integer.MIN_VALUE;
        return this.f280888b.m28594b(null, this);
    }
}
