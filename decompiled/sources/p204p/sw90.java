package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sw90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214626a;

    /* JADX INFO: renamed from: b */
    public int f214627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f214628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw90(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f214628c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214626a = obj;
        this.f214627b |= Integer.MIN_VALUE;
        return this.f214628c.emit(null, this);
    }
}
