package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ear0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57717a;

    /* JADX INFO: renamed from: b */
    public int f57718b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f57719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ear0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f57719c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57717a = obj;
        this.f57718b |= Integer.MIN_VALUE;
        return this.f57719c.emit(null, this);
    }
}
