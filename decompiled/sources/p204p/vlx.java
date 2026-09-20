package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vlx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f242613a;

    /* JADX INFO: renamed from: b */
    public int f242614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f242615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlx(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f242615c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242613a = obj;
        this.f242614b |= Integer.MIN_VALUE;
        return this.f242615c.emit(null, this);
    }
}
