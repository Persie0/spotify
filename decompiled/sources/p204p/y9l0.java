package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f270617a;

    /* JADX INFO: renamed from: b */
    public int f270618b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f270619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9l0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f270619c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f270617a = obj;
        this.f270618b |= Integer.MIN_VALUE;
        return this.f270619c.emit(null, this);
    }
}
