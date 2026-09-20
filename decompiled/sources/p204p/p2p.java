package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p2p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173374a;

    /* JADX INFO: renamed from: b */
    public int f173375b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f173376c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2p(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f173376c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173374a = obj;
        this.f173375b |= Integer.MIN_VALUE;
        return this.f173376c.emit(null, this);
    }
}
