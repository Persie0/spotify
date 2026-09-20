package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sdm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f208041a;

    /* JADX INFO: renamed from: b */
    public int f208042b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f208043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdm0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f208043c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208041a = obj;
        this.f208042b |= Integer.MIN_VALUE;
        return this.f208043c.emit(null, this);
    }
}
