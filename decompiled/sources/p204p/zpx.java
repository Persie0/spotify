package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zpx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285246a;

    /* JADX INFO: renamed from: b */
    public int f285247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f285248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpx(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f285248c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285246a = obj;
        this.f285247b |= Integer.MIN_VALUE;
        return this.f285248c.emit(null, this);
    }
}
