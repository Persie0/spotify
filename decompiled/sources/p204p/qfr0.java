package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qfr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188285a;

    /* JADX INFO: renamed from: b */
    public int f188286b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f188287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f188287c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188285a = obj;
        this.f188286b |= Integer.MIN_VALUE;
        return this.f188287c.emit(null, this);
    }
}
