package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p3q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q3q f173687b;

    /* JADX INFO: renamed from: c */
    public int f173688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3q(q3q q3qVar, ibk ibkVar) {
        super(ibkVar);
        this.f173687b = q3qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173686a = obj;
        this.f173688c |= Integer.MIN_VALUE;
        return this.f173687b.m72125b(this);
    }
}
