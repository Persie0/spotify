package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xam0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259721a;

    /* JADX INFO: renamed from: b */
    public int f259722b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f259723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xam0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f259723c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259721a = obj;
        this.f259722b |= Integer.MIN_VALUE;
        return this.f259723c.emit(null, this);
    }
}
