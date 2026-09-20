package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x261 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f257367a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z261 f257368b;

    /* JADX INFO: renamed from: c */
    public int f257369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x261(z261 z261Var, ibk ibkVar) {
        super(ibkVar);
        this.f257368b = z261Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257367a = obj;
        this.f257369c |= Integer.MIN_VALUE;
        return this.f257368b.m95177a(this);
    }
}
