package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24620a;

    /* JADX INFO: renamed from: b */
    public int f24621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f24622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f24622c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24620a = obj;
        this.f24621b |= Integer.MIN_VALUE;
        return this.f24622c.emit(null, this);
    }
}
