package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61964a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqw f61965b;

    /* JADX INFO: renamed from: c */
    public int f61966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqw(kqw kqwVar, ibk ibkVar) {
        super(ibkVar);
        this.f61965b = kqwVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61964a = obj;
        this.f61966c |= Integer.MIN_VALUE;
        return this.f61965b.m57125c(null, this);
    }
}
