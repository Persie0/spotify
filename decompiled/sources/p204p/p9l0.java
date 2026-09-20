package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r9l0 f175268b;

    /* JADX INFO: renamed from: c */
    public int f175269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9l0(r9l0 r9l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f175268b = r9l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175267a = obj;
        this.f175269c |= Integer.MIN_VALUE;
        return this.f175268b.m75082h(this);
    }
}
