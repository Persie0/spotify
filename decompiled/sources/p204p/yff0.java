package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yff0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f272228a;

    /* JADX INFO: renamed from: b */
    public int f272229b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f272230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yff0(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f272230c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272228a = obj;
        this.f272229b |= Integer.MIN_VALUE;
        return this.f272230c.emit(null, this);
    }
}
