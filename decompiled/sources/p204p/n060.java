package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n060 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f148916a;

    /* JADX INFO: renamed from: b */
    public int f148917b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f148918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n060(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f148918c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f148916a = obj;
        this.f148917b |= Integer.MIN_VALUE;
        return this.f148918c.emit(null, this);
    }
}
