package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j1c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107722a;

    /* JADX INFO: renamed from: b */
    public int f107723b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f107724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1c0(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f107724c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107722a = obj;
        this.f107723b |= Integer.MIN_VALUE;
        return this.f107724c.emit(null, this);
    }
}
