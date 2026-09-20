package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a2a extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b2a f11605b;

    /* JADX INFO: renamed from: c */
    public int f11606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2a(b2a b2aVar, ibk ibkVar) {
        super(ibkVar);
        this.f11605b = b2aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11604a = obj;
        this.f11606c |= Integer.MIN_VALUE;
        return this.f11605b.m27948a(null, null, null, this);
    }
}
