package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l2p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f129059a;

    /* JADX INFO: renamed from: b */
    public int f129060b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m2p f129061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2p(m2p m2pVar, fbk fbkVar) {
        super(fbkVar);
        this.f129061c = m2pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f129059a = obj;
        this.f129060b |= Integer.MIN_VALUE;
        return this.f129061c.emit(null, this);
    }
}
