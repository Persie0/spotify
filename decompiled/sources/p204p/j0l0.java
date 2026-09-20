package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j0l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107480a;

    /* JADX INFO: renamed from: b */
    public int f107481b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f107482c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0l0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f107482c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107480a = obj;
        this.f107481b |= Integer.MIN_VALUE;
        return this.f107482c.emit(null, this);
    }
}
