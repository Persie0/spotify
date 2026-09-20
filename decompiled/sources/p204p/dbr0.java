package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dbr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47350a;

    /* JADX INFO: renamed from: b */
    public int f47351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f47352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f47352c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47350a = obj;
        this.f47351b |= Integer.MIN_VALUE;
        return this.f47352c.emit(null, this);
    }
}
