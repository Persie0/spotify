package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rb90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197530a;

    /* JADX INFO: renamed from: b */
    public int f197531b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f197532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb90(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f197532c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197530a = obj;
        this.f197531b |= Integer.MIN_VALUE;
        return this.f197532c.emit(null, this);
    }
}
