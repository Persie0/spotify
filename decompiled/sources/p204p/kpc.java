package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kpc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125025a;

    /* JADX INFO: renamed from: b */
    public int f125026b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f125027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f125027c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125025a = obj;
        this.f125026b |= Integer.MIN_VALUE;
        return this.f125027c.emit(null, this);
    }
}
