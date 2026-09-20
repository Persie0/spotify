package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class umz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231978a;

    /* JADX INFO: renamed from: b */
    public int f231979b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f231980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umz(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f231980c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231978a = obj;
        this.f231979b |= Integer.MIN_VALUE;
        return this.f231980c.emit(null, this);
    }
}
