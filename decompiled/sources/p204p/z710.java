package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class z710 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280059a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c810 f280060b;

    /* JADX INFO: renamed from: c */
    public int f280061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z710(c810 c810Var, ibk ibkVar) {
        super(ibkVar);
        this.f280060b = c810Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280059a = obj;
        this.f280061c |= Integer.MIN_VALUE;
        return this.f280060b.m31770b(null, this);
    }
}
