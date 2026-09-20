package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46853a;

    /* JADX INFO: renamed from: b */
    public int f46854b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f46855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9l0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f46855c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46853a = obj;
        this.f46854b |= Integer.MIN_VALUE;
        return this.f46855c.emit(null, this);
    }
}
