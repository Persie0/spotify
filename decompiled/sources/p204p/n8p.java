package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n8p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151573a;

    /* JADX INFO: renamed from: b */
    public int f151574b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f151575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f151575c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151573a = obj;
        this.f151574b |= Integer.MIN_VALUE;
        return this.f151575c.emit(null, this);
    }
}
