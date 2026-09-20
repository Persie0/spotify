package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w6w extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f248476a;

    /* JADX INFO: renamed from: b */
    public int f248477b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f248478c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6w(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f248478c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248476a = obj;
        this.f248477b |= Integer.MIN_VALUE;
        return this.f248478c.emit(null, this);
    }
}
