package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gal0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78068a;

    /* JADX INFO: renamed from: b */
    public int f78069b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f78070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gal0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f78070c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78068a = obj;
        this.f78069b |= Integer.MIN_VALUE;
        return this.f78070c.emit(null, this);
    }
}
