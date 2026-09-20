package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cbr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f36192a;

    /* JADX INFO: renamed from: b */
    public int f36193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f36194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f36194c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f36192a = obj;
        this.f36193b |= Integer.MIN_VALUE;
        return this.f36194c.emit(null, this);
    }
}
