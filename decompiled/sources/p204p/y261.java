package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class y261 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f268471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z261 f268472b;

    /* JADX INFO: renamed from: c */
    public int f268473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y261(z261 z261Var, ibk ibkVar) {
        super(ibkVar);
        this.f268472b = z261Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268471a = obj;
        this.f268473c |= Integer.MIN_VALUE;
        return this.f268472b.m95178b(this);
    }
}
