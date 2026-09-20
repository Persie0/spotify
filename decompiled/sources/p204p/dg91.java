package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dg91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48759a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kg91 f48760b;

    /* JADX INFO: renamed from: c */
    public int f48761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f48760b = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f48759a = obj;
        this.f48761c |= Integer.MIN_VALUE;
        return this.f48760b.m56318h(this);
    }
}
