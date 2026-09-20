package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class i84 extends ibk {

    /* JADX INFO: renamed from: a */
    public g1x0 f99687a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f99688b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w2y0 f99689c;

    /* JADX INFO: renamed from: d */
    public int f99690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i84(w2y0 w2y0Var, ibk ibkVar) {
        super(ibkVar);
        this.f99689c = w2y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99688b = obj;
        this.f99690d |= Integer.MIN_VALUE;
        return this.f99689c.m87088b(null, this);
    }
}
