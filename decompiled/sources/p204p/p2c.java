package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p2c extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173318a;

    /* JADX INFO: renamed from: b */
    public int f173319b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f173320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2c(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f173320c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173318a = obj;
        this.f173319b |= Integer.MIN_VALUE;
        return this.f173320c.emit(null, this);
    }
}
