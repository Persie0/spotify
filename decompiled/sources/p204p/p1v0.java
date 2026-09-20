package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p1v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173171a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s1v0 f173172b;

    /* JADX INFO: renamed from: c */
    public int f173173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1v0(s1v0 s1v0Var, ibk ibkVar) {
        super(ibkVar);
        this.f173172b = s1v0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173171a = obj;
        this.f173173c |= Integer.MIN_VALUE;
        return this.f173172b.m76992a(this);
    }
}
