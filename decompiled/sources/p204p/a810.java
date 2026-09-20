package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class a810 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13167a;

    /* JADX INFO: renamed from: b */
    public int f13168b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f13169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a810(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f13169c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13167a = obj;
        this.f13168b |= Integer.MIN_VALUE;
        return this.f13169c.emit(null, this);
    }
}
