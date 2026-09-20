package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ae11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14717a;

    /* JADX INFO: renamed from: b */
    public int f14718b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f14719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae11(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f14719c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f14717a = obj;
        this.f14718b |= Integer.MIN_VALUE;
        return this.f14719c.emit(null, this);
    }
}
