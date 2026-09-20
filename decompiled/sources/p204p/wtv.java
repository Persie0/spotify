package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wtv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f255020a;

    /* JADX INFO: renamed from: b */
    public int f255021b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f255022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtv(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f255022c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255020a = obj;
        this.f255021b |= Integer.MIN_VALUE;
        return this.f255022c.emit(null, this);
    }
}
