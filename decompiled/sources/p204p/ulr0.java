package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ulr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231622a;

    /* JADX INFO: renamed from: b */
    public int f231623b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f231624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f231624c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231622a = obj;
        this.f231623b |= Integer.MIN_VALUE;
        return this.f231624c.emit(null, this);
    }
}
