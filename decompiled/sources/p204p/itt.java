package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class itt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105736a;

    /* JADX INFO: renamed from: b */
    public int f105737b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f105738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itt(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f105738c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105736a = obj;
        this.f105737b |= Integer.MIN_VALUE;
        return this.f105738c.emit(null, this);
    }
}
