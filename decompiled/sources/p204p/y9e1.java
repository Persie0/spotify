package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y9e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f270581a;

    /* JADX INFO: renamed from: b */
    public int f270582b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f270583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9e1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f270583c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f270581a = obj;
        this.f270582b |= Integer.MIN_VALUE;
        return this.f270583c.emit(null, this);
    }
}
